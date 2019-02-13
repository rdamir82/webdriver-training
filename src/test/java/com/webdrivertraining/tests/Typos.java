package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class Typos extends TestBase {
	
	String baseUrl = "http://the-internet.herokuapp.com/typos";
	
	@Test
	public void checkTypos() {
		
		String exceptedText = "Sometimes you'll see a typo, other times you won't.";
		
		getDriver().get(baseUrl);
		
		WebElement textForCheckObject = getDriver().findElement(By.cssSelector("#content > div > p:nth-child(3)")); 
		
		String res = textForCheckObject.getText();
		
		assertTrue(res.equals(exceptedText));
		
	}

}
