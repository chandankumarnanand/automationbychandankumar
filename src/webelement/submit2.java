package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit2 {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/button/buttonSubmitClick");
		driver.findElement(By.id("prob2")).click();
		WebElement submit = driver.findElement(By.xpath("//p[text()='2. Do you have any concerns about our registration process?']/..//button[@type=\"submit\"]"));
		
		submit.submit();
		
		
		String selectno = driver.findElement(By.xpath("//span[text()='You Selected \"No\"']")).getText();
		
		if(selectno.contains("You Selected \"No\"")) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
