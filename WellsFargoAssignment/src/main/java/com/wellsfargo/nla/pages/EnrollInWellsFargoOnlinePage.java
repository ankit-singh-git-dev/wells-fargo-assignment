package com.wellsfargo.nla.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.wellsfargo.invokeDriver.InvokeDriver;

public class EnrollInWellsFargoOnlinePage {
	WebDriver driver=new InvokeDriver().getDriver();
	public String enrollInWellsFargoOnlinePage() {
		driver.findElement(By.xpath("(//*[@href=\'https://oam.wellsfargo.com/oamo/identity/enrollment\'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String expextedPageTitle = "Enroll in Wells Fargo Online® - Enroll in <span lang='en'>Wells Fargo Online</span>";
		Assert.assertEquals(driver.getTitle(),expextedPageTitle );
		System.out.println("Actual Page Title: "+driver.getTitle()+" || matches the Expected Page Title: "+expextedPageTitle);
		 
		return driver.findElement(By.xpath("//*[@id=\'identificationForm\']/h1")).getText();
		
	}
}
