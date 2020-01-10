package com.shashi.phptravels;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.phptravels.pages.PhpTravelsHomePage;
import com.phptravels.pages.PhpTravelsLoginPage;
import com.phptravels.pages.PhpTravelsSignUpPage;
import com.shashi.main.BaseTest;
import com.shashi.utils.ExcelConfig;
import com.shashi.utils.MyUtils;

public class SignUpTest extends BaseTest{
	
	@Test(dataProvider="phptravels")
	public void signUpTest(String fName,String lName,String email,String phone,String password)
	{
		PhpTravelsHomePage homePage= new PhpTravelsHomePage(driver);
		PhpTravelsSignUpPage signUpPage = new PhpTravelsSignUpPage(driver);
		//launching the site
		driver.get("https://www.phptravels.net/");
		//clicking on account link on homePage
		homePage.clickAccount();
		//clicking on login link on homePage
		homePage.clickSignUp();
		//login into the account
		signUpPage.enterDetailsDoSignUp(fName,lName, phone, email, password);
		//verify successful signUp
		homePage.clickAccount();
		Assert.assertTrue("SignUp Successful",homePage.isLogoutDisplayed());
		
	}	

}
