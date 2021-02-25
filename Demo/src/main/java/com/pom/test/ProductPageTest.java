package com.pom.test;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.ProductPage;

public class ProductPageTest extends TestBase{


	WebDriver driver=null;
    FileReader in=null;
    Properties prop=null;
    
    @Test
    public void testProductPage_displayProducts_clickonProduct() throws InterruptedException 
    {
    ProductPage product=new ProductPage(driver);
    Thread.sleep(3000);
	product.selectproduct();
    }
}
