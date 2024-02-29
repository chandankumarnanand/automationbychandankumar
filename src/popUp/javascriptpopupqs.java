package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopupqs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 


		driver.get("https://demoapps.qspiders.com/alert?sublist=0");
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Thread.sleep(30000);
		
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.linkText("Confirm")).click();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Thread.sleep(30000);
		
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.linkText("Prompt")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
	String question = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		
		System.out.println(question);
		
		
		
		
		
		

	}

}
