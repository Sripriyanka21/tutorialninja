package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{

	@Test(groups= {"sanity","master"})
	public void Verify_Login()
	{
		
		logger.info("*****Starting the TC_002_LoginTest*****");
		logger.debug("Capturing application debug logs.....");
		
		try
		{
		//HomePage
		
		HomePage hp= new HomePage(driver); 
		
		hp.clickMyAccount();	
		logger.info("Clicked on MyAccount link on the homepage");
		hp.ClickLogin(); //login link under my account
		logger.info("Clicked on Login link under myaccount");
		
		//LoginPage
		
		LoginPage lp= new LoginPage(driver);
		
		logger.info("Entering valid email and password...");
		lp.SetEmail(p.getProperty("email"));
		lp.SetPassword(p.getProperty("password"));
		lp.ClickLogin(); //login button
		logger.info("Clicked on Login button...");
		
		
		//My Account page
		
		MyAccountPage macc = new MyAccountPage(driver);
		
		boolean TargetPage=macc.IsMyAccountPageExist();
		
		
			if(TargetPage==true)
			{
				logger.info("Login test passed...");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Login test failed...");
				Assert.fail();
			}
			
			}
			catch(Exception e)
			{
				Assert.fail();
			}

		logger.info("*****Finished the TC_002_LoginTest*****");
		
			
		
	}
	

}
