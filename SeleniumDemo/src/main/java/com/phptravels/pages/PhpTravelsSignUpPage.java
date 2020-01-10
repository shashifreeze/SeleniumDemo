package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsSignUpPage {
	WebDriver driver;
	WebDriverWait wait;
	public PhpTravelsSignUpPage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}
	
	// All elements of home page
	By firstNameTB = By.xpath("//*[@id='headersignupform']/div[3]/input");
	By lastNameTB = By.xpath("//*[@id='headersignupform']/div[4]/input");
	By mobileNoTB = By.xpath("//*[@id='headersignupform']/div[5]/input");
	By emailTB = By.xpath("//*[@id='headersignupform']/div[6]/input");
	By passwordTB = By.xpath("//*[@id='headersignupform']/div[7]/input");
	By confPassTB = By.xpath("//*[@id='headersignupform']/div[8]/input");
	By signUpButton = By.xpath("//*[@id='headersignupform']/div[9]/button");
	
	//Methods to perform actions
	public void enterDetailsDoSignUp(String firstName,String lastName,String mobNum,String email,String password)
	{
		driver.findElement(firstNameTB).sendKeys(firstName);
		driver.findElement(lastNameTB).sendKeys(lastName);
		driver.findElement(mobileNoTB).sendKeys(mobNum);
		driver.findElement(emailTB).sendKeys(email);
		driver.findElement(passwordTB).sendKeys(password);
		driver.findElement(confPassTB).sendKeys(password);
		driver.findElement(signUpButton).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(signUpButton));	
	}
}
