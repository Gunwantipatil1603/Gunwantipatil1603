package org.TestNGEx1;

import org.testng.annotations.Test;

public class PriorityEx1 {
	@Test(priority=2)
	public void CreateCustomer() {
		System.out.println(" CreateCustomer ");
		//testMethod2();
	}
	
	@Test(priority=4)
	public void DeleteCustomer() {
		System.out.println(" DeleteCustomer ");
	}
	@Test(priority=3)
	public void Updatecutomer() {
		System.out.println(" Updatecutomer ");
	}
	
	@Test(priority=1)
	public void login() {
		System.out.println(" login ");
	}
	@Test(priority=5)
	public void logout() {
		System.out.println(" logout ");
	}


}
