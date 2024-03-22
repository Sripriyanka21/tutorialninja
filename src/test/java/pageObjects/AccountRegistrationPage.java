package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	WebDriver driver;
	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement TxtFstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement TxtLstname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement TxtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement TxtTelph;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement TxtPswrd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement TxtPswrdCnfrm;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement CheckPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement Btw_Continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement Msgconfirmation;
	
	//Actions
	
	public void setfirstname(String fstname)
	{
		TxtFstname.sendKeys(fstname);
	}
	
	public void setLastname(String Lstname)
	{
		TxtLstname.sendKeys(Lstname);
	}
	
	public void setEmail(String Email)
	{
		TxtEmail.sendKeys(Email);
	}
	
	public void setTelephone(String Telephone)
	{
		TxtTelph.sendKeys(Telephone);
	}
	
	public void setPassword(String Password)
	{
		TxtPswrd.sendKeys(Password);
	}
	
	public void setPasswordCnfrm(String PasswordCnfrm)
	{
		TxtPswrdCnfrm.sendKeys(PasswordCnfrm);
	}
	
	public void ClickCheckPolicy()
	{
		CheckPolicy.click();
	}
	
	public void ClickContinue()
	{
		//Sol1
		Btw_Continue.click();
		
		//Sol2
		
		//Btw_Continue.submit();
		
		//Sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(Btw_Continue).click().perform();


		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",Btw_Continue);

		//sol5
		//Btw_Continue.sendKeys(Keys.RETURN);

		//sol6
		//WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(Btw_Continue)).click();
		
	}	
		public String GetconfirmationMsg() //return type is String not void
		{
			try
			{
				return (Msgconfirmation.getText());
			}
			catch(Exception e)
			{
				return (e.getMessage());
			}
		}
		

		
	}