package com.netcore.commonUtilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author Mohit
 *
 */

public class FileUtils 
{
	/**
	 * To get value of a key from properties file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable  {
		  
		FileInputStream fis = new FileInputStream("./testData/CommonData.properties");
		 Properties pObj = new Properties();
		 pObj.load(fis);
		 String value = pObj.getProperty(key);
	
	return value;
}

	
}