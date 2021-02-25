package com.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id=\"swatch15\"]/span[1]/img")
	private WebElement colour;
	@FindBy (xpath="//*[@id=\"swatch63\"]/span[1]")
	private WebElement size;
	@FindBy (xpath="//*[@id=\"qty\"]")
	private WebElement quantity;
	@FindBy (xpath="//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/div[2]/div[2]/button")
    private WebElement addtocart;
	
	public void setcolourBy() {
		this.colour.click();
	}
	public void setsizeBy() {
		this.size.click();
	}
	public void setquantityBy(String value) {
		WebElement we=this.quantity;
		we.click();
		we.clear();
		we.sendKeys(value);
	}
	public void addtocartBy() {
		this.addtocart.click();
	}
}



