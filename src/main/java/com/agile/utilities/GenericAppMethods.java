package com.agile.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericAppMethods {
	
	public static RemoteWebDriver driver;

	public String surl;
	public String susername;
	public String spassword;
	
	public Properties prop;
	
	public GenericAppMethods() {
		prop = new Properties();
		
			try {
				prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			susername = prop.getProperty("username");
			spassword = prop.getProperty("password");

}
	public void login(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions chromeoptions = new ChromeOptions();
		//chromeoptions.setBinary(sBinaryPath);
		//we add binary path if chrome is installed in other location
		driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(susername);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(spassword);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//reportStep("The application launched successfully", "PASS");
		
			//reportStep("The application launched successfully", "PASS");
			//reportStep("The application launched successfully", "FAIL");		
	
	}
	
	public long takeSnap() {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),
					new File("./screenshots/images/" + number + ".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed.");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return number;
	}
	
	
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case ("id"):
				return driver.findElementById(locValue);
			case ("link"):
				return driver.findElementByLinkText(locValue);
			case ("xpath"):
				return driver.findElementByXPath(locValue);
			case ("name"):
				return driver.findElementByName(locValue);
			case ("class"):
				return driver.findElementByClassName(locValue);
			case ("tag"):
				return driver.findElementByTagName(locValue);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
		return null;
	
}
	
	public void type(WebElement ele, String data){
		
		ele.sendKeys(data);
	}
	
	public void verifytitle(String expected){
		String actual=driver.getTitle();
		if(expected.contentEquals(actual)){
			
		System.out.println("page title"+" "+ actual +" is correct");
		}
		else{
			takeSnap();
			System.out.println("page title"+" "+ expected +" is not correct");	
		}		
	}
	
public void verifytext(String expected, String Actual){
		
	if(expected.contentEquals(Actual)){
		
		System.out.println("page text"+" "+ Actual+" is correct");
		}
		else{
			takeSnap();
			System.out.println("page text"+" "+ expected +" is not correct");	
		}		
	}

public void verifyalert(String alertexpectedtext){
	
	Alert alert=driver.switchTo().alert();
	String alertactualtext="You Have Succesfully Logged Out!!";
			if(alertactualtext.contentEquals(alertexpectedtext)){
				System.out.println("Alert text displaying is correct");
			}
			else{
				System.out.println("Alert text displaying is not correct");
			}
			alert.accept();
}

public void close(){
	driver.close();
}
}
