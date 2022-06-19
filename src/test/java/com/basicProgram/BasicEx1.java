package com.basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.BaseUtility;


public class BasicEx1 {

		public static void main(String[] args) {
			System.out.println("Progtam Starts");
			String browserName="CH";
			String url="https://www.google.com";
			BaseUtility bu=new BaseUtility();
			bu.startUp(browserName,url);
			
			System.out.println("Program End");
		}
		
		
	}
