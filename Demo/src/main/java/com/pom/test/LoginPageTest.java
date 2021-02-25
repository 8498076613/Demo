package com.pom.test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.pom.base.TestBase;
import com.pom.pages.LoginPage;


public class LoginPageTest extends TestBase {
//	WebDriver driver=null;
//    FileReader in=null;
//    Properties prop=null;
    

	@Test(priority=1)
	@Parameters({"emailid","Invalidpassword"})
	public void testLoginPage_InValidDetails_shouldShowErrorMessage(String emailid,String password) throws InterruptedException
	{
		
		driver.manage().window().maximize();
		LoginPage login=new LoginPage(driver);
		login.accountBy();
		login.loginBy();
		login.enterEmail(emailid);
		login.enterPassword(password);
		login.clicklogin();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	}
	@Test(priority=2)
	@Parameters({"email","password"})
	public void testLogin_ValidDetails_shouldAllowToPurchaseProduct(String emailid,String password) throws InterruptedException
	{
		driver.manage().window().maximize();
		LoginPage login=new LoginPage(driver);
		login.accountBy();
		login.loginBy();
		login.enterEmail(emailid);
		login.enterPassword(password);
		login.clicklogin();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	}
	
	
	
}
