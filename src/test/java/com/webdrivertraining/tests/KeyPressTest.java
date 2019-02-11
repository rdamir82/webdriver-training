package com.webdrivertraining.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.webdrivertraining.testbase.TestBase;



public class KeyPressTest extends TestBase {

	final String key="Q";
	@Test
	public void keyPressTest01() {
		// navigate to http://the-internet.herokuapp.com/key_presses
		//press enter
		//check for ENTER string on page (assert)
		getDriver().get("http://the-internet.herokuapp.com/key_presses");
		
		getDriver().findElement(By.tagName("Body")).sendKeys(key);
		
		String resoult;
		resoult = getDriver().findElement(By.id("result")).getText();
		
		
		Assertions.assertEquals("You entered: "+key,resoult);

	
	}
	
	/*@Test
	public void keyPressTest02() {
		// navigate to http://the-internet.herokuapp.com/key_presses
		//press E
		//check for E string on page (assert)

		
	}*/
}
