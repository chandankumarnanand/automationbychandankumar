package popUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 ChromeOptions option = new ChromeOptions();
	 option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 


		driver.get("https://www.yatra.com/");
		
		
		
		
		
		
		
		

	}

}
