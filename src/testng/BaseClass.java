package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void bs() {
		System.out.println("data base connection is establish");
		}
	
		@BeforeTest
		public void bt() {
			System.out.println("parrallel excution started ");
		}
		@BeforeClass
		public void bc() {
			System.out.println("launch the browser ");
			System.out.println("navigate the url ");
			
			
	}
		@BeforeMethod
		public void bm() {
			System.out.println("login the application");
		}
		@AfterMethod
		public void  am() {
			System.out.println("logout the appplicatiuon  ");
		}
		@AfterClass
		public void ac() {
			System.out.println("close the browser ");
		}
		@AfterTest
		public void at() {
			System.out.println("parrallel excution stop");
		}

}
