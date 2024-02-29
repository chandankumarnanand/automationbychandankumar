package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
	 Rectangle namerect = driver.findElement(By.id("name")).getRect();
		int nameheight = namerect.getHeight();
		int namestarty = namerect.getY();
	int	nameendy= nameheight+namestarty ;
		
	 Rectangle emailrect = driver.findElement(By.name("email")).getRect();
		int emailheight = emailrect.getHeight();
		int emailstarty = emailrect.getY();
		
		int spacebetweennameandemail= emailstarty-nameendy;
		System.out.println("the space b/w name and email :"+spacebetweennameandemail);
		
		int emailendy = emailstarty+emailheight;
		
		
		
		Rectangle passrect = driver.findElement(By.name("password")).getRect();
		int passht = passrect.getHeight();
		int passstarty = passrect.getY();
		
		
		
	int spacebetweenemailandpassword=passstarty-emailendy;
	
	if(spacebetweenemailandpassword==spacebetweennameandemail) {
		System.out.println("pass:the space is verified");
	}
	
	else
		System.out.println("fail:the space is not verified");
		
		
		
		
		
		
		
		

	}

}
