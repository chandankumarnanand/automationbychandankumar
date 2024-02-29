package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	
		
		@Test
		public void demoAssert() {
			String a="qspider";
			String b="jspider";
			
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(a, b);
			sa.assertAll();
			System.out.println("pass");
			
			
		}

	}


