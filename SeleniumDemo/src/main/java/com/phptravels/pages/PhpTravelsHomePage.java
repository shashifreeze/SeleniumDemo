package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * @author-Shashi Kumar 
 * @page link - https://www.phptravels.net/
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
	public WebElement login()
	{
		return driver.findElement(login);
	}	
	public WebElement logout()
	{
		return driver.findElement(logOut);
	}
	
	public WebElement account()
	{
		return driver.findElement(myAccount);
	}
	public WebElement signUp()
	{
		return driver.findElement(signUp);
	}
	public WebElement aboutUs()
	{
		return driver.findElement(aboutUs);
	}
	public WebElement contact()
	{
		return driver.findElement(contact);
	}
	public WebElement tours()
	{
		return driver.findElement(tours);
	}
	public WebElement home()
	{
		return driver.findElement(home);
	}
}
