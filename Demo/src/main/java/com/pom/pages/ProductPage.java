package com.pom.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
WebDriver driver=null;
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id=\"product-collection-image-416\"]")
	private WebElement product;
	
//	public void scrollPage() throws InterruptedException
//	{
//	JavascriptExecutor executor=(JavascriptExecutor)driver;
//	executor.executeScript("window.scroll(0,300)");
//     Thread.sleep(2000);
//	}
//	
	public void selectproduct() throws InterruptedException
	{
		
		this.product.click();
	}
}
