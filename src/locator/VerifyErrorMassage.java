package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyErrorMassage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
	login.click();
	String eroor = driver.getPageSource();
	if(eroor.contains("Username or Password is invalid. Please try again.")) {
			
		System.out.println("pass");
	}
	else
		System.out.println("fail");
	}
		
		
		
		
		// TODO Auto-generated method stub

	}


