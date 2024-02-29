package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/?scenario=1");
	Thread.sleep(20000);
	WebElement name = driver.findElement(By.id("name"));
	WebElement email = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("password"));

			email.sendKeys("chandankumarnanand@gmail.com");
			pass.sendKeys("Chandan@1");
	
			driver.findElement(By.xpath("//button[text()='Register']")).click();
			
			String login = driver.findElement(By.tagName("h1")).getText();
			if(login.contains("Login")){
				System.out.println("user has register");
			}
				else
					System.out.println("user has not register");
	}

	}
 

