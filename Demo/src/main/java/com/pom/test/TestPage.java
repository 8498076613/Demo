package com.pom.test;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.pom.pages.BillingPage;
import com.pom.pages.CartAddDetailsPage;
import com.pom.pages.CartPage;
import com.pom.pages.HomePage;
import com.pom.pages.LoginPage;
import com.pom.pages.OrderConfirmationpage;
import com.pom.pages.ProductPage;
import com.pom.pages.RegisterPage;

public class TestPage {
	WebDriver driver=null;
    FileReader in=null;
    Properties prop=null;
   
    
	@BeforeClass
	public void setup() throws IOException {
		 in = new FileReader("src/main/resources/File.properties");
		 prop=new Properties();
		 prop.load(in);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driver_path"));
	    driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}

	@AfterClass
	public void tearDown() {
		//driver.close();
	}
	
	
	 
	@Test(priority=1)
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
		System.out.println("Registration has Done Succesfully");
		
		//Assert.assertEquals(register.assertSuccessMsg(), "Hello, tom jerry!");
	
	}
	
	@Test(priority=2)
	@Parameters({"emailid","password"})
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
		//Assert.assertEquals(login.errorMessage(), "Invalid login or password.");
		
	}
	@Test(priority=3)
	@Parameters({"email","pass"})
	public void testLogin_ValidDetails_shouldAllowToPurchaseProduct(String emailid,String password) throws InterruptedException
	{
		
		driver.manage().window().maximize();
		LoginPage login=new LoginPage(driver);
		HomePage search=new HomePage(driver);
		ProductPage product=new ProductPage(driver);
		CartPage cart=new CartPage(driver);
		CartAddDetailsPage shopping=new CartAddDetailsPage(driver);
		BillingPage billing=new BillingPage(driver);
		OrderConfirmationpage confirm=new OrderConfirmationpage(driver);
		driver.manage().window().maximize();
		login.accountBy();
		login.loginBy();
		login.enterEmail(emailid);
		login.enterPassword(password);
		login.clicklogin();
		Thread.sleep(3000);
		//search.clickdashboard();
		//Assert.assertEquals(search.assertcheckBy(), "Hello, tom jerry!");
		System.out.println(search.assertcheckBy());
		search.searchproducts("mens pants");
		search.clicksearch();
	                                                                              
		Thread.sleep(3000);
		product.selectproduct();
		cart.setcolourBy();
		cart.setsizeBy();
		cart.setquantityBy("2");
		cart.addtocartBy();
		shopping.click_checkoutbuttonBy();
		WebElement newadd=driver.findElement(By.xpath("//select[@id='billing-address-select']"));
		  Select drp= new Select(newadd); 
		  drp.selectByVisibleText("New Address");
		billing.setcompanyBy("avengers");
		billing.setstreetBy("stark towers");
		billing.setstreet( "Street");
		billing.setcityBy("america");
		billing.setregionBy("Utah");
		billing.setpincodeBy("100006");
		billing.setcountryBy("India");
		billing.setmobilenumberBy("9765451232");
		billing.click_billingcontinueBy();
	    Thread.sleep(3000);
		billing.setshippingmethodBy();
		billing.click_shippingcontinueBy();
		billing.click_paymentcontinueBy();
		billing.click_chechoutBy();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		System.out.println("ORDER PLACED SUCCESSFULLY");
     	Assert.assertEquals(confirm.checkOutTitle(),"YOUR ORDER HAS BEEN RECEIVED.");
		
		
		

	}
}
