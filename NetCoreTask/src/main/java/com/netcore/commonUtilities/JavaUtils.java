package com.netcore.commonUtilities;
/**
 * 
 * @author Mohit
 *
 */
public class JavaUtils 
{
	/**
	 * To remove [₹,] special character and after that 
	 * To convert string value into Integer
	 * example:  "₹99,999" = 99999
	 * @param value
	 * @return
	 */
	public int stringParseIntoIntPrice(String value)
	{
	 String str = value;
	 String str1 = str.replaceAll("[₹,]", "");
		int num = Integer.parseInt(str1);
		return num;
	}
	
	/**
	 * 
	 * To convert string value into Integer
	 * example:  "999" = 999
	 * @param value
	 * @return
	 */
	public int stringParseIntoInt(String value)
	{
	 String str = value;
		int num = Integer.parseInt(str);
		return num;
	}
	
}
