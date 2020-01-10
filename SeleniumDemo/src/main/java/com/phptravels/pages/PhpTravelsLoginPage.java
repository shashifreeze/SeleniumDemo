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
	By emailTB = By.xpath("//*[@id='toggleStyle04-collapseOne']/div/div/div[3]/div/div[1]/input");
	By passwordTB = By.xpath("//*[@id='toggleStyle04-collapseOne']/div/div/div[3]/div/div[2]/input");
	By rememberMe = By.xpath("//*[@id='toggleStyle04-collapseOne']/div/div/div[3]/div/div[3]");
	By loginButton = By.xpath("//*[@id='loginfrm']/button");
	
	//Methods to perform actions
	public void login(String email,String password)
	{
		driver.findElement(emailTB).sendKeys(email);
		driver.findElement(passwordTB).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	
}
