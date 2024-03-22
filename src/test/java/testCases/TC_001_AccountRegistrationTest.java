package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	
	@Test(groups= {"regression","master"})
	public void Verify_Account_Registration()
	{
		logger.info("***Starting TC_001_AccountRegistrationTest***"); //for logs
		logger.debug("Application logs started.......");
		
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount link");
		
		hp.clickRegister();
		logger.info("Clicked on Registeration link");
		
		logger.info("Entering Customer details");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setfirstname(randomeString().toUpperCase());
		regpage.setLastname(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com"); //randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumberic();
		
		regpage.setPassword(password);
		regpage.setPasswordCnfrm(password);
		
		regpage.ClickCheckPolicy();
		regpage.ClickContinue();
		logger.info("Clicked on Continue");
		
		String Cnfmsg=regpage.GetconfirmationMsg();
		
		logger.info("Validating expected message.....");
		
		
		
		if(Cnfmsg.equals("Your Account Has Been Created!")) //to fail the test change the text
		{
			logger.info("Test Passed");
			Assert.assertTrue(true);
		}
		
		else
		{
			logger.error("Test Failed");
			Assert.fail();
		}
		
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			Assert.fail();
		}
		
		logger.debug("Application logs ended.......");
		logger.info("***Finished TC_001_AccountRegistrationTest***");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
