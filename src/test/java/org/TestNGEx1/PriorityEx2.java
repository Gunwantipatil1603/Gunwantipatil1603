package org.TestNGEx1;

import org.testng.annotations.Test;

public class PriorityEx2 {
	@Test(priority=0)
	public void CreateCustomer() {
		System.out.println(" Test1 ");
		//testMethod2();
	}
	@Test(priority=0)
	public void createCustomer() {
		System.out.println(" createCustomer ");
	}
	@Test
	public void DeleteCustomer() {
		System.out.println(" DeleteCustomer ");
	}
	@Test
	public void deleteCutomer() {
		System.out.println(" deleteCutomer ");
	}
	@Test(priority=1)
	public void Updatecutomer() {
		System.out.println(" Updatecutomer ");
	}
	@Test(priority=4)
	public void updateCutomer() {
		System.out.println(" updateCutomer ");
	}
	@Test(priority=3)
	public void login() {
		System.out.println(" login ");
	}
	@Test(priority=100)
	public void logout() {
		System.out.println(" logout ");
	}


}
