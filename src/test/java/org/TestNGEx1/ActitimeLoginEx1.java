package org.TestNGEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.propertiesPractice.ConfigReader;
import org.testng.annotations.Test;

import com.utilities.BaseUtility;

public class ActitimeLoginEx1 {
	@Test
	public void login() {
		ConfigReader cr = new ConfigReader();
		String bName = cr.getConfigTestData("browserName");
		String url = cr.getConfigTestData("url");
		String uName = cr.getConfigTestData("userName");
		String pwd = cr.getConfigTestData("password");

		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.startUp(bName, url);


		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#btnLogin")).click();


		//Driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");  
		// Driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		// Driver.findElement(By.cssSelector("#btnLogin")).click();
		bu.waitForVisibilityofWebElementByType(driver, 10, "tagName", "a");
		driver.findElement(By.tagName("a")).click();

	}

}
