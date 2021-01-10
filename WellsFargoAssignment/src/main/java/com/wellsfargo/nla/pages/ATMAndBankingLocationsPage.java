package com.wellsfargo.nla.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.wellsfargo.invokeDriver.InvokeDriver;

public class ATMAndBankingLocationsPage {
	WebDriver driver=new InvokeDriver().getDriver();
	
	public String aTMAndBankingLocationsPage() {
		driver.findElement(By.xpath("//*[@href='/locator/']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//System.out.println(driver.getTitle());
		
		
		String expectedATMAndBankingLocationsPageTitle = "ATM and Bank Locations - Find Wells Fargo Bank and ATM Locations";
		String actualATMAndBankingLocationsPageTitle = driver.getTitle();
		Assert.assertEquals(actualATMAndBankingLocationsPageTitle, expectedATMAndBankingLocationsPageTitle);
		System.out.println("Actual ATM and Banking Locations Page Title:"+actualATMAndBankingLocationsPageTitle+"\nExpected ATM and Banking Locations Page Title: "+expectedATMAndBankingLocationsPageTitle+"\n\n");
		System.out.println("********************************ATM and Banking Locations Page Title Verified********************************\n\n");
		return driver.findElement(By.xpath("//*[text()='ATM and Banking Locations']")).getText();
	}
}
