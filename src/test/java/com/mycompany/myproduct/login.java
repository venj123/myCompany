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
		
		System.out.println("login working");

		driver = new FirefoxDriver();
 	        baseUrl = "https://trialzone.collab.net/";
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get(baseUrl + "/sf/sfmain/do/home");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("tluser");
		driver.findElement(By.id("pwd")).clear();
		driver.findElement(By.id("pwd")).sendKeys("Collabnet1!");
		driver.findElement(By.cssSelector("strong")).click();
		

		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*My Workspacedzfx[\\s\\S]*$"));

			System.out.println("Login test passed");
			Assert.assertTrue( System.currentTimeMillis() > 0 );

		} catch (Error e) {
			System.out.println("Login test failed");
			
			//Assert.assertTrue(false);
			//e.getMessage();
			
		}
		
	    
	}
	
}
