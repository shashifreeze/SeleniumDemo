package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhpTravelsLoginPage {
	WebDriver driver;
	public PhpTravelsLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// All elements of home page
	By emailTB = By.xpath("//input[@type='email'][@name='username']");
	By passwordTB = By.xpath("//input[@type='password'][@name='password']");
	By rememberMe = By.xpath("//input[@type='checkbox'][@name='remember']");
	By loginButton = By.xpath("//button[@type='submit'][contains(text(),'Login')]");
	
	//Methods to perform actions
	public void login(String email,String password)
	{
		driver.findElement(emailTB).sendKeys(email);
		driver.findElement(passwordTB).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	
}
