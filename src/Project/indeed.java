package Project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code= 834317 ;
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://profile.indeed.com/?hl=en_IN&co=IN&from=gnav-jobseeker-profile--profile-one-frontend");
		
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("chandankumarnanand@gmail.com");
		//driver.findElement(By.id("checkbox")).click();
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("checkbox")).click();
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.linkText("Sign in with login code instead")).click();
		driver.findElement(By.name("passcode")).sendKeys("pass the code"+code);
	

	

}
}

