package com.webdrivertraining.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResults extends PageObject {
	
	@FindBy( className = "LC20lb")
	WebElement firstItemFound;

	public GoogleSearchResults(WebDriver driver) {
		super(driver);
	}
	
	public void firstResult() {
		firstItemFound.getText();
		
		System.out.println(firstItemFound.getText());
	} 

}
