package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class VerifyTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		 search.sendKeys("slenium");
		 search.sendKeys(Keys.ENTER);
	String sourcecode = driver.getPageSource();
	
	if(sourcecode.contains("slenium")) {
		System.out.println("pass:slenium are present");
	}
	else
		System.out.println("fail:slenium not present");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
