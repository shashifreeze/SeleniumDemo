package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * @author-Shashi Kumar 
 * 
 */
public class PhpTravelsHomePage {

	WebDriver driver;
	WebDriverWait wait;
	public PhpTravelsHomePage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}
	
	/*
	 * Relative xpaths for home button
	 * 
		//a[@title='home']
		//a[@href='https://www.phptravels.net/'] [@title='home']
		//a[@href='https://www.phptravels.net/' and @title='home']
		//a[text()='Home']
		//*[@id="mobileMenuMain"]//a[@title='home']
		//a[contains(text(),'Ho')]
		//a[contains(@title,'ho')]
		//a[contains(@href,'php') and @title='home']
		//a[starts-with(@title,'hom')]
	 * 
	 */
	
	// All elements of home page
	By home = By.xpath("//a[@href='https://www.phptravels.net/'] [@title='home']");
	By flight = By.xpath("//ul[@class='main-nav']//a[contains(text(),'Flights')]");
	By tours = By.xpath("//ul[@class='main-nav']//a[contains(text(),'Tours')]");
	By contact = By.xpath("//a[contains(text(),'Contact')]");
	By aboutUs = By.xpath("//a[contains(text(),'About Us')]");
	By login = By.xpath("//a[@class='dropdown-item active tr' and contains(text(),'Login')]");
	By signUp = By.xpath("//a[@class='dropdown-item tr' and contains(text(),'Sign Up')]");
	By myAccount = By.xpath("//a[@id='dropdownCurrency' ]//i[@class='bx bx-user']");
	By logOut = By.xpath("//a[@class='dropdown-item tr' and contains(text(),'Logout')]");
	
	//Methods to perform actions
	public void clickLogin()
	{
		driver.findElement(login).click();
	}	
	public void clickLogout()
	{
		driver.findElement(logOut).click();
	}
	public boolean isLogoutDisplayed()
	{
		return driver.findElement(logOut).isDisplayed();
	}
	public void clickAccount()
	{
		driver.findElement(myAccount).click();
	}
	public void clickSignUp()
	{
		driver.findElement(signUp).click();
	}
	public void clickAboutUs()
	{
		driver.findElement(aboutUs).click();
	}
	public void clickContact()
	{
		driver.findElement(contact).click();
	}
	public void clickTours()
	{
		driver.findElement(tours).click();
	}
	public void clickHome()
	{
		driver.findElement(home).click();
	}
}
