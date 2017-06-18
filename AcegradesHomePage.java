package com.infofactors.acegrades.libraries;



import org.openqa.selenium.By;


import com.infofactors.acegrades.constants.AcegradesConstants;

public class AcegradesHomePage extends AcegradesConstants
{   
	  public static  String teacherUname;
	  public static  String teacherPwd;
	  public static  String loginteusname;
	  public static  String logintepwd;
	   
	public boolean createTeacherAccount(String uname,String pwd) throws InterruptedException 
	{
		driver.findElement(By.linkText("SIGNUP")).click();
		driver.findElement(By.id("email")).sendKeys(uname);//"45mmmm@gmail.com"
		driver.findElement(By.id("password")).sendKeys(pwd);//123456
		driver.findElement(By.xpath("//div[2]/form/button")).click();
		
		driver.findElement(By.id("name")).sendKeys("Teacher Student");
		
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div[1]/div/ul/li[3]/span")).click();
		
		driver.findElement(By.id("zip")).sendKeys("123456");
		driver.findElement(By.id("school")).sendKeys("infofactors");
		
		driver.findElement(By.xpath("//div[4]/div[1]/div/input")).click();
		driver.findElement(By.xpath("//div[4]/div[1]/div/ul/li[4]/span")).click();
		    
		driver.findElement(By.xpath("//form/div[1]/div[2]/div[4]/div[2]/input")).sendKeys("Second");
		    
		driver.findElement(By.xpath("//div/div/button")).click();
	
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Teacher Stud")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logoutId")).click();
		if(driver.findElement(By.id("loginId")).isDisplayed()) 
		    {
		    	
		     return true;
				
			} else 
			{
				return false;
		} 
	}
		
	public boolean loginTeacherAccount(String uname,String pwd) throws InterruptedException
	{
		driver.findElement(By.partialLinkText("LOG I")).click();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//div/div/div/div[2]/form/button")).click();
		Thread.sleep(2);
		driver.findElement(By.xpath("//div[3]/div[1]/div[1]/div[2]/div/a[2]")).click();
		//driver.findElement(By.xpath("")).click();
		

		if (driver.findElement(By.id("loginId")).isDisplayed())
		{
			return true;
			
		} else
		{
			return false;

		}
	}	
}
	


