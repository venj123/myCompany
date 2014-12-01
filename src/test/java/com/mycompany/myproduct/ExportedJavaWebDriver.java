package com.mycompany.myproduct;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class ExportedJavaWebDriver {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://forge.collab.net/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testExportedJavaWebDriver() throws Exception {
		selenium.open("/sf/sfmain/do/home");
		selenium.type("id=username", "venkatj");
		selenium.type("id=pwd", "Collabnet10!");
		selenium.click("css=strong");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'Sales Accelerated Feature Request')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a[title=\"Trackers\"] > span.text");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
	
	@Test
	public static void main(String[] args)  {

		com.mycompany.myproduct.ExportedJavaWebDriver executeMe = new com.mycompany.myproduct.ExportedJavaWebDriver();
		try {
			executeMe.setUp();
			executeMe.testExportedJavaWebDriver();
			executeMe.tearDown();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
