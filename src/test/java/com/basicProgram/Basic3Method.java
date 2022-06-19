package com.basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.BaseUtility;


public class Basic3Method {

	public static void main(String[] args) {
		System.out.println("Progtam Starts");
		String browserName="CH";
		String url="https://demoqa.com/radio-button";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
		WebElement yesRbtn =Driver.findElement(By.id("yesRadio"));
		System.out.println(yesRbtn.isEnabled());
		if(yesRbtn.isEnabled()) {
	//	yesRbtn.click();
		bu.clickByJS(yesRbtn, Driver);
		}
		System.out.println(yesRbtn.isSelected());
		
	/*	WebElement yesLabel =Driver.findElement(By.cssSelector("label[for='yesRbtn']"));
		System.out.println(yesLabel.isDisplayed());*/
		System.out.println("Program End");
	}
	
		
		
	}

	
		
	
	
		
	
