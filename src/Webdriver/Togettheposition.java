package Webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Togettheposition {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		int xcoordinate = pos.getX();
		int ycoordinate = pos.getY();
		System.out.println(xcoordinate );
		System.out.println(ycoordinate);
		
		// TODO Auto-generated method stub
		
		

	}

}
