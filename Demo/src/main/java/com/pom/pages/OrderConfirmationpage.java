package com.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationpage {
WebDriver driver=null;
	
	public OrderConfirmationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//div[@class='page-title']")
	private WebElement checkout;
	public String checkOutTitle() {
	  return checkout.getText();
	}
}
