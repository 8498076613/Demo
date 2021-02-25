package com.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingPage {
	WebDriver driver;

	public BillingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//button[@class='button btn-checkout']")
	private WebElement checkout;
	@FindBy (xpath="//input[@id='billing:company']")
	private WebElement company;
	@FindBy (xpath="//*[@id=\"billing:street2\"]")
	private WebElement street1;
	
	@FindBy (xpath="//input[@id='billing:street1']")
	private WebElement street;
	@FindBy (xpath="//*[@id=\"billing:city\"]")
	private WebElement city;
	@FindBy (xpath="//select[@id='billing:region_id']")
    private WebElement regionBy;
	@FindBy (xpath="//input[@id='billing:postcode']")
    private WebElement pincode;
	@FindBy (xpath="//*[@id=\"billing:country_id\"]")
	private WebElement countryBy;
	@FindBy (xpath="//input[@id='billing:telephone']")
	private WebElement mobilenumber;
	@FindBy (xpath="(//button[@class='button'])[1]")
    private WebElement billingContinue;
	@FindBy (xpath="//*[@id=\"s_method_freeshipping_freeshipping\"]")
    private WebElement shippingmethod;
	
	@FindBy (xpath="//*[@id=\"shipping-method-buttons-container\"]/button/span/span")
	private WebElement shippingcontinue;
	@FindBy (xpath="//*[@id=\"payment-buttons-container\"]/button")
    private WebElement paymentcontinue;
	@FindBy (xpath="//*[@id=\"review-buttons-container\"]/button/span/span")
    private WebElement placeOrder;
	
	public void setcompanyBy(String company) {
		this.company.sendKeys(company);
	}
	public void setstreetBy(String street) {
		this.street.sendKeys(street);;
	}
	public void setstreet(String street) {
		this.street1.sendKeys(street);;
	}
	public void setcityBy(String city) {
		this.city.sendKeys(city);;
	}
	public void setregionBy(String region) {
		Select drop= new Select(this.regionBy); 
		
		  drop.selectByVisibleText(region);
	}
	public void setpincodeBy(String pincode) {
		this.pincode.sendKeys(pincode);
	}
	public void setcountryBy(String country) {
		Select drop= new Select(this.countryBy); 
		
		  drop.selectByVisibleText(country);
	}
	public void setmobilenumberBy(String mobilenumber) {
		this.mobilenumber.sendKeys(mobilenumber);
	}
	public void click_billingcontinueBy() {
		this.billingContinue.click();
	}
	public void setshippingmethodBy() {
		this.shippingmethod.click();
	}
	public void click_shippingcontinueBy() {
		this.shippingcontinue.click();
	}
	public void click_paymentcontinueBy() {
	   this.paymentcontinue.click();
	}
	public void click_chechoutBy() {
		this.checkout.click();
	}
	public void clickPlaceOrder() {
	this.placeOrder.click();
	}
}

