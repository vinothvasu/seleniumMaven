package com.leaftaps.training;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGReusables {

	public WebDriver driver;
	public static Properties prop;//static - will be stored in the class loader;


	@BeforeSuite
	public void loadPageObjects() {	
		FileInputStream file;
		try {
			file = new FileInputStream("./src/main/resources/pageobjects.properties");
			prop = new Properties();
			prop.load(file);
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}


	@BeforeTest
	public void initialiseWebDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");	
		driver = new ChromeDriver(); //null ; 937bab8f02302a2199a2d9093e65113e
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void launchApplication() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	public WebElement locateElement(String locator, String locatorValue) {

		try {
			WebElement el = null;

			switch(locator) {	
			case "id":
				return driver.findElement(By.id(locatorValue));

			case "class":
				return driver.findElement(By.className(locatorValue));

			case "xpath":
				return driver.findElement(By.xpath(locatorValue));

			case "name":
				return driver.findElement(By.name(locatorValue));

			case "link":
				return driver.findElement(By.linkText(locatorValue));

			default:
				return el;
			}
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("Element not found");
		}
	}

	public WebElement locateElement(By locator) {
		return driver.findElement(locator);
	}

	@AfterSuite
	public void tearDown() {	
		driver.quit();
	}

}

