package webelement;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class closesecondwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/login");
		driver.switchTo().newWindow(WindowType.TAB);
		 driver.navigate().to("https://www.sarkariresult.com/");
		Set<String> second = driver.getWindowHandles();
		driver.close();


	}

}
