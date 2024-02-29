package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenshotofWebelementqs {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");
		
	File source = driver.findElement(By.xpath("//img[@alt='Facebook']")).getScreenshotAs(OutputType.FILE);
	File destination= new File("./screenshot/facebookImage.png");
	Files.copy(source, destination);
		

	}

}
