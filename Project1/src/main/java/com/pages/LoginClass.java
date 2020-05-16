package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginClass {
	
	
	WebDriver driver;
	public LoginClass(WebDriver driver) {
		this.driver = driver;
	}




	@FindBy(id= "txtUsername")
	WebElement userNameInput;
	
	@FindBy(id = "txtPassword")
	WebElement passInput;
	
	@FindBy(id = "btnLogin")
	WebElement submitBtn;	
	
	@FindBy(id="divLoginButton")   
	WebElement errorMsg;
	
	
	
	
	public void validLogin(String uname , String pass)
	{
		userNameInput.sendKeys(uname);
		passInput.sendKeys(pass);
		submitBtn.click();
	}
	
	
	
	
}
