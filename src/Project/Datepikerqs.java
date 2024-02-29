package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepikerqs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expecteddate="10";
		//String  expectemonth="December";
		String  expecteyear ="December 1999";
	
		
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/datePick?sublist=0");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Select A Date\"]")).click();
		
		while(true) {
	 String year = driver.findElement(By.xpath("//div[text()='November 2023']")).getText();
	
	if(year.contains(expecteyear)){
		driver.findElement(By.xpath("//div[text()='10']")).click();
		break;
		
	}

		}
	
		
		}	
	
		
		
	
	}
	


		

		
		
		
		
		
	

		
		
		
		
		
		





