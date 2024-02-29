package Webdriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemultiplebrowser {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver();
	      
	       driver.get("https://www.google.com/");
	     Navigation nav = driver.navigate();
	     Thread.sleep(10000);
	     nav.to("https://www.instagram.com/");
	     Thread.sleep(10000);
	     nav.to("https://www.facebook.com/");
	     nav.back();
	     Thread.sleep(10000);
	     nav.getClass();
	     Thread.sleep(10000);
	     nav.refresh();
	     
	     
	   
	       
	       
	       
	       
	       
	       
	       
	       
	       
	  

	}

}
