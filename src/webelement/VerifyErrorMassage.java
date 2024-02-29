package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyErrorMassage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 Thread.sleep(30000);
	
	String errormsg = driver.findElement(By.xpath("//span[@class=\"errormsg\"][1]")).getText();
	
	if(errormsg.contains("Username or Password is invalid")) {
			
		System.out.println("pass");
	}
	else
		System.out.println("fail");
	}
		
		
		
		
		// TODO Auto-generated method stub

	}


