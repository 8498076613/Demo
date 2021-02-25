package com.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
protected WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//span[@class='label'])[3]")
	private WebElement clickAccount;
	@FindBy (xpath="//div[@class='links']//ul//li[@class=' last']//a")
	private WebElement clickLogin;
	@FindBy (xpath="//input[@type=\"email\"][@title=\"Email Address\"]")
	private WebElement email;
	@FindBy (xpath="//input[@type=\"password\"]")
	private WebElement password;
	@FindBy (xpath="//button[@type=\"submit\"][@title=\"Login\"]")
	private WebElement login;
	@FindBy (xpath="//*[@id=\"top\"]/body/div[1]/div[2]/div[2]/div/div/div[2]/ul/li/ul/li/span")//span[text()="Invalid login or password."]
	private WebElement invalidMsg;
	//Method to enter emailid
	public void accountBy()
	{
		this.clickAccount.click();
	}
	
	public void loginBy() {
		this.clickLogin.click();
	}
	public void enterEmail(String mail) {
		this.email.sendKeys(mail);
	}
		//Method to enter password
	public void enterPassword(String pass) {
		 this.password.sendKeys(pass);
	}
		
	 public void clicklogin() {
		this.login.click();
	}
			 
	public String errorMessage()
    {
		 return this.invalidMsg.getText();
	}
}

