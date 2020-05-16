package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardClass {

	

	WebDriver driver;
	public DashBoardClass(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminBtn;
	
	
	public void adminClick()
	{
		adminBtn.click();
		
	}	
	
	
	
	


}
