package com.maven.Project1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.AdminClass;

public class AdminTest extends BasicClass {
	
	@Test
	public void adminTest() {
		
		AdminClass obj = PageFactory.initElements(driver, AdminClass.class);
		obj.clickMethod();
	}

}
