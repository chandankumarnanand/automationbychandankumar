package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassB {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void B(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");


}
}
