package polymorphism;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class toverifytheextinginputdata {
	public static void verifyPageSource(WebDriver driver,String content) {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		String sourcecode = driver.getPageSource();
		if(sourcecode.contains(content)) {
			System.out.println("verify the keyword");
			
		}
		else {
			System.out.println("not verify the keyword");
		}
	}

}
