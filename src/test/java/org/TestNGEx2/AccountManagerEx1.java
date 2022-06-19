package org.TestNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountManagerEx1 {
	@Test
	public void addCustomer() {
		System.out.println("Add Account");
	}

	@Test
	public void deleteAccount() {
		System.out.println("deleteAccount");
	}
	@Test
	public void updateAccount() {
		System.out.println("updateAccount");
	}
	@BeforeClass
	public void getAccountTestData() {
		System.out.println("** Account Test Data **");
	}
	@AfterClass
	public void ClearAccountTestDataObject() {
		System.out.println("** clearAccount Test Data **");
	}

}
