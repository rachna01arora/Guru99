package com.agile.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectMethods extends GenericAppMethods {
	WebDriver driver;
	
	public void verifytitle(String expected, String actual){
		if(expected.contentEquals(actual)){
			
		System.out.println("page title"+" "+ actual +"is correct");
		}
		else{
			takeSnap();
			System.out.println("page title"+" "+ expected +"is not correct");	
		}		
	}
	
public void verifytext(String expected, WebElement Ele){
	if(expected.contentEquals(Ele.getText())){
		
		System.out.println("page text"+" "+ Ele.getText() +"is correct");
		}
		else{
			takeSnap();
			System.out.println("page text"+" "+ expected +"is not correct");	
		}		
	}
		
	}
	


