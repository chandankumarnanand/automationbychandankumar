package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 


		driver.get("https://demoapps.qspiders.com/fileUpload?sublist=0");
		
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\HP\\Desktop\\Project\\Eclipse\\eclipse\\automation\\Automation\\chandanapi.pdf");
		 
		
		
		 
		

	}

}
