package org.propertiesPractice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.utilities.BaseUtility;
public class Ex2 {
	public static void main(String[] args) throws IOException {
		
		ConfigReader cr = new ConfigReader();
		BaseUtility bu= new BaseUtility();
		WebDriver driver=bu.startUp(
				cr.getConfigTestData("browserName"),cr.getConfigTestData("url"));
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(cr.getConfigTestData("#txtUsername"));  
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(cr.getConfigTestData("password"));
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		driver.findElement(By.tagName("a")).click();
		System.out.println("Program End");

	}
}
