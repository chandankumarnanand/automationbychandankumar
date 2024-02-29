package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFecthWindowHandel {

	public static void main(String[] args) { 
		
		//window id for same browser but different webpages are same
		ChromeDriver driver = new ChromeDriver();
		String windowID1 = driver.getWindowHandle();
		System.out.println(windowID1);
		
		driver.get("https://www.facebook.com/");
		// TODO Auto-generated method stub
		String windowID2 = driver.getWindowHandle();
		System.out.println( windowID2);
		
		
//get () main url
		//to() sub url
	}

}
