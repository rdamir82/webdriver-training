package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class FillUpAndRetrievePassword extends TestBase {
	
	String baseUrl = "http://the-internet.herokuapp.com/forgot_password";
	
	@Test
	public void fillUpAndRetrievePassword() {
		
		getDriver().get(baseUrl);
		
		getDriver().findElement(By.cssSelector("#email")).sendKeys("email@rest.com");
		
		getDriver().findElement(By.cssSelector("#form_submit > i")).click();
		
		String res = getDriver().findElement(By.cssSelector("#content")).getText();
		
		assertTrue(res.equals("Your e-mail's been sent!"));	
		
	}

}
