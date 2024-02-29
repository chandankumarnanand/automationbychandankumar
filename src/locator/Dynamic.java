package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		String playername="Suryakumar Yadav";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i/batting");
		Object ranking = driver.findElement(By.xpath("//a[text()='"+playername+"']/../..//td[4]")).getText();
		
		
		System.out.println(ranking);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
