package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class select {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/radio");
	WebElement radiobutton = driver.findElement(By.xpath("//input[@value=\"Upi\"]"));
	radiobutton.click();
	boolean statusofradiobutton = radiobutton.isSelected();
	System.out.println( statusofradiobutton);
	if( statusofradiobutton) {
		System.out.println("pass :the radio button is selected");
	}
	else
		System.out.println("fail :the radio button is notselected");


		WebElement homeradiobutton = driver.findElement(By.xpath("//input[@value=\"home\"]"));

		homeradiobutton.click();
boolean statusofhomeradiobutton = homeradiobutton.isSelected();
		System.out.println(statusofhomeradiobutton );
		if(statusofhomeradiobutton ) {
			System.out.println("passs:address is display" );
		}
		else

			System.out.println("fail:address is not display" );





		// TODO Auto-generated method stub

	}

}
