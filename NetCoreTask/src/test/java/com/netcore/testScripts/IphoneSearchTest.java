package com.netcore.testScripts;

import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.netcore.commonUtilities.BaseClass;
import com.netcore.commonUtilities.FileUtils;
import com.netcore.commonUtilities.JavaUtils;
import com.netcore.ObjectsRepository.FlipkartHomePage;
import com.opencsv.CSVWriter;

/**
 * Script to find Iphone under the price of 40,000/-
 * from Flipkart Search.
 * 
 * @author Mohit
 *
 */
public class IphoneSearchTest extends BaseClass
{
	public FileUtils fLib = new FileUtils();
	public JavaUtils jLib = new JavaUtils();
	@Test
	public void iPhoneSearchTest() throws Throwable
	{
		
		FlipkartHomePage fhp=new FlipkartHomePage(driver);
		
		/*cross the login pop up*/
		fhp.getLoginPopup().click();
		
		/*Search for iPhone under 40000 */
		fhp.getSearchBox().sendKeys(fLib.getPropertyKeyValue("search"),Keys.ENTER);
		
		/*verification*/
		WebElement SearchStatus = fhp.getSearchStatus();
		Assert.assertEquals(SearchStatus.isDisplayed(), true);
		
		/*adding device list, price list & ratings list in different Lists*/
		List<WebElement> devicelist = fhp.getiPhoneDevices();
		List<WebElement> pricelist = fhp.getiPhonePrice();
		List<WebElement> ratingslist = fhp.getiPhoneRatings();
		
		/*Creating header and fetching data from device list, price list & ratings list*/
		String[] header = {"Device Details", "Price", "Ratings"};
		List<String[]> list = new ArrayList<>();
		list.add(0,header);
		for(int i=0;i<devicelist.size();i++)
		{
			int price = jLib.stringParseIntoIntPrice((pricelist.get(i).getText()));
			int priceCap = jLib.stringParseIntoIntPrice(fLib.getPropertyKeyValue("priceLimit"));
			
			/*condition for filtering iPhone Price from fetched results and finally adding into list of String Array*/
			if (price<=priceCap) 
			{
			String[] row = {devicelist.get(i).getText(),
							 pricelist.get(i).getText().substring(1),
							 ratingslist.get(i).getText()};
			list.add(i+1, row);
			}
			
		}
		
		/*Creating csv file and putting list value into it*/
		CSVWriter writerCsv = new CSVWriter(new FileWriter(fLib.getPropertyKeyValue("path")));
		writerCsv.writeAll(list);
		writerCsv.close();
	}
		

}