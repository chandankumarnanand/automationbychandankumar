package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/loginpage2.html");
		WebElement username = driver.findElement(By.id("abc"));
		
               username.sendKeys("abcd");
       WebElement password = driver.findElement(By.className("password"));
       password.sendKeys("bcde");
	}

}
 