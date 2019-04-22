package com.agile.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

public void verifytransactionid(){
	List<WebElement> elements = GenericAppMethods.driver.findElements(By.xpath("//table[@border='1']//tbody//tr//td"));
	for(int i=0; i<elements.size(); i++){	
		WebElement value=elements.get(i);
		String textvalue=value.getText();
		System.out.println("value of all the rows are "+ textvalue);
	}
}

public void verifyminstattext(){
	verifytext("Last Three Transaction Details for Account No: 3308","//p[@class='heading3']");	
}
public void clickcontinue(){
	locateElement("xpath", "//*[text()='Continue']").click();
}

public void verifyreturnpage(){
	String expected="http://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
	String actual=GenericAppMethods.driver.getCurrentUrl();
	if(actual.contentEquals(expected)){
		System.out.println("It has returned to customer homepage");
	}
	else{
		System.out.println("It has not returned to customer homepage");
	}
}
}


