package org.TestNGEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManagerEx2 {
	@Test
	public void addCustomer() {
		System.out.println("Add Account");
	}

	@Test
	public void deleteAccount() {
		System.out.println("Add deleteAccount");
	}
	@Test
	public void updateAccount() {
		System.out.println("updateCustomer");
	}
	@BeforeTest
	public void getAccountTestData() {
		System.out.println("* QA Environment details *");
	}
	@AfterTest
	public void ClearAccountTestDataObject() {
		System.out.println("** clear QA Test Data **");
	}

}
