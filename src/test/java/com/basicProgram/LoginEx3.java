package com.basicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.BaseUtility;


public class LoginEx3 {

	public static void main(String[] args) {
		System.out.println("Progtam Starts");
		String browserName="edge";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
		
		Driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");  
		
		Driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		Driver.findElement(By.cssSelector("#btnLogin")).click();
	
		bu.waitForVisibilityofWebElementByType(Driver, 10, "tagName", "a");
		
		List<WebElement> tabs=
				Driver.findElements(By.id("mainMenu"));
		System.out.println("Total tabs : "+tabs.size());
		 
		String str="";
		for(int i=0; i<tabs.size();i++) {
			str=tabs.get(i).getAttribute("class");
			if(str.contains("menu")) {
				System.out.println("tab number selected :"+(i+1));
				String str1=Driver.findElements(
						By.id("menu_pim_viewPimModule")).get(i).getText();
						System.out.println("Selected tab : "+str1);
			}
		}
		

		Driver.findElement(By.tagName("a")).click();
		System.out.println("Program End");
	}
	
		
		
	}

	
		
	
	
		
	
