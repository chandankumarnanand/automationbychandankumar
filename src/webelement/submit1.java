package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/button/buttonSubmitClick");
		driver.findElement(By.id("sat1")).click();
	WebElement submit = driver.findElement(By.xpath("//button[text()='Submit'][1]"));
	
		submit.submit();
		Thread.sleep(2000);
		
	WebElement yes = driver.findElement(By.xpath("//span[text()='You Selected \"Yes\"']"));
	
	if(yes.equals(yes))
	{
		System.out.println("pass");
		
	}
	else
		System.out.println("fail");
	
		
		driver.quit();
		
		

	}

}
