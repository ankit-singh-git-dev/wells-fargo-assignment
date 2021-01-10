package com.wellsfargo.testcases;
import com.wellsfargo.nla.pages.*;
import com.wellsfargo.invokeDriver.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
public class TestCases {
	 WebDriver driver;
	
	@AfterMethod
	public void navigateToSignOnPage() throws InterruptedException {
		driver.navigate().to("https://www.wellsfargo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void SignOnPage() throws Exception {
		driver = (new InvokeDriver().invokeDriver("chrome"));
		String expectedBtnText = "Sign On";
		String actualBtnText= new SignOnPage().signOnPage();
		String expectedTitle = "Wells Fargo – Banking, Credit Cards, Loans, Mortgages & More";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		System.out.println("Actual Url Title : "+driver.getTitle()+"\nExpected Title: "+expectedTitle+"\n\n");
		System.out.println("********************************Url Title Verified********************************\n\n");
		Assert.assertEquals(actualBtnText, expectedBtnText);
		System.out.println("Actual Text On Sign On Button: "+actualBtnText+"\nExpected Text On the Button: "+expectedBtnText+"\n\n");
		System.out.println("********************************Sign On Page Verified********************************\n\n");
//		driver.close();
	}
	
	@Test(priority = 2)
	public void EnrollInWellsFargoOnlinePage() {
		String expextedEnrollInWellsFargoOnlinePageHeadingText = "Enroll in Wells Fargo Online®";
		String actualEnrollInWellsFargoOnlinePageHeadingText = new com.wellsfargo.nla.pages.EnrollInWellsFargoOnlinePage().enrollInWellsFargoOnlinePage();
		Assert.assertEquals(actualEnrollInWellsFargoOnlinePageHeadingText, expextedEnrollInWellsFargoOnlinePageHeadingText);
		System.out.println("Actual Enroll in Wells Fargo Online page Heading: "+actualEnrollInWellsFargoOnlinePageHeadingText+"\nExpected Enroll in Wells Fargo Online page heading: "+expextedEnrollInWellsFargoOnlinePageHeadingText+"\n\n");
		System.out.println("********************************Enroll in Wells Fargo Online Page Verified********************************\n\n");
		driver.navigate().to("https://www.wellsfargo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test(priority = 3)
	public void CustomerServicePage() {
		
		//String expectedCustomerServicePageHeadingText =
		String actualCustomerServicePageHeadingText = new com.wellsfargo.nla.pages.CustomerServicePage().customerServicePage();
		String expectedCustomerServicePageHeadingText = "Customer Service";
		Assert.assertEquals(actualCustomerServicePageHeadingText, expectedCustomerServicePageHeadingText);
		System.out.println("Actual Customer Service Page Heading Text: "+actualCustomerServicePageHeadingText+"\nExpected Customer Service Page Heading Text: "+expectedCustomerServicePageHeadingText+"\n\n");
		System.out.println("********************************Customer Service Page Heading Text Verified********************************\n\n");
	}
	
	@Test(priority = 4)
	public void ATMAndBankingLocationsPage() {
		String actualATMAndBankingLocationsPageHeadingText = new com.wellsfargo.nla.pages.ATMAndBankingLocationsPage().aTMAndBankingLocationsPage();
		String expectedATMAndBankingLocationsPageHeadingText = "ATM and Banking Locations";
		Assert.assertEquals(actualATMAndBankingLocationsPageHeadingText, expectedATMAndBankingLocationsPageHeadingText);
		System.out.println("Actual ATM and Banking Locations Page Heading Text: "+actualATMAndBankingLocationsPageHeadingText+"\nExpected ATM and Banking Locations Page Heading Text: "+expectedATMAndBankingLocationsPageHeadingText+"\n\n");
		System.out.println("********************************ATM and Banking Locations Page Heading Text Verified********************************\n\n");
	}
	
	@Test(priority = 5)
	public void españolInicieSesión() {
		String expectedBtnText = "Inicie sesión";
		String actualBtnText= new EspañolInicieSesión().españolInicieSesión();
		Assert.assertEquals(actualBtnText, expectedBtnText);
		System.out.println("Actual Text On Inicie Sesión Button: "+actualBtnText+"\nExpected Text On the Inicie Sesión Button: "+expectedBtnText+"\n\n");
		System.out.println("********************************Inicie Sesión Page Verified********************************\n\n");
		
	}
	
	@AfterSuite
	public void CloseTheBrowser() {
		driver.close();
	}
}
