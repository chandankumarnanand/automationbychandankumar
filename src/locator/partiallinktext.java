package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Desktop/loginpage2.html");
	driver.findElement(By.partialLinkText("Go to Selenium")).click();
	//when we go for partial linktext
	//if dynamic linktext
       // if space after inspect then go for partiallinktext
	// if long link text is long 
	}

}
