package com.leaftaps.training;

import org.testng.annotations.Test;
import com.leaftaps.pages.HomePage;

public class TC_Login extends ActionsReusables  {
	
	/*
	 * @Test() //property file as page objects repo public void login() {
	 * locateElement("id",
	 * prop.getProperty("Username.id")).sendKeys("DemoSalesManager");
	 * locateElement("id", prop.getProperty("Password.id")).sendKeys("crmsfa");
	 * locateElement("class", prop.getProperty("Login.class")).click(); }
	 */
	
	
	@Test() //class file as page objects repo
	public void login() {
		enterData(locateElement("id", prop.getProperty("Username.id")), "DemoSalesManager", "username");
		enterData(locateElement("id", prop.getProperty("Password.id")), "crmsfa", "password");
		click(locateElement("class", prop.getProperty("Login.class")), "login");
	}
}
