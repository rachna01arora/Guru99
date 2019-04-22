package com.agile.testcases;

import org.testng.annotations.Test;

import com.agile.pages.Logoutpage;

public class logouttest extends Logoutpage{
	
	@Test
	public void logouttestcases(){
		logout();
		verifyalertmessage();
		verifyreturnloginpage();
	}

}
