package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickAnySuggetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String suggestionToClick = "hadh kar di aapne song";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("had kr di apne");
		List<WebElement> allsug = driver.findElements(By.xpath("//div[contains(@aria-label,'hadh kar di aapne')]"));
		
		for(WebElement sug :allsug ) {
			if(sug.getText().contains(suggestionToClick)) {
				sug.click();
				break;
			}
			
	}
		driver.findElement(By.xpath("//div[text()='Hadh Kardi Aapne']")).click();

}
}
