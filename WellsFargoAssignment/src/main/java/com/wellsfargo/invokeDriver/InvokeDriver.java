package com.wellsfargo.invokeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeDriver {
	static WebDriver driver;
	public WebDriver invokeDriver(String browser) throws Exception{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJPOOT BHAI\\eclipse-workspace\\WellsFargoAssignment\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			
		}
		return driver;
			
	}
	public WebDriver getDriver() {
		return driver;
	}
}
