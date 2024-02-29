package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClkick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/button/buttonRightClick");
		WebElement rightclick = driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/..//button[text()='Right Click']"));
				Actions action = new Actions(driver);
				action.contextClick(rightclick).perform();
				driver.findElement(By.xpath("//div[text()='Yes']")).click();
				
	}

}
