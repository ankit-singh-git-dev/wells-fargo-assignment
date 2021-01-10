package com.wellsfargo.nla.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.wellsfargo.invokeDriver.InvokeDriver;

public class CustomerServicePage {
	WebDriver driver=new InvokeDriver().getDriver();
	
	public String customerServicePage() {
		driver.findElement(By.xpath("//*[@href='/help/']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String expectedCustomerServicePageTitle = "Customer Service – Wells Fargo";
		String actualCustomerServicePageTitle = driver.getTitle();
		Assert.assertEquals(actualCustomerServicePageTitle, expectedCustomerServicePageTitle);
		System.out.println("Actual Customer Service Page Title:"+actualCustomerServicePageTitle+" || matches with the Expected Customer Service Page Title: "+expectedCustomerServicePageTitle);
		System.out.println("********************************Customer Service Page Title Verified********************************\n\n");
		return driver.findElement(By.xpath("//*[@id='skip']")).getText();
	}
}
