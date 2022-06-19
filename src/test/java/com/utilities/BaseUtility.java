package com.utilities;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
		
		public WebDriver startUp(String browserName, String url) {
			WebDriver Driver=null;
			if(browserName.equalsIgnoreCase("CH")|| browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				Driver= new ChromeDriver();	//upcasting	
				
				}
			
				else if(browserName.equalsIgnoreCase("ff")|| browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
						Driver=new FirefoxDriver(); //upcasting
				}
				
				else if(browserName.equalsIgnoreCase("edge")|| browserName.equalsIgnoreCase("Edge")) {
					System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
					Driver= new EdgeDriver(); //upcasting
				}
			
				else {
					System.out.println("Invalid Browser name!");
				}
			Driver.manage().window().maximize();		//window maximize
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Driver.manage().window().setSize(new Dimension(250,250));
			Driver.get(url);	
			return Driver;
		}
		public void waitForVisibilityofWebElementByType(WebDriver driver,int time,String LocatorType,String Value) {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(30));
			switch(LocatorType) {
			case "Xpath":wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Value)));
			break;
			case "css":wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Value)));
			break;
			case "id":wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(Value)));
			break;
			}
		}
		public void waitForVisibilityofWebElement(WebDriver driver,int time,WebElement ele) {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
			wt.until(ExpectedConditions.visibilityOf(ele));
		}
		public void clickByJS(WebElement ele, WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeScript("arguments[0].click();", ele);
		}
		public void ScrollTillElementByJs(WebDriver driver, WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeScript("arguments[0].ScrollIntoView(true)", ele);
		}
		public void ScrollByPageDown(WebElement ele, WebDriver driver, int num) {
			for(int i=1; i<=num; i++) {
				driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
			}
		
		}
		



}

