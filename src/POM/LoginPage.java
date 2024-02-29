package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	public WebElement usernameTextfield;
	
	
	@FindBy(name="pwd")
	public WebElement passwordTextfield;
	
	
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement loginTextfield;
	
	public void LoginAction(String username,String password) {
		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginTextfield.click();
	}

}
