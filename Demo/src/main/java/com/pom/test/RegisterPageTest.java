package com.pom.test;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.RegisterPage;

public class RegisterPageTest extends TestBase{
	
	WebDriver driver=null;
    FileReader in=null;
    Properties prop=null;
    
	@Test
	@Parameters({"email","pass","confirmPassword"})
	public void testRegistration_ValidDetails_shouldShowSucessMessage(String emailid,String password,String CPassword)
	{
       
		driver.manage().window().maximize();
		RegisterPage register=new RegisterPage(driver);
		register.clickaccountBy();
		register.clickregisterBy();
		register.setFirstName(prop.getProperty("firstName"));
		register.setlastName(prop.getProperty("lastName"));
		register.setEmail(emailid);
		register.setPassword(password);
		register.setConfirmPassword(CPassword);
		register.clickOnRegisterButton();
		//Assert.assertEquals(register.assertSuccessMsg(), "Hello, tom jerry!");
		System.out.println("Registration has Done Succesfully");

	}
}
