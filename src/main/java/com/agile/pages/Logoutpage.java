package com.agile.pages;

import org.openqa.selenium.WebDriver;

import com.agile.utilities.GenericAppMethods;

public class Logoutpage extends GenericAppMethods {
	WebDriver driver;
	
	public void logout(){
		locateElement("xpath", "//a[contains(text(),'Log out')]").click();
		System.out.println("user is successfully logout");
	}
	
	public void verifyalertmessage(){
		verifyalert("You Have Succesfully Logged Out!!");
	}
		
		public void verifyreturnloginpage(){
			String expected="http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
			String actual=GenericAppMethods.driver.getCurrentUrl();
			if(actual.contentEquals(expected)){
				System.out.println("It has returned to lognin homepage");
			}
			else{
				System.out.println("It has not returned to login homepage");
			}

}
}
