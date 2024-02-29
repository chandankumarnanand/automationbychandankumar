package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tocloseallbrowser {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
	      
	       driver.get("https://demo.actitime.com/login.do");
	       driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
	       Thread.sleep(500);
	       
	       driver.close();
	       
		// TODO Auto-generated method stub

	}

}

