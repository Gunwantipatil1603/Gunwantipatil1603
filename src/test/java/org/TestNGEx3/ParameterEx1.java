package org.TestNGEx3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utilities.BaseUtility;

public class ParameterEx1  {
	@Parameters({"username","Password","bName"})
	@Test
	public void Login(String uName, String pwd, String bName){
		String browserName="CH";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
		
		System.out.println("userName = "+uName);
		System.out.println("Password = "+pwd);
		System.out.println("bName = "+bName);
		
		Driver.findElement(By.cssSelector("#txtUsername")).sendKeys("uName");  
		Driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		Driver.findElement(By.cssSelector("#btnLogin")).click();
	}
}



