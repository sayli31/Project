package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminClass 
{
	
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement userMang;
	
	
	public void clickMethod()
	{
		userMang.click();
	}
	
	

}
