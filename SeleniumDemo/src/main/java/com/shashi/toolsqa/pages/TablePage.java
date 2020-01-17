package com.shashi.toolsqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePage {

	WebDriver driver;
	
	public TablePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public List<WebElement> getTableRow(String text)
	{
		By tableHead = By.xpath("//tr//th[contains(text(),'"+text+"')]//..//td");
		return driver.findElements(tableHead);	
	}
	
	
}
