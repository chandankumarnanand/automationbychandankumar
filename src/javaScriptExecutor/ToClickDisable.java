package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.co.in/");
	WebElement java = driver.findElement(By.name("q"));
		
		java.sendKeys("daunload java 11");
		java.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[text()='Java SE 11 Archive Downloads']")).click();
		
		driver.findElement(By.xpath("//td[text()='Linux ARM64 Compressed Archive']/..//a[@href=\"#license-lightbox\"]")).click();
		
		WebElement daunload = driver.findElement(By.xpath("//a[text()='Download jdk-11.0.20_linux-aarch64_bin.tar.gz']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",  daunload);
		
		
		


	}

}
