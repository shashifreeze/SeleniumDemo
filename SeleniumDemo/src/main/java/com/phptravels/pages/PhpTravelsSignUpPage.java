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
	By firstNameTB = By.xpath("//input[@type='text'][@name='firstname']");
	By lastNameTB = By.xpath("//input[@type='text'][@name='lastname']");
	By mobileNoTB = By.xpath("//input[@type='text'][@name='phone']");
	By emailTB = By.xpath("//input[@type='text'][@name='email']");
	By passwordTB = By.xpath("//input[@type='password'][@name='password']");
	By confPassTB = By.xpath("//input[@type='password'][@name='confirmpassword']");
	By signUpButton = By.xpath("//button[@type='submit']");
	
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
