package com.webdrivertraining.tests;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class BasicAuthDamir extends TestBase {
	
	private final String baseUrl = "http://the-internet.herokuapp.com/basic_auth";
	
	
	@Test
	public void authorisation() {
		
		final String username = "admin";
		final String password = "admin";
		By successMsg = By.cssSelector("p");
		String exceptedStringAfterLogIn = "Congratulations! You must have the proper credentials.";
		String[] split = (baseUrl.split("://"));
				
		String logInUrl = "" + split[0] + "://" + username + ":" + password + "@" + split[1]; 
			
		getDriver().get(logInUrl);
		
		String result = getDriver().findElement(successMsg).getText();
				
		assertTrue(result.equals(exceptedStringAfterLogIn));
			
	}
}