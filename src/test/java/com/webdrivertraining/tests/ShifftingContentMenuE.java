package com.webdrivertraining.tests;

import com.webdrivertraining.testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShifftingContentMenuE extends TestBase {
	
	String baseUrl = 		"http://the-internet.herokuapp.com/shifting_content/menu";
	String baseUrlShifted = "http://the-internet.herokuapp.com/shifting_content/menu?mode=random";
	
	@Test
	public void overLaping() {
		
		getDriver().get(baseUrl);
		
		WebElement portfolio = getDriver().findElement(By.cssSelector(" #content > div > ul > li:nth-child(4) > a"));
		
		WebElement gallery = getDriver().findElement(By.cssSelector(".shift"));
		
		String res = gallery.getCssValue("left"); //getText(); //
			
		assertTrue(res.equals("0px"));	
		
	}
	
	@Test
	public void overLaping2() {
		
		getDriver().get(baseUrlShifted);
			
		WebElement gallery = getDriver().findElement(By.cssSelector(".shift"));
		
		String res = gallery.getCssValue("left"); //getText(); //
		
		assertFalse(res.equals("0px"));	
		
	}

}
