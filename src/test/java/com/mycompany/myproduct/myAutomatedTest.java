package com.mycompany.myproduct;

import org.testng.Assert;
import org.testng.annotations.Test;


public class myAutomatedTest
{
     @Test
	public void myAutomatedTest() 
	{
		
		Assert.assertTrue( System.currentTimeMillis() > 0 );
	}
	
}
