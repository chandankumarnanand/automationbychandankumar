package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.name("pwd"));
	WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
	username.sendKeys(" admin");
	password.sendKeys("manager");
	password.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	String home = driver.getTitle();
	if(home.contains("Enter")) {
		System.out.println("pass");
	}
	else
		System.out.println("fail");
	
		
		// TODO Auto-generated method stub

	}

}
