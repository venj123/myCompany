package com.mycompany.myproduct;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class myJUnitSample1 {
	

	   @Test
	   public void testPrintMessage() {
	      String message = "New Word";
	      assertEquals(message, "Hello World");
	   }

}
