package com.phptravels.manage;

import org.openqa.selenium.WebDriver;

public class PhptravelsAccountManager {

	WebDriver driver;
	public PhptravelsAccountManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//verify whether already a user is logged in or not if logged in then log out
	public boolean verifyAlreadyLoggedIn()
	{
		return true;
	}
	
	
}
