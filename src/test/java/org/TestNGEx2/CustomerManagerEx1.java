package org.TestNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerManagerEx1 {
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
	@BeforeClass
	public void getCustomerTestData() {
		System.out.println("** Cutomer Test Data **");
	}
	@AfterClass
	public void ClearCustomerTestDataObject() {
		System.out.println("** clear Cutomer Test Data **");
	}

}
