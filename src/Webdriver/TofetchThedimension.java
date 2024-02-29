package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TofetchThedimension {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		int width = dim.getWidth();
		int height = dim.getHeight();
		System.out.println("The width is:"+width );
		
		System.out.println("the height is:"+height );
		
		
		
		
		

	}

}
