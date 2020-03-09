package com.epam.utilities;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.globalutilities.BrowserFactoryImpl;

public class BaseTestClass {
	 public static   WebDriver driver;
		Properties properties = new Properties();
		
		
		@BeforeClass
		public void setUp() throws  IOException {
		String browser=ReadProperties.getBrowser();
		 driver = (BrowserFactoryImpl.browserType(browser)).getBrowserDriver();
		 String baseUrl=ReadProperties.getBaseUrl();
		 driver.get(baseUrl);
		}
		
		@AfterClass
		public void tearDown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
}
