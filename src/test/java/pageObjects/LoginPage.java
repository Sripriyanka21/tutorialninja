package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement TxtEMailAddress;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement TxtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement BtnLogin;
	
	
	public void SetEmail(String email)
	{
		TxtEMailAddress.sendKeys(email);
	}
	
	public void SetPassword(String Password)
	{
		TxtPassword.sendKeys(Password);
	}
	
	public void ClickLogin()
	{
		BtnLogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
