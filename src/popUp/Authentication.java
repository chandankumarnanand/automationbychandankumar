 package popUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String username = "admin";
		//String password = "admin";


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 

		//https:username:password@www.google.com
		
		//http://admin:admin@the-internet.herokuapp.com/basic_auth

		//driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	

	}

}
