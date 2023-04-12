package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class FramePage  extends BaseClass{
	 
		 
		 
		 public static void enter_frame() {
			 driver.switchTo().frame("rightMenu");
			 Reporter.log("entered into frames");
	 }
		 public static void exit_frame() {
			 driver.switchTo().defaultContent();
			 Reporter.log("exit from frames");
	 }
}
