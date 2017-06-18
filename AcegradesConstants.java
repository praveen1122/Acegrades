package com.infofactors.acegrades.constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AcegradesConstants 
{
	
	public static WebDriver driver=new FirefoxDriver();
	public static String url="http://acegrades.com";
	
	 @BeforeSuite
	 public static void launchApp()
	 {
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(url);
	 }
	 
	 @AfterSuite
	 public static void closeApp()
	 {
		 driver.close();
	 }

}
