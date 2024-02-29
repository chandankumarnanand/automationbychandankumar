package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwaittext {

	public Fluentwaittext() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/progress");
	WebElement startbutton = driver.findElement(By.xpath("//button[text()='Start']"));
	WebElement reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		
		startbutton.click();
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElement(startbutton, "Start"));
		wait.ignoring(Exception.class);
		reset.click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
