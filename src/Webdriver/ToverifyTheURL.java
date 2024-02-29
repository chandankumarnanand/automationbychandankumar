package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToverifyTheURL {
	//Test case name: The verify the URL

	public static void main(String[] args) {
		 String expectedURL = "www.google.com";
		
	 ChromeDriver driver = new ChromeDriver();
      
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
