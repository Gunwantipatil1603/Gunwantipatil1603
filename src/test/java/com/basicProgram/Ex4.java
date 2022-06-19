package com.basicProgram;

import org.openqa.selenium.WebDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;


public class Ex4 {

		public static void main(String[] args) {
			System.out.println("Progtam Starts");
			String browserName="CH";
			String url="http://www.google.com";
			Ex4 obj=new Ex4();
			obj.startUp(browserName,url);
			
			System.out.println("Program End");
		}
		public void startUp(String browserName, String url) {
			WebDriver Driver=null;
			if(browserName.equalsIgnoreCase("CH")|| browserName.equalsIgnoreCase("chrome")) {
			//	WebDriverManager.chromedriver().setup(); //download exe file automatically
			//	Driver= new ChromeDriver();	//upcasting			
			//	Driver = WebDriverManager.chromedriver().create();
			}
			
				else if(browserName.equalsIgnoreCase("ff")|| browserName.equalsIgnoreCase("firefox")) {
				//WebDriverManager.firefoxdriver().setup();
					//	Driver=new FirefoxDriver(); //upcasting
						
					//	Driver = WebDriverManager.firefoxdriver().create();
				}
				
				else if(browserName.equalsIgnoreCase("edge")|| browserName.equalsIgnoreCase("Edge")) {
				//	WebDriverManager.edgedriver().setup();
				//	Driver= new EdgeDriver(); //upcasting
				//	Driver = WebDriverManager.edgedriver().create();
				}
			
				else {
					System.out.println("Invalid Browser name!");
				}
			Driver.get(url);
		}
		
	}