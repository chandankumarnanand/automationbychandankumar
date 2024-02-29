package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAnySuggetionMobile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String suggestionmobToClick = "iphone 14";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		
	List<WebElement> allMobileSug = driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"));
	int allsugg = allMobileSug.size();
	System.out.println(allsugg);

	for(WebElement sug :allMobileSug ) {
		System.out.println(sug.getText());
		if(sug.getText().contains(suggestionmobToClick)) {
			Thread.sleep(2000);
			sug.click();
			break;
		
		
		

	}

    }
	
}
}
