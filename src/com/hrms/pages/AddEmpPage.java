package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class AddEmpPage extends BaseClass {
//objects & functions
	//objects 
	 static By Add_btn = By.xpath("//input[@value ='Add']");
	 static By txt_lastname = By.name("txtEmpLastName");
	 static By txt_firstname = By.name("txtEmpFirstName");
	 static By save_btn = By.xpath("//input[@value ='Save']");
	 //functions
	 public static void addEmp( String LN,String FN) {
		 driver.findElement(Add_btn).click();
		 driver.findElement(txt_lastname).sendKeys(LN);
		 driver.findElement(txt_firstname).sendKeys(FN);
		 driver.findElement(save_btn).click();
		 Reporter.log("New Employee added");
	 }
}
