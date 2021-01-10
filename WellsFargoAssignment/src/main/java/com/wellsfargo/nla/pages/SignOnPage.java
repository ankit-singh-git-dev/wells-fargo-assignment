package com.wellsfargo.nla.pages;

import com.wellsfargo.invokeDriver.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOnPage {
	WebDriver driver=new InvokeDriver().getDriver();
	
	public String signOnPage() {
		driver.get("https://www.wellsfargo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//String titleSignOnPage = driver.getTitle();
		return driver.findElement(By.cssSelector("#btnSignon")).getAttribute("value");
		
	}
}
