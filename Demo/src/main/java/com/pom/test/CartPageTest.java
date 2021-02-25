package com.pom.test;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.CartPage;

public class CartPageTest extends TestBase {

	WebDriver driver=null;
    FileReader in=null;
    Properties prop=null;
    
    @Test
    public void testCartPage_clickOnRequired_itemsAddedtoCart() throws InterruptedException 
    {
    	CartPage cart=new CartPage(driver);
    	cart.setcolourBy();
		cart.setsizeBy();
		cart.setquantityBy("2");
		cart.addtocartBy();
    }
}
