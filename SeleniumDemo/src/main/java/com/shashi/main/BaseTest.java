package com.shashi.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shashi.utils.CSVConfig;
import com.shashi.utils.ExcelConfig;
import com.shashi.utils.MyUtils;
/*
 * @Author-Shashi Kumar
 * Base test for all the tests 
 */
public class BaseTest {
	
	public WebDriver driver;
	String browser;
	DesiredCapabilities capabilities;
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite--setup");
	    browser = MyUtils.getPopertyValue("useBrowser");
	    String path = MyUtils.getProjectPath();
		if(browser.equalsIgnoreCase("chrome"))
		{												  
			System.setProperty("webdriver.chrome.driver",path+"\\resources\\drivers\\chromedriver.exe");

		}else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", path+"\\resources\\drivers\\GeckoDriver.exe");
			capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette",true);
			driver= new FirefoxDriver(capabilities);
			
		}else if(browser.equalsIgnoreCase("IE")){
			
		}	
		
	}
	
	@BeforeMethod
	public void launchBrowser() {
		// launching chrome browser and setting attributes	
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver(capabilities);
			
		}else if(browser.equalsIgnoreCase("IE")){
			
		}	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("@AfterTest--closing Browser");
		driver.manage().deleteAllCookies();
		driver.close();
	}
	
}
