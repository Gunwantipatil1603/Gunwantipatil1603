package org.TestNGEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerManagerEx2 {
	@Test
	public void addCustomer() {
		System.out.println("Add Cutomer");
	}

	@Test
	public void deleteCustomer() {
		System.out.println("deleteCustomer");
	}
	@Test
	public void updateCustomer() {
		System.out.println("updateCustomer");
	}
	@BeforeTest
	public void getCustomerTestData() {
		System.out.println("**Dev environment details **");
	}
	@AfterTest
	public void ClearCustomerTestDataObject() {
		System.out.println("** clear dev details **");
	}

}
