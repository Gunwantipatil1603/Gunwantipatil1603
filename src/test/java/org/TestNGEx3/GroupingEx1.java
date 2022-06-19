package org.TestNGEx3;

import org.testng.annotations.Test;

public class GroupingEx1 {

	@Test(groups= {"somke"})
	public void umtest1() {
		System.out.println("User Test 1");
		//testMethod2();
	}

	@Test(groups= {"Regrassion"})
	public void umtest2() {
		System.out.println(" User Test 2 ");
	}
	@Test(groups= {"UAT"})
	public void umtest3() {
		System.out.println(" User Test 3 ");
	}
	@Test(groups= {"somke","Regrassion"})
	public void umtest5() {
		System.out.println(" User Test 4 ");
	}
	@Test(groups= {"Regrassion","UTA"})
	public void umtest6() {
		System.out.println(" User Test 5 ");
	}
	@Test(groups= {"somke","UAT"})
	public void umtest7() {
		System.out.println(" User Test 6 ");
	}
	@Test
	public void umtest8() {
		System.out.println(" User Test 7 ");
	}


}
