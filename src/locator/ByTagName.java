package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/Desktop/loginpage2.html");
		 WebElement headingtext = driver.findElement(By.tagName("h1"));
		String heading = headingtext.getText();
		System.out.println(heading);
	}

}
