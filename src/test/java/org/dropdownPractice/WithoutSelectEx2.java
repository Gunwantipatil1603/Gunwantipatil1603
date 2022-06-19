package org.dropdownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.BaseUtility;

public class WithoutSelectEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Progtam Starts");
		String browserName="CH";
		String url="https://demoqa.com/select-menu";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
		WebElement ele = Driver.findElement(By.xpath
				("//div[contains(@class,'css-1wa3eu0-placeholder')][3]"));
		bu.ScrollTillElementByJs(Driver,ele);
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//div[@class=' css=11unzgr']/div[text()='Red']")).click();
		Driver.findElement(By.xpath("//div[@class=' css=11unzgr']/div[text()='Black']")).click();
		Driver.getPageSource();
	}

}
