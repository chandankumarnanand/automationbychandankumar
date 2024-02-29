package popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 


		driver.get("https://demoapps.qspiders.com/browser?sublist=0");
		
		driver.findElement(By.linkText("Open in new window")).click();
		
	Set<String> newbrowser = driver.getWindowHandles();
	
	for(String x:newbrowser) {
		
		driver.switchTo().window(x);
		String current = driver.getTitle();
	if(current.contains("new Window")) {
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("username")).sendKeys("chandan@1");
		driver.findElement(By.id("email")).sendKeys("chandan@1");
		
		driver.findElement(By.id("password")).sendKeys("chandan@1");
		
		
		
		
		
		
	}
	
		
	}
		
		
		
		
		
		

	}

}
