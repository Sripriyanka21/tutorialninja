package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage //extending constructor from the parent class
{
	WebDriver driver;
	public HomePage(WebDriver driver) //adding driver instance
	{
		super(driver); // super will invoke the parent class constructor. 
		
	}
	
	//WebElements locators
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement LinkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement LinkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement LinkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement txtSearchProductbox;
	
	@FindBy(xpath="//div[@id='search']//button[@type='button']")
	WebElement btnSearch;
	
	
	//Actions
	public void clickMyAccount()
	{
		LinkMyAccount.click();
	}
	
	public void clickRegister()
	{
		LinkRegister.click();
	}
	
	public void ClickLogin()
	{
		LinkLogin.click();	}
	
	public void enterProductName(String Pname) //For Search Product Test
	{
		txtSearchProductbox.sendKeys(Pname);
	}
	
	public void clickSearch() //For Search Product Test
	{
		btnSearch.click();
	}

}
