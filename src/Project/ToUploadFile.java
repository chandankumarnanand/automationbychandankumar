package Project;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ToUploadFile {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
	      Pattern file = new Pattern("C:\\Users\\HP\\Downloads\\eclipse-java-2021-06-R-win32-x86_64\\eclipse\\automation\\Automation\\file.png");
		
		
	      Pattern open = new Pattern("C:\\Users\\HP\\Desktop\\Project\\Eclipse\\eclipse\\automation\\Automation\\open.png");
		
	          Screen screen = new Screen();
	          screen.type("C:\\Users\\Hp\\Desktop\\Project\\Eclipse\\eclipse\\automation\\automation\\new.pdf");
	          	screen.click(open);
	}

}
