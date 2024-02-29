package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheakDimAndWidthSameOrNot {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
	Dimension nameblock = driver.findElement(By.name("name")).getSize();
		int nameht = nameblock.getHeight();
		int namewt = nameblock.getWidth();
		
	Dimension emailblock = driver.findElement(By.name("email")).getSize();
		int emailht = emailblock.getHeight();
		int emailwt = emailblock.getWidth();
		
		Dimension passblock = driver.findElement(By.name("password")).getSize();
		int passht = passblock.getHeight();
		int passwt = passblock.getWidth();
		

	if(nameht==emailht && emailht==passht && namewt==emailwt && emailwt==passwt ) {
		System.out.println("pass: all height and width is same");
	}
	else
		System.out.println("fail: all height and width is not same");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
