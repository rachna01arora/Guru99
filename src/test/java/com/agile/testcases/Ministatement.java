package com.agile.testcases;

import org.testng.annotations.Test;

import com.agile.pages.Ministatementpage;

public class Ministatement extends Ministatementpage {

@Test
public void ministatementtest(){
	ministatementlink();
	Displayaccuntlist();
	verifresetyaccount();
	verifyaccount();
	//verifyalert();
	verifytransactionid();
	verifyminstattext();
	clickcontinue();
	verifyreturnpage();
}
}
