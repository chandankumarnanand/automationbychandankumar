package fleetstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://54.224.187.139/");
		driver.findElement(By.xpath("//span[text()='Superadmin Login']")).click();
		driver.findElement(By.id("username")).sendKeys("sadmin");
		driver.findElement(By.id("userpassword")).sendKeys("123456");
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		
		driver.findElement(By.xpath("//span[text()='Direct users']")).click();
		
	
		//driver.findElement(By.xpath("//span[text()='Create Admin']")).click();
		

	}

}
