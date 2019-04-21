package com.agile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.agile.utilities.GenericAppMethods;

public class Customerpage extends GenericAppMethods {
	WebDriver driver;
	
	

	public void verifypagetitle(){
		verifytitle("Guru99 Bank Customer HomePage");	
	}
	
	public void verifypagetext(){
	String expected="Welcome To Customer's Page of Guru99 Bank";
    String Actual=GenericAppMethods.driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
    verifytext(expected, Actual);	
	}
	
	public void verifypageheader(){
				
		String expected="Guru99 Bank";
	    String Actual=GenericAppMethods.driver.findElement(By.xpath("//h2[@class='barone']")).getText();
	    verifytext(expected, Actual);
	   
	}
	
	public void verifyimage(){
		WebElement img1=driver.findElement(By.xpath("//img[@src='/Agile_Project/Agi_V1/customer/images/1.gif']"));
		if(img1.isDisplayed()){
			System.out.println("firstimage is displayed");
		}
		else{
			System.out.println("firstimage is displayed");
		}
		WebElement img2=driver.findElement(By.xpath("//img[@src='/Agile_Project/Agi_V1/customer/images/3.gif']"));
		if(img2.isDisplayed()){
			System.out.println("Second image is displayed");
		}
		else{
			System.out.println("Second image is displayed");
	}
		WebElement img3=driver.findElement(By.xpath("//img[@src='/Agile_Project/Agi_V1/customer/images/2.gif']"));
		if(img3.isDisplayed()){
			System.out.println("Third image is displayed");
		}
		else{
			System.out.println("Third image is displayed");
	}
	

}
}
