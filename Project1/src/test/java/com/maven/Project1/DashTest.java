package com.maven.Project1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.DashBoardClass;
import com.pages.LoginClass;

public class DashTest extends BasicClass {
	
	@Test
	public static void loginData() throws InterruptedException {

		log1.info("DashBoard Start");
		DashBoardClass obj = PageFactory.initElements(driver, DashBoardClass.class);
		Thread.sleep(3000);
		obj.adminClick();
		log1.info("DashBoard End");	
		

	}

}
      