package org.TestNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.utilities.BaseUtility;

public class InnovacationCountEx {
	@Test(invocationCount=5, threadPoolSize=2)
	public void createCustomer(){
		String browserName="CH";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
//		String ExpUName= configReader.cr.getProperty("UName");
		Driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");  
		
		Driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		Driver.findElement(By.cssSelector("#btnLogin")).click();
	
		
	}
}