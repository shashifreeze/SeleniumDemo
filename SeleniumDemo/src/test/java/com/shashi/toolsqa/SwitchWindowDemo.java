package com.shashi.toolsqa;

import org.testng.annotations.Test;

import com.shashi.main.BaseTest;
import com.shashi.toolsqa.pages.DemoQAPage;
import com.shashi.toolsqa.pages.WindowSwitchPage;

public class SwitchWindowDemo extends BaseTest {

	@Test
	public void switchWindow() {
		DemoQAPage demoQAPage = new DemoQAPage(driver);
		WindowSwitchPage windowSwitchPage = new WindowSwitchPage(driver);
		// setting URL
		driver.get("https://demoqa.com/autocomplete/");

		// go to switch window page
		demoQAPage.switchWindow().click();

		// click on new browser window
		windowSwitchPage.newBrowserWindow().click();

		// getting current window handle
		String handle = driver.getWindowHandle();// Return a string of
													// alphanumeric window
													// handle

		// printing title of current window
		System.out.println("Before : " + driver.getTitle());

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// maximize
		driver.manage().window().maximize();

		// printing title of current window
		System.out.println("After : " + driver.getTitle());

		// go to default window
		driver.switchTo().window(handle);

		// printing title of current window
		System.out.println("Current window title : " + driver.getTitle());
		

		// click on new message window
		windowSwitchPage.newMessageWindow().click();

		// Switch to new window opened
		 Object[] allWindows = driver.getWindowHandles().toArray();
		driver.switchTo().window(allWindows[2].toString());
		
		// printing title of current window
		System.out.println("Title after switching : " + driver.getTitle());
		
		// verify the text message of new window
		String windowMsg = windowSwitchPage.newMessageWindowText().getText();
		
		// printing title of current window
		System.out.println("Window message: " + windowMsg);
		
		
	}
}
