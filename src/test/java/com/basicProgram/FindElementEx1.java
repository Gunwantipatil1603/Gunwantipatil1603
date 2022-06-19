package com.basicProgram;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utilities.BaseUtility;


public class FindElementEx1 {

	public static void main(String[] args) {
		System.out.println("Progtam Starts");
		String browserName="CH";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
		
		List<WebElement> listOfEle= Driver.findElements(By.id("username123"));
		System.out.println("total object : "+listOfEle.size());
		System.out.println("isEmpty : "+listOfEle.isEmpty());
		if(!listOfEle.isEmpty()) {
			listOfEle.get(0).sendKeys("admin");
		}
//		WebElement ele=Driver.findElement(By.id("username123"));
//		ele.sendKeys("admin");
		System.out.println("Program End");
	}
	
		
		
	}

	
		
	
	
		
	
