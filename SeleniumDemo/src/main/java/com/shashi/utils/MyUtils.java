package com.shashi.utils;

import java.io.FileReader;
import java.util.Properties;
import java.util.Random;

/*
 * @Author-Shashi kumar
 * 
 */
public class MyUtils {

	// creating random emails
	public static String getRandomEmail() {
		Random r = new Random();
		int ranNo = r.nextInt(10000);
		return "Php" + ranNo + "@qa.com";
	}

	public static String getPopertyValue(String key) {
		try{
			FileReader reader = new FileReader("C:\\Users\\skuma545\\shashi\\git\\SeleniumDemo\\src\\main\\java\\com\\shashi\\utils\\config.property");
			Properties p = new Properties();
			p.load(reader);
			String value =  p.getProperty(key);
			reader.close();
			return value;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
}
