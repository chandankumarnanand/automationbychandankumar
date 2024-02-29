package indixital;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class login {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://app.indixital.com/login");
		driver.findElement(By.name("email")).sendKeys("chandankumarnanand@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Chandan@1");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.name("referenceId")).sendKeys("nikhil");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		driver.findElement(By.xpath("//h5[text()='Advanced Setup']/../../../..//button[text()='Next']")).click();
		driver.findElement(By.name("vendorName")).sendKeys("chandan");
		driver.findElement(By.name("vendorAddress")).sendKeys("noida");
		driver.findElement(By.name("vendorState")).sendKeys("up");
		driver.findElement(By.name("vendorGSTNumber")).sendKeys("123456878327878");
		driver.findElement(By.id(":rk:")).sendKeys("C:\\Users\\USER\\Desktop\\project\\eclipse-java-2021-06-R-win32-x86_64\\eclipse\\automation\\automation\\new.pdf");
        
		driver.findElement(By.name("vendorPANNumber")).sendKeys("3456733877");
		driver.findElement(By.id(":rm:")).sendKeys("C:\\Users\\USER\\Desktop\\project\\eclipse-java-2021-06-R-win32-x86_64\\eclipse\\automation\\automation\\new.pdf");
		driver.findElement(By.name("vendorPOCName")).sendKeys("09876");
		driver.findElement(By.name("vendorPOCPhone")).sendKeys("7870954333");
		driver.findElement(By.name("vendorPOCEmail")).sendKeys("chandankrnanad@gmail.com");
		driver.findElement(By.name("vendorFinanceEmail")).sendKeys("chandankumarnanand@gmail.com");
		
		driver.findElement(By.name("vendorCEOEmail")).sendKeys("chandankmarnanand@gmail.com");
		driver.findElement(By.xpath("//div[@aria-haspopup=\"listbox\"]")).click();
		
		driver.findElement(By.xpath("//li[@data-value=\"PVT_LTD\"]")).click();
		WebElement date=driver.findElement(By.id(":rs:"));
		date.click();
		date.sendKeys("02/01/2024");
		
		driver.findElement(By.name("vendorBankName")).sendKeys("SBI");
		driver.findElement(By.name("vendorBankAC")).sendKeys("17288712638723872");
		
		driver.findElement(By.name("vendorBankBranch")).sendKeys("noida sec 15");
		driver.findElement(By.name("vendorIFSCCode")).sendKeys("SBIN0018188");
		 WebElement VendorsBanktype= driver.findElement(By.id(":r15:"));
		 VendorsBanktype.click();
		 driver.findElement(By.xpath("//li[text()='Current A/C']")).click();
		 
		driver.findElement(By.name("vendorBankSwiftCode")).sendKeys("3872");
		driver.findElement(By.name("vendorMSMECoverage")).click();
		
		driver.findElement(By.xpath("//button[text()='Submit']")).submit();
		
	}

}
