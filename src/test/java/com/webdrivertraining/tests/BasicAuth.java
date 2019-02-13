package com.webdrivertraining.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class BasicAuth extends TestBase{
	
	@Test
	public void BasicAuthTest0() {
		String username = "admin";
		String passw = "admin";
		getDriver().get("http://"+ username+":"+passw+"@the-internet.herokuapp.com/basic_auth");
		//getDriver().get("http://the-internet.herokuapp.com/basic_auth");
		String s = getDriver().findElement(By.tagName("H3")).getText();
		assertEquals(s,"Basic Auth");
	}

}
