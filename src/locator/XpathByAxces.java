package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxces {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=sumsung&crid=3HFTBMW3NEC3Z&sprefix=sumsung%2Caps%2C414&ref=nb_sb_noss_2");
		String price = driver.findElement(By.xpath("//img[@alt=\"Sponsored Ad - Samsung Galaxy M34 5G (Prism Silver,8GB,128GB)|120Hz sAMOLED Display|50MP Triple No Shake Cam|6000 mAh Batt...\"]/ancestor::div[@class=\"sg-row\"]/descendant::span[text()='17,999']")).getText();		
		
		System.out.println(price);
		// TODO Auto-generated method stub

	}

}
