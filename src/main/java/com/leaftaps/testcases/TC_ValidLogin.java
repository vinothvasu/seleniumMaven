package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leaftaps.training.TestNGReusables;

public class TC_ValidLogin extends TestNGReusables {
	
	@Test
	public void TC_validLogin() {
		new LoginPage(driver)
		.enterUsername("Jaya")
		.enterPassword("Venkat")
		.clickLogin();
	}
}
