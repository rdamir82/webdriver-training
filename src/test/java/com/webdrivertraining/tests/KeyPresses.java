package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.webdrivertraining.testbase.TestBase;


public class KeyPresses extends TestBase {
	
	String baseUrl = "http://the-internet.herokuapp.com/key_presses";
	
	
	@Test
	 public void keyPresses() {
		
		getDriver().get(baseUrl);
		
		String exceptedRes = "You entered: ENTER";
		 
		getDriver().findElement(By.tagName("body")).sendKeys(Keys.RETURN);
		
		String res = getDriver().findElement(By.id("result")).getText();
		assertEquals(exceptedRes, res); 			
		
			    
	    }  
	
	
	
	

}
