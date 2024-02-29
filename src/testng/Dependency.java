package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test(priority=1)
	public void login() {
		System.out.println("the user login");
		
}
	@Test(priority=2,dependsOnMethods="login")
	public void searchProduct() {
		System.out.println("the product is found");
	}
	@Test(priority=3,dependsOnMethods="searchProduct")
	public void addToCart() {
		Assert.fail();
		System.out.println("the product is added");
	}
	@Test(priority=4,dependsOnMethods="addToCart")
	public void payment() {
		System.out.println(" product is paid");
	}
	@Test(priority=2,dependsOnMethods="login")
	public void logout() {
		System.out.println(" logout the side");
	}
}

		