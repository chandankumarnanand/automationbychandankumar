package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAction {
	
	public static void toLogin(WebDriver driver,String username,String password) {
		driver.findElement(By.id("email")).clear();
		
		
		driver.findElement(By.id("email")).sendKeys("username");
		
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
	}
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/login");
		loginAction.toLogin(driver, "chandankumarnanand@gmail.com", "Chandan@1");
		Thread.sleep(2000);
		
		loginAction.toLogin(driver, "chandankumarnanand@gmail.com", "Chandan@1");
	}
	
	
	
	

}
