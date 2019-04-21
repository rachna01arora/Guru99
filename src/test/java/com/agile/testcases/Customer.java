package com.agile.testcases;

import org.testng.annotations.Test;

import com.agile.pages.Customerpage;

public class Customer extends Customerpage {

	@Test
	public void Customertest(){
		verifypagetitle();
		verifypagetext();
		verifypageheader();
		
	}

}
