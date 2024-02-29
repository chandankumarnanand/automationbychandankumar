package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlestaleElementRefrenceExceptio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		GoogleSearchPage Google=new GoogleSearchPage(driver);
		
		//Google.searchBar().sendKeys("slenium");
        //Google.getsearchBar().sendKeys("slenium");
		Google.searchquerry("slenium");
		driver.navigate().refresh();
		
		//Google.getsearchBar().sendKeys("automation");
		
		//Google.getsearchBar().sendKeys("automation");
	    Google.searchquerry("Automation");
	}

}
