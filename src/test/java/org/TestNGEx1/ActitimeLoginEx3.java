package org.TestNGEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.propertiesPractice.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.utilities.BaseUtility;

public class ActitimeLoginEx3 {
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
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#btnLogin")).click();
		bu.waitForVisibilityofWebElementByType(driver, 10, "tagName", "a");
	}
	
	@Test
	public void dashboardVerification() {
		System.out.println("Write code for dashboard......");
	}

	@AfterMethod //Closed Browser 
	public void tearDown() {		//tearDown method is used to quit driver 
		driver.findElement(By.tagName("a")).click();
		driver.quit();
	}
	@AfterSuite
	public void clearAll(){
		System.out.println("Code for clearing objects");
	}

}
