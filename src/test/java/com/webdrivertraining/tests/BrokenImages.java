package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class BrokenImages extends TestBase {
	
	String baseUrl = "http://the-internet.herokuapp.com/broken_images";
	String img1selector = ".example > img:nth-child(2)"; 
	String img2selector = ".example > img:nth-child(3)";
	String img3selector = ".example > img:nth-child(4)";
	
	
	// ArrayList<String> imgSelectors = new ArrayList<String>();
	
	
	
	@Test
	 public void brokenImages() {
		
		getDriver().get(baseUrl);
		
		assertTrue(!getDriver().findElement(By.cssSelector(img3selector)).getAttribute("naturalWidth").equals("0"));
		
		
		
		
		
		
	}

}
