package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String suggestionmobToClick = "iphone 14 pro max";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=8708428019914087086&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061660&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
	List<WebElement>allMobsug = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"] "));
	int allsugg = allMobsug.size();
	System.out.println(allsugg);

	for(WebElement sug :allMobsug ) {
		System.out.println(sug.getText());
		if(sug.getText().contains(suggestionmobToClick)) {
			Thread.sleep(2000);
			sug.click();
			break;

	}

}
	}
	}

