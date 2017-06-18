package com.infofactors.acegrades.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.infofactors.acegrades.constants.AcegradesConstants;
import com.infofactors.acegrades.libraries.AcegradesHomePage;

public class CreateTeacgerAccountTest extends AcegradesConstants
{
	
	@Test
	public void CreateTeachetAccountTest() throws InterruptedException
	{
		boolean res;
		AcegradesHomePage ahome=new AcegradesHomePage();
		ahome.teacherUname="03mmmm@gmail.com";
		ahome.teacherPwd="123456";
		res=ahome.createTeacherAccount(ahome.teacherUname,ahome.teacherPwd);
		 Assert.assertTrue(res);
	}

}
