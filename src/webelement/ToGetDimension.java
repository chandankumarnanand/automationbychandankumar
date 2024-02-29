package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetDimension {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/image");
		Dimension image = driver.findElement(By.xpath("//img[@alt=\"order placed\"]")).getSize();
		
		
		int imagehg = image.getHeight();
	int imagewh = image.getWidth();
		
		
		
		System.out.println(imagehg);
		System.out.println(imagewh);
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
