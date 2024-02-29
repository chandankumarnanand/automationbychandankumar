package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyEnableorNot {

	public static void main(String[] args) {
		
		
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.name("name")).sendKeys("chandan");
		
		driver.findElement(By.name("email")).sendKeys("chandankumarnanand@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("chandan@1");
	boolean registerbutton = driver.findElement(By.xpath("//button[text()='Register']")).isEnabled();
		
		
		
		if(registerbutton) {
			System.out.println("pass:the button is enable");
		}
		
		else
			System.out.println("fail:the button is not enable");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
