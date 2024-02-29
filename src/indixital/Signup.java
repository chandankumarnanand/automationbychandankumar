package indixital;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://app.indixital.com/login");
		driver.findElement(By.linkText("Don't have an account?")).click();
		driver.findElement(By.name("name")).sendKeys("chandan kumar");
		driver.findElement(By.name("company")).sendKeys("izooto");
		driver.findElement(By.name("email")).sendKeys("chandankumarnanand@gmail.com");
		driver.findElement(By.name("websiteUrl")).sendKeys("https://www.izooto.com/");
		driver.findElement(By.name("phoneNumber")).sendKeys("7870954333");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		
	}

}
