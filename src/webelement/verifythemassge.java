package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifythemassge {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("kuch bhi");
		search.sendKeys(Keys.ENTER);
		String kuchbhi = driver.findElement(By.xpath("//div[text()='Kuch Bhi Ho Jaye']")).getText();
		if(kuchbhi.contains("Kuch Bhi Ho Jaye")) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		// TODO Auto-generated method stub

	}

}
