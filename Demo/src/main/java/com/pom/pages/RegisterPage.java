package com.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
 WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="(//span[@class='label'])[3]")
	private WebElement clickAccount;
	@FindBy (xpath="//div[@id='header-account']//div//ul//li//a[@title='Register']")
	private WebElement clickRegister;
	@FindBy (xpath="//input[@id=\"firstname\"]")
	private WebElement firstName;
	//@FindBy (xpath="//input[@id=\"middlename\"]")
	//private WebElement middleName;
	@FindBy (xpath="//input[@id=\"lastname\"]")
	private WebElement lastName;
	@FindBy (xpath="//input[@id=\"email_address\"]")
	private WebElement email;
	@FindBy (xpath="//input[@id=\"password\"]")
	private WebElement password;
	@FindBy (xpath="//input[@id=\"confirmation\"]")
	private WebElement confirmPassword;
	@FindBy (xpath="//*[@id=\"form-validate\"]/div[2]/button/span/span")
	private WebElement clickOnRegisterButton;
	private String URL="http://demo-store.seleniumacademy.com/";
	@FindBy(xpath="//*[@id=\"top\"]/body/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/p[1]/strong")
	//@FindBy (xpath="//div[@class='welcome-msg']//p[@class='hello']//strong")
	private WebElement assertRegisterMsg;
	public void clickaccountBy()
	{
		this.clickAccount.click();
	}
	public void clickregisterBy()
	{
		this.clickRegister.click();
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName.sendKeys(firstName);
	}
	
	
	public void setlastName(String lastName)
	{
		this.lastName.sendKeys(lastName);
	}
	public void setEmail(String email)
	{
		this.email.sendKeys(email);
	}
	public void setPassword(String password)
	{
		this.password.sendKeys(password);
	}
	public void setConfirmPassword(String cpassword)
	{
		confirmPassword.clear();
		this.confirmPassword.sendKeys(cpassword);
	}
	public void clickOnRegisterButton() {
		clickOnRegisterButton.click();
	}
	public String assertSuccessMsg()
	{
		return assertRegisterMsg.getText();
	}
}
