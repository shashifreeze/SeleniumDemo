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
	
	// All elements of home page
	By home = By.xpath("//*[@id='mobileMenuMain']/nav/ul[1]/li/a");
	By flight = By.xpath("//*[@id='mobileMenuMain']/nav/ul[2]/li[1]/a");
	By tours = By.xpath("//*[@id='mobileMenuMain']/nav/ul[2]/li[2]/a");
	By contact = By.xpath("//*[@id='mobileMenuMain']/nav/ul[2]/li[3]/ul/li[1]/a");
	By aboutUs = By.xpath("//*[@id='mobileMenuMain']/nav/ul[2]/li[3]/ul/li[2]/a");
	By login = By.xpath("//*[@id='header-waypoint-sticky']/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]");
	By signUp = By.xpath("//*[@id='header-waypoint-sticky']/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]");
	By myAccount = By.xpath("//*[@class='dropdown dropdown-login dropdown-tab']");
	By logOut = By.xpath("//*[@class='dropdown dropdown-login dropdown-tab show']/div/div/a[2]");
	
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
