package com.maven.Project1;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicClass {
	
	public static WebDriver driver = null;
	static Logger log1 = LogManager.getLogger(BasicClass.class);
	
	@BeforeSuite
	public void initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterSuite
	public void closeDriver() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
}
