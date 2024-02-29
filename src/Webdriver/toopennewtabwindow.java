package Webdriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class toopennewtabwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		String windowID1 = driver.getWindowHandle();
		System.out.println(windowID1);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		 driver.navigate().to("https://www.facebook.com/");
		// TODO Auto-generated method stub
		Set<String> allIDs = driver.getWindowHandles();
		System.out.println(allIDs);

	}
}
