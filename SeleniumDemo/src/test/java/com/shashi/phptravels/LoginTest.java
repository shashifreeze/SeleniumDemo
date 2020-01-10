package com.shashi.phptravels;

import org.testng.annotations.Test;

import com.phptravels.pages.PhpTravelsHomePage;
import com.phptravels.pages.PhpTravelsLoginPage;
import com.shashi.main.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test()
	public void loginTest()
	{
		PhpTravelsHomePage homePage= new PhpTravelsHomePage(driver);
		PhpTravelsLoginPage loginPage = new PhpTravelsLoginPage(driver);
		//launching the site
		driver.get("https://www.phptravels.net/");
		//clicking on account link on homePage
		homePage.clickAccount();
		//clicking on login link on homePage
		homePage.clickLogin();
		//login into the account
		loginPage.login("php1@qa.com", "Password@123");
		//verify login details
		
	}	
}
