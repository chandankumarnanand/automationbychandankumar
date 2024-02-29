package testng;

import org.testng.annotations.Test;

public class setpriority {

	public static void main(String[] args) {
		
	}
		
	
		@Test(priority=1)
		public void login() {
			System.out.println("the user login");
			
	}
		@Test(priority=2)
		public void searchProduct() {
			System.out.println("the product is found");
		}
		@Test(priority=3)
		public void addToCart() {
			System.out.println("the product is added");
		}
		@Test(priority=4)
		public void payment() {
			System.out.println(" product is paid");
		}
		@Test(priority=5)
		public void logout() {
			System.out.println(" logout the side");
		// TODO Auto-generated method stub

	}

}
