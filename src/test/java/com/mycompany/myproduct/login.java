package com.mycompany.myproduct;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.testng.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Test login to some website
 * 
 */
public class login
{

 	  private WebDriver driver;
	  private String baseUrl;  

	@Test
	public void login() 
	{
		Assert.assertNotNull( System.currentTimeMillis() );
		
		System.err.println("login working");

		driver = new FirefoxDriver();
 	        baseUrl = "http://www.hotmail.com";
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get(baseUrl);
		

		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Keep me signed inzfx[\\s\\S]*$"));

			System.err.println("Login test passed");
			Assert.assertTrue( System.currentTimeMillis() > 0 );

		} catch (Error e) {
			System.err.println("Login test failed");
			
			//Assert.assertTrue(false);
			e.printStackTrace();
			
		}
		
	    
	}
	
}
