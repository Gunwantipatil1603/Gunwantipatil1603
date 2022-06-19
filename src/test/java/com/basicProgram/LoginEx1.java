package com.basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.BaseUtility;


public class LoginEx1 {

	public static void main(String[] args) {
		System.out.println("Progtam Starts");
		String browserName="CH";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
		
	//	WebElement userName= Driver.findElement(By.id("txtUsername"));
	//	WebElement userName= Driver.findElement(By.xpath("//input[@id=`txtUsername`]"));
		WebElement txtUsername= Driver.findElement(By.cssSelector("#txtUsername"));
		txtUsername.sendKeys("Admin");  
		
		WebElement txtPassword= Driver.findElement(By.xpath("//input[@name='txtPassword']"));
		txtPassword.sendKeys("admin123");
		
		WebElement Submit= Driver.findElement(By.cssSelector("#btnLogin"));
		Submit.click();
		
		System.out.println("Program End");
		
			
			

		}
		
		
	}
