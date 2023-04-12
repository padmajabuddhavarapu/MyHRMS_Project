package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.FramePage;
import com.hrms.pages.Login_Page;
import com.hrms.utility.BaseClass;

public class TC002 {
@Test
public static void tc002() {
	BaseClass.openApp();
	Login_Page.login("nareshit", "nareshit");
	FramePage.enter_frame();
	AddEmpPage.addEmp("pradeep", "selenium");
	FramePage.exit_frame();
	BaseClass.closeApp();
	
}
}
