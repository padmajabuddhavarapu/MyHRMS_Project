package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LogoutPage  extends BaseClass {
//objects &functions
	//objects
	static By  logout = By.linkText("Logout");
	public static  void logout() {
		driver.findElement(logout).click();
		Reporter.log("Logout completed");
		
	}
	
}
