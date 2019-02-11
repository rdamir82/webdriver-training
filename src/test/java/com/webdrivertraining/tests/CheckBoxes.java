package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class CheckBoxes extends TestBase {
	
	String baseUrl = "http://the-internet.herokuapp.com/checkboxes";
	private By checkbox1 = By.cssSelector("#checkboxes > input:nth-child(1)");
	private By checkbox2 = By.cssSelector("#checkboxes > input:nth-child(3)");
	
	
	@Test
	 public void checboxCheck() {
		
		getDriver().get(baseUrl);
		
		WebElement checkBox1 = getDriver().findElement(checkbox1);
		WebElement checkBox2 = getDriver().findElement(checkbox2);
			
		assertFalse(checkBox1.isSelected()); 
		assertTrue(checkBox2.isSelected());
		
		
	//	System.out.println(checkIfSelected(checkBox1));
		
	//	System.out.println(checkIfSelected(checkBox2));		
		
	}
	/*
	private String checkIfSelected(WebElement webElement) {
		if (webElement.isSelected()) {
			
			return (webElement.getAttribute("outerHTML") + "Is selected");
		} else {
			return (webElement.getAttribute("outerHTML") + "Is NOT selected");
		}
		
	}
	*/

	
	

}


// #checkboxes > input:nth-child(1)