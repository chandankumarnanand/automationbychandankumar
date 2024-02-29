package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCssInfo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button");
	WebElement yesbuttonafterclick = driver.findElement(By.xpath("//button"));
	 yesbuttonafterclick.click();
	 String yesbuttoncolorafterclick = yesbuttonafterclick.getCssValue("background-color");
		
		System.out.println(yesbuttoncolorafterclick);
// TODO Auto-generated method stub
		
		WebElement yesbuttonbeforeclick = driver.findElement(By.xpath("//button"));
		 String yesbuttoncolorbeforeclick = yesbuttonbeforeclick.getCssValue("background-color");
			
			System.out.println(yesbuttoncolorbeforeclick);
			
			if(!yesbuttoncolorbeforeclick.equals(yesbuttoncolorafterclick)) {
				System.out.println("pass:the button was clicked");
			}
			
			else
				System.out.println("pass:the button was clicked");
			

	}

}
