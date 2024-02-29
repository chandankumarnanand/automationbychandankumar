package Webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTargetAParticulerWindow {

	public static void main(String[] args) {
	 String windowToSwitch = "Facebook";

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.instagram.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
           driver.navigate().to("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> allIDs = driver.getWindowHandles();
		for(String id:allIDs) {
			driver.switchTo().window(id);
			String currentTitle = driver.getTitle();
			
	if( currentTitle.contains(windowToSwitch));
	driver.close();
	break;
	
			
			
			
		}
		
		
	  
	     
	      
	     

	}

}
