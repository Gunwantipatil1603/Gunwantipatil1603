package com.basicProgram;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Progtam Starts");
	
		String path=System.getProperty("user.dir");
		System.out.println("path ="+path);
		System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
		
		System.out.println("Program End");
		
	}
	public void openff() {
		String path=System.getProperty("user.dir");
		System.out.println("path ="+path);
		System.setProperty("webdriver.gecko.driver",path+"\\Drivers\\geckodriver.exe");
		
	}
	public void openEdge() {
		String path=System.getProperty("user.dir");
		System.out.println("path ="+path);
		System.setProperty("webdriver.edge.driver",path+"\\Drivers\\msedgedriver.exe");
		
	}

}
