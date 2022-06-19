package com.basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Progtam Starts");
		String browserName="CH";
		String url="http://www.google.com";
		Ex2 obj=new Ex2();
		obj.startUp(browserName,url);
		
		System.out.println("Program End");
	}
	public void startUp(String browserName, String url) {
		WebDriver Driver=null;
		if(browserName.equalsIgnoreCase("CH")|| browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//	ChromeDriver chromeDriver =new ChromeDriver(); //open new browser
			Driver= new ChromeDriver(); 	//upcasting 			
			}
		
			else if(browserName.equalsIgnoreCase("ff")|| browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		//	FirefoxDriver firefoxDriver =new FirefoxDriver();
			Driver=new FirefoxDriver();		//upcasting
			}
			
			else if(browserName.equalsIgnoreCase("edge")|| browserName.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
				
		//		EdgeDriver EdgeDriver =new EdgeDriver();
				Driver= new EdgeDriver();	//upcasting
			}
			else {
				System.out.println("Invalid Browser name!");
			}
		Driver.get(url);
	}
	
}



