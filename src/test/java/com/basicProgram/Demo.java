package com.basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Candy Patil/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html"); 
		

	}

}
