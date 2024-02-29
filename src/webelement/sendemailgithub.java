package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendemailgithub {

	public static void main(String[] args) {
		String productname="Levis Shirt";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/table/dynamic-table");
		
		String discount = driver.findElement(By.xpath("//th[text()='"+productname+"']/ancestor::tr[@class=\"bg-white border-b  hover:bg-orange-100\"]/descendant::td[3]")).getText();
		// TODO Auto-generated method stub
		System.out.println(discount);

	}

}
