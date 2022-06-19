package org.propertiesPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.BaseUtility;

public class Ex1 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("./PropertiesFiles/Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String bName=prop.getProperty("browserName");
		String url=prop.getProperty("url");
		String uName=prop.getProperty("userName");
		String pwd=prop.getProperty("password");
		
		
		BaseUtility bu= new BaseUtility();
		WebDriver driver=bu.startUp(bName, url);
	
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");  
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		driver.findElement(By.tagName("a")).click();
		System.out.println("Program End");

	}
}
