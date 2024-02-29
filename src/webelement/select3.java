package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/button/buttonSubmitClick");
		driver.findElement(By.id("r4")).click();
		driver.findElement(By.xpath("//p[text()='4. Rate us on the scale of 1 to 5']/..//button[text()='Submit']")).submit();
		
		
	String slectno = driver.findElement(By.xpath("//span[text()='You Selected \"4\"']")).getText();
		
		if(slectno.contains("You Selected \"4\"")) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		
		
		
		// TODO Auto-generated method stub

	}

}
