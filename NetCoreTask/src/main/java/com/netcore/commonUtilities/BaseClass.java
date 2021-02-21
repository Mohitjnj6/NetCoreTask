package com.netcore.commonUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public FileUtils fLib = new FileUtils();
	public static WebDriver driver;
		
	
		@BeforeClass()
		public void configBeforeClass() throws Throwable 
		{
			String Url  = fLib.getPropertyKeyValue("url");
			String Browser  = fLib.getPropertyKeyValue("browser");

			 if(Browser.equals("chrome")) 
			 {
			    driver = new ChromeDriver();
			 }
			 else if(Browser.equals("firefox")) 
			 {
				 driver = new FirefoxDriver();
			 }
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get(Url);
		}
		
		
		@AfterClass()
		public void configAfterClass() {
		driver.quit();
	}


}