package com.maven.Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.LoginClass;

public class LoginTest  extends BasicClass{
	
	
	@Test
	public static void loginData() throws InterruptedException, IOException {
		log1.info("Login Start");
		LoginClass obj = PageFactory.initElements(driver, LoginClass.class);
		Thread.sleep(3000);
		
		
		
		////
		
		
		File f = new File("F:\\Selenium\\Loginorm.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook WB = new XSSFWorkbook(fis);

		XSSFSheet Sheet1 = WB.getSheet("Sheet1");
		
		
		int num = Sheet1.getLastRowNum();
		 String username= "";
		 String pass ="";
		
		for(int i =1 ; i<=num;i++)
		{
			username = Sheet1.getRow(i).getCell(0).getStringCellValue();
			pass = Sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username +pass);
		}
		
		
		
		
		obj.validLogin(username, pass);
		Thread.sleep(3000);
		
		log1.info("Login Successfully....");
	

	}
	
	
	
	
	

}
