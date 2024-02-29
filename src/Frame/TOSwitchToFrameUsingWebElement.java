package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOSwitchToFrameUsingWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/Iframe.html");
	WebElement third = driver.findElement(By.xpath("//iframe[@src=\"https://demoapps.qspiders.com/\"]"));
			driver.switchTo().frame(third);
			driver.findElement(By.xpath("//a[@href=\"https://www.qspiders.com/\"]")).click();
	}

}
