package com.pom.test;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.BillingPage;

public class BillingPageTest extends TestBase{

	WebDriver driver=null;
    FileReader in=null;
    Properties prop=null;
    
    @Test
    public void testBillingPage_provideAddress_SetAllRequiredFields() throws InterruptedException 
    {
    	BillingPage billing=new BillingPage(driver);
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
    }
}
