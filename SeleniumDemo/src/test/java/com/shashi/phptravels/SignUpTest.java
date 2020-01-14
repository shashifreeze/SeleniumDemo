package com.shashi.phptravels;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.phptravels.pages.PhpTravelsHomePage;
import com.phptravels.pages.PhpTravelsLoginPage;
import com.phptravels.pages.PhpTravelsSignUpPage;
import com.shashi.main.BaseTest;
import com.shashi.utils.CSVConfig;
import com.shashi.utils.ExcelConfig;
import com.shashi.utils.MyUtils;

public class SignUpTest extends BaseTest{
	
	@DataProvider(name="SignUpTest")
	public String [][] getTestData()
	{	
		return CSVConfig.getCSVData(MyUtils.getProjectPath()+"\\testDataInput\\SignUpTest.csv");
	}
	
	@Test(invocationCount=2,dataProvider = "SignUpTest")
	public void signUpTest(String fName,String lName,String email,String phone,String password)
	{
		PhpTravelsHomePage homePage= new PhpTravelsHomePage(driver);
		PhpTravelsSignUpPage signUpPage = new PhpTravelsSignUpPage(driver);
		//launching the site
		driver.get("https://www.phptravels.net/");
		//clicking on account link on homePage
		homePage.account().click();
		//clicking on login link on homePage
		homePage.signUp().click();;
		//login into the account
		signUpPage.enterDetailsDoSignUp(fName,lName, phone, MyUtils.getRandomEmail(), password);
		//verify successful signUp
		homePage.account().click();
		Assert.assertTrue("SignUp Successful",homePage.logout().isDisplayed());	
		
		
	}	
	
}
