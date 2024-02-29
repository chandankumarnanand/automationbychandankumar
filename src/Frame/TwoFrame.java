package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/frames/nested?sublist=1");
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@title=\"Parent iframe\"]"));
		
		 driver.switchTo().frame(outerFrame);
		driver.switchTo().frame(0);
		
	WebElement usr = driver.findElement(By.name("username"));
	
	WebElement email = driver.findElement(By.name("email"));
	WebElement pass = driver.findElement(By.name("password"));
	
	usr.sendKeys("chandankumarnanand@gmail.com");
	
      email.sendKeys("chandankumarnanand@gmail.com");
      	pass.sendKeys("Chandan@1");
      	
      	driver.switchTo().defaultContent();
      	
      	String text = driver.findElement(By.tagName("span")).getText();
      	  System.out.println(text);


	}

}
