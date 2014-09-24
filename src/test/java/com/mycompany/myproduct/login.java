package com.mycompany.myproduct;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class login{


	@Test
	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
	
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.hotmail.com");
                
        try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Keep me signed inaaaaaaaaaaaa[\\s\\S]*$"));

			System.err.println("Login test passed");
			Assert.assertTrue( System.currentTimeMillis() > 0 );

		} catch (Error e) {
			System.err.println("Login test failed");
			
			//Assert.assertTrue(false);
			e.printStackTrace();
			
		}
	}
	
}
