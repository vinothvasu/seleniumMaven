package com.leaftaps.training;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class ActionsReusables extends TestNGReusables {


	public void enterData(WebElement el, String data, String elementDescription) {
		try {
			el.sendKeys(data);
		}catch(NoSuchElementException e) {
			System.out.println("Data - "+data+ " failed to enter in "+elementDescription+" - No such element exception occured"+e);
		}catch(Exception e) {
			System.out.println("Data - "+data+ " failed to enter in "+elementDescription+" - exception occured "+e);
		}
	}
	
	public void click(WebElement el, String elementDescription) {
		try {
			el.click();
		}catch(NoSuchElementException e) {
			System.out.println("Failed to click element "+elementDescription+" - No such element exception occured"+e);
		}catch(Exception e) {
			System.out.println("Failed to click element "+elementDescription+" - exception occured "+e);
		}
	}

}
