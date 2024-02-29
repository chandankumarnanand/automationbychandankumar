package testng;

import org.testng.annotations.Test;

public class GroupExcution {
	@Test(groups="smoke")
	public void demo() {
		System.out.println("smoke testing 1");
	}
	@Test(groups="regration")
	public void demo1() {
		System.out.println("regression testing 1");
		

}
	@Test(groups="smoke")             
	public void demo2() {
		System.out.println("smoke testing 2");
	}
	@Test(groups="regration")
	public void demo3() {
		System.out.println("regration testing 2");
	}
	@Test(groups="smoke")
	public void demo4() {
		System.out.println("smoke testing 3");
	}
	@Test(groups="regration")
	public void demo5() {
		System.out.println("regration testing 3");
	}
}
		 