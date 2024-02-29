package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepiker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expecteddate="10";
		String  expectemonth="December";
		String  expecteyear ="1999";
	
		
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
	
		while(true) {
			
		String clendarmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		String clendaryear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		if(clendarmonth.equals( expectemonth) && clendaryear.equals(expecteyear)) {
			
			List<WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
			
			for(WebElement x:daylist) {
				String claderday = x.getText();
				if(claderday.equals(expecteddate)) {
					x.click();
					break;
				}
			}
			
			break;	
			
		}
		else {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			
		}
			}	

	}

}
