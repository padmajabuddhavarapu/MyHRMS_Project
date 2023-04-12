package com.hrms.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClass {
//driver,openApp,closeApp
	public static WebDriver driver;
	public static void openApp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ROHITH\\Drivers\\chromedriver.exe");
	ChromeOptions obj= new ChromeOptions();
	obj.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(obj);
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application opened");
	}
	public static void closeApp() {
		driver.close();
		Reporter.log("Application closed");
	}
	
	
	
	
	
	
	
}
