package com.pom.test;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.OrderConfirmationpage;

public class OrderonfirmationPageTest extends TestBase{
	WebDriver driver=null;
    FileReader in=null;
    Properties prop=null;
    
    @Test
    public void testOrderConfirmationpage_sucessmessageshoulddisplay() throws InterruptedException 
    {
    	OrderConfirmationpage confirm=new OrderConfirmationpage(driver);
    	System.out.println("ORDER PLACED SUCCESSFULLY");
     	Assert.assertEquals(confirm.checkOutTitle(),"YOUR ORDER HAS BEEN RECEIVED.");
    }
}
