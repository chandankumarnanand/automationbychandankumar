package Webdriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAParticularWindow {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
	      
	       driver.get("https://www.google.com/");
	     String googleIDs = driver.getWindowHandle();
	     
	       driver.manage().window().maximize();
	       driver.switchTo().newWindow(WindowType.TAB);
	       driver.navigate().to("https://www.facebook.com/");
	       
	       
	       driver.switchTo().newWindow(WindowType.TAB);
	       driver.navigate().to("https://www.instagram.com/");
	      String currentwindowtitle = driver.getTitle();
	      System.out.println("current window title is"+currentwindowtitle);
	      
	      driver.switchTo().window(googleIDs);
	      String googleWindowtitle = driver.getTitle();
	      System.out.println("the  title is google window is"+googleWindowtitle);
	      
	      
	      
	       
	       
	       
	       
		// TODO Auto-generated method stub

	}

}
