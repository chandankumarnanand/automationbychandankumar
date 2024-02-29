package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byname {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/HP/Desktop/loginpage2.html");
			WebElement checkbox = driver.findElement(By.name("testing"));
		// TODO Auto-generated method stub
			checkbox.click();

	}

}
