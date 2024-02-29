package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyElimentIssu {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
	Point namepos = driver.findElement(By.name("name")).getLocation();
		int nameposx = namepos.getX();
		
		
	 Point emailpos = driver.findElement(By.name("email")).getLocation();
		int emailposx = emailpos.getX();
		
		
		 Point passpos = driver.findElement(By.name("password")).getLocation();
		int passposx = passpos.getX();
		
		
		if(nameposx==emailposx && emailposx==passposx) {
			System.out.println("pass: the textbox are alligned");
		}
		
		else
			System.out.println("fail: the textbox are not alligned");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
