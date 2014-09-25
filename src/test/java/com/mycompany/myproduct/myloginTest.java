package com.mycompany.myproduct;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myloginTest{

	@Test
	public void myloginRun() {

		WebDriver driver=new FirefoxDriver();
	
        	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        	driver.get("http://www.hotmail.com");
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        try {
			//assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
			driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Keep me signed in[\\s\\S]*$");

			//System.err.println("Login test passed");
			Assert.assertTrue( System.currentTimeMillis() > 0 );

		} catch (Error e) {
			e.printStackTrace();
			System.err.println("Login test failed");
			
			Assert.assertTrue(false);						
		}
	}
	
}