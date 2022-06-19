package org.dropdownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.BaseUtility;

public class WithoutSelectEx1 {

	public static void main(String[] args) {
		System.out.println("Progtam Starts");
		String browserName="CH";
		String url="https://demoqa.com/select-menu";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(browserName,url);
		
		WebElement ele = Driver.findElement(By.xpath("//div[text()='Select Option']"));
		ele.click();
		
		System.out.println(Driver.getPageSource());
		Driver.findElement(By.xpath("//*[text()='Group 1, option 2']")).click();
	
	}

}
