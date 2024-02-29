package polymorphism;

import org.openqa.selenium.WebDriver;

public class verifyurl {
	public static void url(WebDriver driver) {
		driver.manage().window().maximize();
		 String expectedURL = "www.google.com";
		driver.get("https://www.google.com/");
		String currenturl = driver.getCurrentUrl();
	       
	      System.out.println(currenturl);
	      if(currenturl.contains(expectedURL))
	    	  
	      {
	    	  System.out.println("pass: the url is verified");
	    	  
	      }
	      else
	      {
	    	  System.out.println("fail: the url is not verified");
	    	   
		
		
	}
	}
}


