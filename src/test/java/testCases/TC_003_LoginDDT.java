package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass
{
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_LoginDDT(String email, String password, String exp) //expected result=exp
	{
		
		logger.info("*** Starting TC_003_LoginDDT ***");
	
		
	try {	
	//Home Page
	
	  HomePage hp=new HomePage(driver);
	  hp.clickMyAccount();
	  logger.info("Clicked on MyAccount link on the homepage");
	  hp.ClickLogin(); //Login link under my account
	  logger.info("Clicked on Login link under MyAccount");
	  

	//LoginPage
		
			LoginPage lp= new LoginPage(driver);
			
			logger.info("Entering valid email and password...");
			lp.SetEmail(email);
			lp.SetPassword(password);
			lp.ClickLogin(); //login button
			logger.info("Clicked on Login button...");
			
			
			//My Account page
			
			MyAccountPage macc = new MyAccountPage(driver);
			
			boolean TargetPage=macc.IsMyAccountPageExist();
			
			
				if(exp.equalsIgnoreCase("Valid"))
				{
					if(TargetPage==true)
					{
						macc.ClickLogout();
						Assert.assertTrue(true);
					}
					else 
					{
						Assert.assertTrue(false);
					}
				}
				
				if(exp.equalsIgnoreCase("Invalid"))
				{
					
					if(TargetPage==true)
					{
						macc.ClickLogout();
						Assert.assertTrue(false);
					}
					else
					{
						Assert.assertTrue(true);
					}
					
				}
				
	}
			catch(Exception e)
			{
				Assert.fail();
			}
	   logger.info("*** Finished TC_003_LoginDDT ***");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
