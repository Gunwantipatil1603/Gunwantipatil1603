package com.basicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.BaseUtility;


public class LoginEx2 {

	public static void main(String[] args) {
		System.out.println("Progtam Starts");
		String browserName="CH";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
		
		Driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");  
		
		Driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		Driver.findElement(By.cssSelector("#btnLogin")).click();
	
	//	Driver.findElement(By.linkText("Logout")).click();
		
	//	bu.waitForVisibilityofWebElementByType();	
		
//		WebDriverWait wt = new WebDriverWait(Driver,Duration.ofSeconds(30));
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a")));
		bu.waitForVisibilityofWebElementByType(Driver, 10, "tagName", "a");

		Driver.findElement(By.tagName("a")).click();
		System.out.println("Program End");
	}
	
		
		
	}

	
		
	
	
		
	
