package org.TestNGEx3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilities.BaseUtility;
public class DataProviderEx2  {
	@Test(dataProvider="loginCreds")
	public void Login(String uName, String pwd){
		String bName="CH";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(bName,url);
		
		System.out.println("userName = "+uName);
		System.out.println("password = "+pwd);

		Driver.findElement(By.cssSelector("#txtUsername")).sendKeys("uName");  
		Driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		Driver.findElement(By.cssSelector("#btnLogin")).click();
	}
}



