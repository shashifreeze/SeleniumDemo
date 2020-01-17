package com.shashi.toolsqa;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.shashi.main.BaseTest;
import com.shashi.toolsqa.pages.TablePage;

public class TableTest extends BaseTest{

	@Test
	public void tableTest()
	{
		TablePage tablePage = new TablePage(driver);
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		List<WebElement> rowData = tablePage.getTableRow("Burj Khalifa");
		for(WebElement we: rowData)
		{
			System.out.println(we.getText());
		}		
	}
	
	
}
