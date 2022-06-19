package org.TestNGEx3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilities.BaseUtility;
public class ParallelMethod  {
	@Test
	public void LoginCH(){
		String bName="ch";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(bName,url);
	}
	public void LoginEdge(){
		String bName="edge";
		String url="https://opensource-demo.orangehrmlive.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver Driver = bu.startUp(bName,url);
	}
}



