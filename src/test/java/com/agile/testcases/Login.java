package com.agile.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.agile.utilities.GenericAppMethods;

public class Login extends GenericAppMethods {
	/*@BeforeTest
	   public void setData()
	    {
			testCaseName="Login";
			testDescription="The following test case is to create a login";
			testNodes="Create Alert";
	    }*/
	@Test
	public void login1(){
		login();
		takeSnap();
		locateElement("xpath", "//a[@href='Customerhomepage.php']").click();
		//customer page	
}

}