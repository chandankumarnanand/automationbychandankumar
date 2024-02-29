package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dragDrop");
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement target = driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[1]"));
		
		WebElement mobilecover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		
		WebElement LaptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement target2 = driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[2]"));
		
		
	Actions action = new Actions(driver);
	action.dragAndDrop(mobileCharger, target).perform();
	
	action.dragAndDrop(LaptopCharger, target2).perform();

	}

}
