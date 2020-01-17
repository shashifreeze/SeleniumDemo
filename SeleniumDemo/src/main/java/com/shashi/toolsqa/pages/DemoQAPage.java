package com.shashi.toolsqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * Page link - https://demoqa.com/autocomplete/
 * 
 * 
 */
public class DemoQAPage {
	 
	WebDriver driver;
	
	public DemoQAPage(WebDriver driver)
	{
		this.driver = driver;
	}

	By interactions = By.xpath("//a[@title='Interactions' and @href='https://demoqa.com/category/interactions/']");
	By widget = By.xpath("//a[@title='Widgets' and @href='https://demoqa.com/category/widgets/']");
	By sortable = By.xpath("//a[@href='https://demoqa.com/sortable/' and contains(.,'Sortable')]");
	By selectable = By.xpath("//a[@href='https://demoqa.com/selectable/' and contains(.,'Selectable')]");
	By resizable = By.xpath("//a[@href='https://demoqa.com/resizable/' and contains(.,'Resizable')]");
	By droppable = By.xpath("//a[@href='https://demoqa.com/droppable/' and contains(.,'Droppable')]");
	By draggable = By.xpath("//a[@href='https://demoqa.com/draggable/' and contains(.,'Draggable')]");
	By htmlContactForm = By.xpath("//a[@href='https://demoqa.com/html-contact-form/' and contains(.,'HTML contact form')]");
	By keyBoardEvents = By.xpath("//a[@href='https://demoqa.com/keyboard-events/' and contains(.,'Keyboard Events')]");
	By switchWindow = By.xpath("//a[@href='https://demoqa.com/automation-practice-switch-windows/' and contains(.,'Automation Practice Switch Windows')]");
	By keyBoardEventSimpleForm = By.xpath("//a[@href='https://demoqa.com/keyboard-events-sample-form/' and contains(.,'Keyboard Events Sample Form')]");
	By toolTipAndDoubleClick = By.xpath("//a[@href='https://demoqa.com/tooltip-and-double-click/' and contains(.,'Tooltip and Double click')]");
	By toolTip = By.xpath("//a[@href='https://demoqa.com/tooltip/' and contains(.,'Tooltip')]");
	
	public WebElement interactions()
	{
		return driver.findElement(interactions);
	}
	public WebElement widget()
	{
		return driver.findElement(widget);
	}
	public WebElement sortable()
	{
		return driver.findElement(sortable);
	}
	public WebElement selectable()
	{
		return driver.findElement(selectable);
	}
	public WebElement resizable()
	{
		return driver.findElement(resizable);
	}
	public WebElement droppable()
	{
		return driver.findElement(droppable);
	}
	public WebElement draggable()
	{
		return driver.findElement(draggable);
	}
	public WebElement htmlContactForm()
	{
		return driver.findElement(htmlContactForm);
	}
	public WebElement keyBoardEvents()
	{
		return driver.findElement(keyBoardEvents);
	}
	public WebElement switchWindow()
	{
		return driver.findElement(switchWindow);
	}
	public WebElement keyBoardEventSimpleForm()
	{
		return driver.findElement(keyBoardEventSimpleForm);
	}
	public WebElement toolTipAndDoubleClick()
	{
		return driver.findElement(toolTipAndDoubleClick);
	}
	public WebElement toolTip()
	{
		return driver.findElement(toolTip);
	}	
}
