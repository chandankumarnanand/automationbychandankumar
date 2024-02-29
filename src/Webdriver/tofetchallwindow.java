package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tofetchallwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
	      
	       driver.get("https://demo.actitime.com/login.do");
	       driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
	    String parentID = driver.getWindowHandle();
	    System.out.println(parentID);
	    Set<String> allIDs = driver.getWindowHandles();
	    System.out.println(allIDs);
	    
	}

}
