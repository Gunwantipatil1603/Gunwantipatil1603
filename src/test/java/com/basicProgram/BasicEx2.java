package com.basicProgram;

import org.openqa.selenium.WebDriver;

import com.utilities.BaseUtility;


public class BasicEx2 {

		public static void main(String[] args) {
			System.out.println("Progtam Starts");
			String browserName="CH";
			String url="https://opensource-demo.orangehrmlive.com/";
			BaseUtility bu=new BaseUtility();
			WebDriver Driver = bu.startUp(browserName,url);
			
			String ExpUrl = "https://opensource-demo.orangehrmlive.com/";
			String actUrl = Driver.getCurrentUrl();			
			if(ExpUrl.equals(actUrl)) {
				System.out.println("Login url matched");
			}else {
				System.out.println("Login url not matched");
			}
			String actTitle= Driver.getTitle();
			System.out.println("acttitle"+actTitle);
			System.out.println("Program End");
		}
		
		
	}
