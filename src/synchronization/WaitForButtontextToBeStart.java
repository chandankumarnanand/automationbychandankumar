package synchronization;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForButtontextToBeStart {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/progress");
	WebElement startbutton = driver.findElement(By.xpath("//button[text()='Start']"));
	WebElement reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		
		startbutton.click();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.textToBePresentInElement(startbutton,"Start"));
            reset.click();
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
