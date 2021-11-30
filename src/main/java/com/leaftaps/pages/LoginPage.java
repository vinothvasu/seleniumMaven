package com.leaftaps.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.leaftaps.training.ActionsReusables;

public class LoginPage extends ActionsReusables{

	public LoginPage(WebDriver driver) {
		this.driver = driver; //null = 937bab8f02302a2199a2d9093e65113e
	}

	public LoginPage enterUsername(String username) {
		WebElement el = locateElement("id", prop.getProperty("LoginPage.Username.id"));
		enterData(el, username, "username");
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		WebElement el = locateElement("id", prop.getProperty("LoginPage.Password.id"));
		enterData(el, password, "password");
		return this;
	}
	
	public HomePage clickLogin() {
		WebElement el = locateElement("class", prop.getProperty("LoginPage.Submit.class"));
		click(el, "login button");
		return new HomePage();
	}
	
	
}
