package com.agile.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.agile.utilities.GenericAppMethods;

public class Ministatementpage extends GenericAppMethods{
	WebDriver driver;
	
public void ministatementlink(){
	locateElement("xpath","//a[contains(text(),'Mini Statement')]").click();
	System.out.println("user has successfully navigated to Mini statement page");
}
public void Displayaccuntlist(){
	Select List=new Select(GenericAppMethods.driver.findElement(By.xpath("//select[@name='accountno']")));
	
	List<WebElement> Alloptions=List.getOptions();
	System.out.println(Alloptions);
}

public void verifresetyaccount(){
Select Accountno=new Select(GenericAppMethods.driver.findElement(By.xpath("//select[@name='accountno']")));
Accountno.selectByIndex(1);
locateElement("xpath","//input[@value='Reset']").click();
System.out.println("all the values are successfully reset");

}
public void verifyaccount(){
Select Accountno=new Select(GenericAppMethods.driver.findElement(By.xpath("//select[@name='accountno']")));
Accountno.selectByIndex(1);
locateElement("xpath","//input[@value='Submit']").click();
System.out.println("all the values are successfully submit");
}

public void verifyalert(){
	//Alert("You are not authorize to generate statement of this Account!!");
}

}
