package org.TestNGEx3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.utilities.BaseUtility;

public class DataProviderEx1  {
	@Test(dataProvider="loginCreds")
	public void Login(String uName, String pwd){
		String browserName="CH";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);

		Driver.findElement(By.cssSelector("#txtUsername")).sendKeys("uName");  

		Driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

		Driver.findElement(By.cssSelector("#btnLogin")).click();
	}
	@DataProvider
	public Object[ ][ ] loginCreds() {
		Object[][] testData=new Object[4][2];
		testData[0][0]="admin";
		testData[0][1]="admin123";

		testData[1][0]="admin1";
		testData[1][1]="Manager";

		testData[2][0]="admin";
		testData[2][1]="Manager1";

		testData[3][0]="admin5";
		testData[3][1]="Manager5";

		return testData;
	}
}



