package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenrate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		// TODO Auto-generated method stub
		 driver.findElement(By.name("q")).sendKeys("slenium");
		
		driver.navigate().refresh();
		
		 driver.findElement(By.name("q")).sendKeys("automation");
		

	}

}
