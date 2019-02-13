package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdrivertraining.testbase.TestBase;

public class DinamicallyLoadedPageElements extends TestBase {
	
	String baseUrl = "http://the-internet.herokuapp.com/dynamic_loading/1";
	String baseUrl2 = "http://the-internet.herokuapp.com/dynamic_loading/2";

	
	@Test
	public void checkhForAppear() {
		
		WebDriverWait wait = new WebDriverWait(getDriver(),5);
			
		getDriver().get(baseUrl);	
		getDriver().findElement(By.cssSelector("#start > button")).click();	
		// wait for this 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector( "#finish > h4")));	
		// text of field:
		String res = getDriver().findElement(By.cssSelector("#finish > h4")).getText();
			
		assertTrue(res.equals("Hello World!"));
			
	}
	
	@Test
	public void checkhForAppear2() {
		
		WebDriverWait wait = new WebDriverWait(getDriver(),5);
			
		getDriver().get(baseUrl2);	
		getDriver().findElement(By.cssSelector("#start > button")).click();	
		// wait for this 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector( "#finish > h4")));
		// text of field:
		String res = getDriver().findElement(By.cssSelector("#finish > h4")).getText();
			
		assertTrue(res.equals("Hello World!"));
			
	}
	

}
