package org.TestNGEx1;

import org.testng.annotations.Test;

public class Ex1 {
	@Test
	public void testMethod1() {
		System.out.println(" Test1 ");
		testMethod2();
	}
	@Test
	public void testMethod2() {
		System.out.println(" Test2 ");
	}
}
