package com.mycompany.myproduct;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.testng.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import testlink.api.java.client.TestLinkAPIResults;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;


/**
 * Test login to some website
 * 
 */
public class login
{
	  private String resultado = null;
	  private String nota = null;
 	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  
		//final String DEVKEY = "c3ec77835ff0f63da1faae2b526e552f";
		//final String URL = "http://localhost:8081/testlink-1.9.10/lib/api/xmlrpc/v1/xmlrpc.php";
		//final String PROJETO = "testproj1";
		//final String PLANO = "testplan1";
		//final String BUILD = "build1";
		//final String CASO_TESTE1 = "test_selenium";

	@Test
	public void login() 
	{
		Assert.assertNotNull( System.currentTimeMillis() );
		
		System.out.println("login3 working");

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
			System.out.println("passed");
			Assert.assertTrue( System.currentTimeMillis() > 0 );

		} catch (Error e) {
			System.out.println("failed");
			
			Assert.assertTrue( false );
			nota = e.getMessage();
			verificationErrors.append(e.toString());
		}
		
	    
	}
	
}
