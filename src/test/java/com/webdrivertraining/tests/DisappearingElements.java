package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class DisappearingElements extends TestBase {
	
	
	
	String baseUrl = "http://the-internet.herokuapp.com/disappearing_elements";


	@Test
	public void checboxCheck() {
		
		getDriver().get(baseUrl);
		
		WebElement element1 = getDriver().findElement(By.cssSelector("[href='\\/']"));
		WebElement element2 = getDriver().findElement(By.cssSelector("[href='\\/about\\/']"));
		WebElement element3 = getDriver().findElement(By.cssSelector("[href='\\/contact-us\\/']"));
		WebElement element4 = getDriver().findElement(By.cssSelector("[href='\\/portfolio\\/"));
		WebElement element5 = getDriver().findElement(By.cssSelector("[href='\\/gallery\\/"));	
			
		assertTrue(element1.isDisplayed());	
		assertTrue(element2.isDisplayed());	
		assertTrue(element3.isDisplayed());		
		assertTrue(element4.isDisplayed());	
		assertTrue(element5.isDisplayed());	
		
	}
	
	

}
