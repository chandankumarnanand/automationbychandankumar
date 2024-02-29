package TakeScreenshot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com/");

		WebElement googleImage = driver.findElement(By.xpath("//img[@alt=\"Google\"]"));

		Utils.takeScreenShotOfElement(googleImage);

	}

}
