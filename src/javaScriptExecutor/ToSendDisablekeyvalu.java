package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSendDisablekeyvalu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("(//*[name()='svg' and @viewBox=\"0 0 320 512\"])[2]")).click();
		
		driver.findElement(By.xpath("//li[text()='With placeholder']")).click();
		
		WebElement name = driver.findElement(By.name("name"));
		
		WebElement email = driver.findElement(By.name("email"));
		
		WebElement pass = driver.findElement(By.name("password"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='chandan' ",name );
		
		js.executeScript("arguments[0].value='chandankumarnanand@gmail.com' ",email );
		
		js.executeScript("arguments[0].value='Chandan@1' ",pass);
		
		
		
		
	}

}
