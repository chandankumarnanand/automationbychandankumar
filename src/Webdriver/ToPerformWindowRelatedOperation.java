package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformWindowRelatedOperation {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();


		driver.get("https://www.google.com/");
		Options opn = driver.manage();
		Window win = opn.window();
		win.maximize();
		win.minimize();
		win.fullscreen();

	}

}
