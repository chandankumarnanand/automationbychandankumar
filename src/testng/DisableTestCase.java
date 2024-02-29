package testng;

import org.testng.annotations.Test;

public class DisableTestCase {
	@Test(priority=1)
	public void goodMorning() {
		System.out.println("good mornig");
		
}
	@Test(priority=2,enabled=false)
	public void breakfast() {
		System.out.println("breakfast");
	}
	@Test(priority=3)
	public void work() {
		System.out.println("work");

}
}
