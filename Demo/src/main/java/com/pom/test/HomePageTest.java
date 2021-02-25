package com.pom.test;


import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.HomePage;


public class HomePageTest extends TestBase{

//	WebDriver driver=null;
//    FileReader in=null;
//    Properties prop=null;
    
    @Test
    public void testHomePage_enterTextInSearch_displayProducts() 
    {
    HomePage search=new HomePage(driver);
    search.searchproducts("mens pants");
	search.clicksearch();
    }
}
