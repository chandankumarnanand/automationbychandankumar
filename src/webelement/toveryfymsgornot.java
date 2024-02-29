package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toveryfymsgornot {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demoapps.qspiders.com/button");
		
		driver.findElement(By.xpath("//p[text()='1. Are you satisfied with registration process?']/..//button[text()='Yes']")).click();
	Thread.sleep(2000)	;
	boolean yesmsg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
		
		
		if(yesmsg) {
			System.out.println("pass:the message is diplay");
		}
		
		else
		
			System.out.println("fail:the message is not diplay");
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
