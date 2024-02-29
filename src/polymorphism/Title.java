package polymorphism;

import org.openqa.selenium.WebDriver;

public abstract class Title {
	
	
	public static void verifyGoggleTitle(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		if(title.contains("Google")) {
			System.out.println("pass:title is verify");
			
			
		}
		else {
			System.out.println("fail:title is not verify");
			driver.quit();
			
			
		}
		
	}

}
