package org.TestNGEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.propertiesPractice.ConfigReader;
import org.testng.Reporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.utilities.BaseUtility;

public class ActitimeLoginEx2 {
	private ConfigReader cr;
	private String bName;
	private String url;
	private String uName;
	private String pwd;
	private WebDriver driver;
	BaseUtility bu = new BaseUtility();

	@BeforeSuite
	public void setup() {
		cr = new ConfigReader();
		bName = cr.getConfigTestData("browserName");
		url = cr.getConfigTestData("url");
		uName = cr.getConfigTestData("userName");
		pwd = cr.getConfigTestData("password");
	}

	@BeforeMethod // open Browser
	public void InitializeBrowser() {
		driver = bu.startUp(bName, url);
	}

	@Test
	public void login() {
		WebElement userNameField= driver.findElement(By.cssSelector("userName"));
		userNameField.sendKeys(uName);
		
		String actValue = userNameField.getAttribute("value");
		if(uName.equals(actValue)) {
			Reporter.log("UserName entered successfull");
		}else {
			Reporter.log("Failed to enter UserName.");
		}
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#btnLogin")).click();

		bu.waitForVisibilityofWebElementByType(driver, 10, "tagName", "a");
	}

	@Test
	public void logout() {
		login();

		driver.findElement(By.tagName("a")).click();
	}
	/*
	 * @AfterMethod //Closed Browser public void tearDown() { //tearDown method is
	 * used to quit driver driver.quit();
	 * 
	 * }
	 */
}
