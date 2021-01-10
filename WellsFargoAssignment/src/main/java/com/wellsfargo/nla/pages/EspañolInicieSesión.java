package com.wellsfargo.nla.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.wellsfargo.invokeDriver.InvokeDriver;

public class EspañolInicieSesión {
	WebDriver driver=new InvokeDriver().getDriver();
	
	public String españolInicieSesión() {
		driver.findElement(By.xpath("//*[text()='Español']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String expectedespañolInicieSesiónPageTitle = "Wells Fargo – Servicios bancarios, tarjetas de crédito, préstamos, préstamos hipotecarios y más";
		String actualespañolInicieSesiónPageTitle = driver.getTitle();
		System.out.println(actualespañolInicieSesiónPageTitle);
		Assert.assertEquals(actualespañolInicieSesiónPageTitle, expectedespañolInicieSesiónPageTitle);
		System.out.println("Actual español Inicie Sesión Page Title:"+actualespañolInicieSesiónPageTitle+" || matches with the Expected Español Inicie Sesión Page Title: "+expectedespañolInicieSesiónPageTitle);
		System.out.println("********************************Español Inicie Sesión Page Title Verified********************************\n\n");
		return driver.findElement(By.cssSelector("#btnSignon")).getAttribute("value");
	}
}
