package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendValueInOneFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/frames");
		driver.switchTo().frame(0);
		
	WebElement usr = driver.findElement(By.name("username"));
	WebElement pass = driver.findElement(By.name("password"));
	usr.sendKeys("chandankumarnanand@gmail.com");
	pass.sendKeys("Chandan@1");

	}

}
