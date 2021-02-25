package com.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy (xpath="//div[@class='block-content']//ul//li[@class='current']//a//strong")
	private WebElement dashboard;
	@FindBy (xpath="//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/p[1]/strong")
	private WebElement checkMessage;
	@FindBy (xpath="//input[@id='search']")
	private WebElement searchBox;
	@FindBy (xpath="//*[@id=\"search_mini_form\"]/div[1]/button")
    private WebElement clickButton;

	public void clickdashboard() {
		this.dashboard.click();
	}
	public String assertcheckBy()
	{
		return checkMessage.getText();
	}
	public void searchproducts(String search) {
		Actions act=new Actions(driver);
		act.moveToElement(searchBox).click().build().perform();
		
		this.searchBox.sendKeys(search);
	}
	//Method for search
	public void clicksearch() {
		clickButton.click();
		   //driver.sendKeys("men pants");
		 }
}

