package com.netcore.ObjectsRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Mohit
 *
 */
public class FlipkartHomePage 
{
	@FindBy(xpath="//button[text()='✕']")
	private WebElement loginPopup;
	
	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	private WebElement searchBox;
	
	@FindBy(xpath="//span[contains(text(),'Showing 1 – 24')]")
	private WebElement searchStatus;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private List<WebElement> iPhoneDevices;
	
	@FindBy(xpath="//span[contains(text(),'Ratings')]")
	private List<WebElement> iPhoneRatings;
	
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> iPhonePrice;

	
	
	public WebElement getLoginPopup() {
		return loginPopup;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchStatus() {
		return searchStatus;
	}

	public List<WebElement> getiPhoneDevices() {
		return iPhoneDevices;
	}

	public List<WebElement> getiPhoneRatings() {
		return iPhoneRatings;
	}

	public List<WebElement> getiPhonePrice() {
		return iPhonePrice;
	}

	
	
	

	public FlipkartHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	

}