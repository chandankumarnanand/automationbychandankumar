package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependetAndDependent {

	public static void main(String[] args) {
		String productname="APPLE iPhone 14 Plus (Starlight, 128 GB)";
		String productprice="₹65,999";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+14+plus&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone+14+plus%7CMobiles&requestId=32fd8a91-a9d7-4989-a367-a7c1adba31e8");
	WebElement elementRefOfIphone = driver.findElement(By.xpath("//div[text()='"+productname+"']/../..//div[text()='"+productprice+"']"));
		
	String price = elementRefOfIphone.getText();
	System.out.println(price);
		
		
		
		// TODO Auto-generated method stub

	}

}
