package basicTestscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.GoogleSearchPage;

public class HandlestaleElementRefrenceExceptio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		GoogleSearchPage Google=new GoogleSearchPage(driver);
		Google.getsearchBar().sendKeys("selenium");
		driver.navigate().refresh();
		Google.getsearchBar().sendKeys("automation");
	}

}
