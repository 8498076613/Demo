package com.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartAddDetailsPage {
	WebDriver driver;
	public CartAddDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="(//button[@class='button btn-proceed-checkout btn-checkout'])[2]")
    private WebElement checkoutbutton;
	

	public void click_checkoutbuttonBy() {
		this.checkoutbutton.click();
	}
}


