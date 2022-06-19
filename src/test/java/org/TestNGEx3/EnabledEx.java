package org.TestNGEx3;

import org.testng.annotations.Test;

public class EnabledEx {
	@Test(enabled=true)
	public void testMethod1() {
		System.out.println(" Test1 ");
		//testMethod2();
	}
	@Test(enabled=false)
	public void testMethod2() {
		System.out.println(" Test2 ");
	}
	@Test(enabled=true)
	public void testMethod3() {
		System.out.println(" Test3 ");
	}
	@Test(enabled=false)
	public void testMethod4() {
		System.out.println(" Test4 ");
	}


}
