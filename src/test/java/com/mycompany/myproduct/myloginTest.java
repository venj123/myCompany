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
			Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Keep me signed in[\\s\\S]*$"));

			//driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Keep me signed inaaaaaaaaaaa[\\s\\S]*$");

			System.err.println("Login test passed");

		} catch (Error e) {
			e.printStackTrace();
			System.err.println("Login test failed");
			
			Assert.assertTrue(false);						
		}
	}
	
}
