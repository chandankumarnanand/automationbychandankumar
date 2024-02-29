package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoSwitchTheFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/frames/multiple");
		
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//h2[text()='Sign Up']/..//input[@id=\"username\"]")).sendKeys("chandankumarnanand@gmail.com");
		driver.findElement(By.xpath("//h2[text()='Sign Up']/..//input[@id=\"email\"]")).sendKeys("chandankumarnanand@gmail.com");
		driver.findElement(By.xpath("//h2[text()='Sign Up']/..//input[@id=\"password\"]")).sendKeys("Chandan@1");
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
	driver.findElement(By.xpath("//h2[text()='Login']/..//input[@id=\"username\"]")).sendKeys("chandankumarnanand@gmail.com");
	driver.findElement(By.xpath("//h2[text()='Login']/..//input[@id=\"password\"]")).sendKeys("Chandan@1");
		
		
		

	}

}
