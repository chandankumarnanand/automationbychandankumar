package basicTestscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.HomePage;
import POM.LoginPage;

public class ToVerifyHomePage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		
		LoginPage login = new LoginPage(driver);
		login.LoginAction("admin", "manager");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		String homePageTitle = driver.getTitle();
		if(homePageTitle.contains("Enter")) {
			System.out.println("pass:the title is verified");
			
		}
		else
			System.out.println("fail:the title is verified");
		HomePage home=new HomePage(driver);
		home.logoutAction();
		driver.quit();
	}

}
