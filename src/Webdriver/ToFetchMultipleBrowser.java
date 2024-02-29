package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchMultipleBrowser {

	public static void main(String[] args) {
		// to fetch multiple browser
		ChromeDriver driver = new ChromeDriver();
		String windowID1 = driver.getWindowHandle();
		System.out.println(windowID1);
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		// TODO Auto-generated method stub
		String windowID2 = driver1.getWindowHandle();
		System.out.println( windowID2);
		}

}
