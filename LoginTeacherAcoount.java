package com.infofactors.acegrades.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.infofactors.acegrades.constants.AcegradesConstants;
import com.infofactors.acegrades.libraries.AcegradesHomePage;

public class LoginTeacherAcoount extends AcegradesConstants
{
	@Test
	public void loginTeacher() throws InterruptedException
	{
		boolean res;
		AcegradesHomePage ahome=new AcegradesHomePage();
		ahome.loginteusname="01mmmm@gmail.com";
		ahome.logintepwd="123456";
		res=ahome.loginTeacherAccount(ahome.loginteusname,ahome.logintepwd);
		Assert.assertTrue(res);
	}
	
	
}
