package com.shashi.toolsqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowSwitchPage {
	
	WebDriver driver;
	
	public WindowSwitchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By newMessageWindowText = By.xpath("//body");
	By newBrowserWindow = By.xpath("//button[@id='button1']");
	By newMessageWindow = By.xpath("//button[contains(text(),'New Message Window')]");
	By newBrowserTab = By.xpath("//button[contains(text(),'New Browser Tab')]");
	By iHaveARandomId = By.xpath("//p[contains(@id,'0.')]");
	By alertBox = By.xpath("//button[@id = 'alert']");
	
	public WebElement newBrowserWindow()
	{
		return driver.findElement(newBrowserWindow);
	}
	
	public WebElement newMessageWindow()
	{
		return driver.findElement(newMessageWindow);
	}
	public WebElement newBrowserTab()
	{
		return driver.findElement(newBrowserTab);
	}
	public WebElement iHaveARandomId()
	{
		return driver.findElement(iHaveARandomId);
	}
	public WebElement alertBox()
	{
		return driver.findElement(alertBox);
	}
	public WebElement newMessageWindowText()
	{
		return driver.findElement(newMessageWindowText);
	}
	
}
