package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Login_Page;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 {
	@Test
	public static void tc001() {
		BaseClass.openApp();
		VerifyPage.verifytitle("HRMS");
		Login_Page.login("nareshit","nareshit");
		VerifyPage.verifytitle("OrangeHRM");
		LogoutPage.logout();
		BaseClass.closeApp();
	}

}
