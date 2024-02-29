package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssort {
	@Test(priority=1)
	public void demo() {
		String a="Qspider";
		String b="Qspider";
		Assert.assertEquals(a, b);
		System.out.println("control come next   line after cheking string value");
		

}
	@Test
	public void demo1() {
		String a="Qspider";
		String b="spider";
		Assert.assertTrue(a.contains(b));
		System.out.println("control come next   line after cheking string value");
}
}			