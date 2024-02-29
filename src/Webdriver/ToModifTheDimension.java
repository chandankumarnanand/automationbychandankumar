package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToModifTheDimension {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Dimension dim = new Dimension(500,200);
		driver.manage().window().setSize(dim);
		// TODO Auto-generated method stub

	}

}
