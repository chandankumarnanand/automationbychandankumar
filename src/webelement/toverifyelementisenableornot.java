package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.antlr.PythonParser.continue_stmt_return;

public class toverifyelementisenableornot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		WebElement contiue = driver.findElement(By.id("password"));
		boolean emaildispaly = email.isDisplayed();
		if(emaildispaly) {
			System.out.println("pass");
			email.sendKeys("chandankumarnanand@gmail.com");
		boolean continuebutton = contiue.isEnabled();
		if(continuebutton) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		}
		else
			System.out.println("fail");

	}

}


