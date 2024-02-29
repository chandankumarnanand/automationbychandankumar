package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToComeOutSideFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/Iframe.html");
		driver.switchTo().frame("something");
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.tagName("input")).click();


	}

}
