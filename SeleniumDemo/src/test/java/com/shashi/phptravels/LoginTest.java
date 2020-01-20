package com.shashi.phptravels;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.phptravels.pages.PhpTravelsHomePage;
import com.phptravels.pages.PhpTravelsLoginPage;
import com.shashi.main.WebBaseTest;
import com.shashi.utils.CSVConfig;
import com.shashi.utils.MyUtils;

public class LoginTest extends WebBaseTest{
	
	@DataProvider(name="phptravels")
	public String [][] getTestData()
	{
		return CSVConfig.getCSVData(MyUtils.getProjectPath()+"\\testDataInput\\LoginTest.csv");
	}
	
	@Test(dataProvider = "phptravels")
	public void loginTest(String email,String password)
	{
		PhpTravelsHomePage homePage= new PhpTravelsHomePage(driver);
		PhpTravelsLoginPage loginPage = new PhpTravelsLoginPage(driver);
		//launching the site
		driver.get("https://www.phptravels.net/");
		//clicking on account link on homePage
		homePage.account().click();;
		//clicking on login link on homePage
		homePage.login().click();;
		//login into the account
		loginPage.login(email, password);
		//verify login details
		homePage.account().click();;
		Assert.assertTrue("login Successful",homePage.logout().isDisplayed());
		
	}	
}
