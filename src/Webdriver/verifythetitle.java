package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class verifythetitle {

	public static void main(String[] args) {
	String expectedTitle = "Facebook";
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String actualTitle = driver.getTitle();
	if(actualTitle.contains(expectedTitle))
	{
		System.out.println("pass");
	}
	
	else {
		System.out.println("fail");
	}
		// TODO Auto-generated method stub

	}

}
