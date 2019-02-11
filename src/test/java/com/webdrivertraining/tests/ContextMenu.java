package com.webdrivertraining.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.webdrivertraining.testbase.TestBase;

public class ContextMenu extends TestBase {
	
	String baseUrl = "http://the-internet.herokuapp.com/context_menu";
	
	@Test
	 public void rigthClickOnHotSpot() {
		
		getDriver().get(baseUrl);
		
		Actions action = new Actions(getDriver());
		
		WebElement element = getDriver().findElement(By.id("hot-spot"));
		
		action.contextClick(element).perform();
		
		
		
	}
	
	

}
