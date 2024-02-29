package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		driver.get("https://demoapps.qspiders.com/auth?sublist=0");
		
		driver.findElement(By.linkText("Login")).click();
		
		
		
		
		
		
		
		
		

	}

}
