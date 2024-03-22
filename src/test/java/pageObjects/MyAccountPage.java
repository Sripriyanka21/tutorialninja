package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath="//h2[normalize-space()='My Account']") //My Account Page heading 
	WebElement msgheading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") //My Account Page heading //  //div[@class='list-group']//a[text()='Logout']
	WebElement linklogout;
	
	
	
	public boolean IsMyAccountPageExist() //My Account Page heading display status
	{
		try
		{
			return (msgheading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	
	public void ClickLogout()
	{
		linklogout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
