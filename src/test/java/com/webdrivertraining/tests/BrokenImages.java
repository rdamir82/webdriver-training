package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class BrokenImages extends TestBase {
	
	final String baseUrl = "http://the-internet.herokuapp.com/broken_images";
	String res = "";
	boolean forTest = true;	
	@Test
	 public void brokenImages() {
		
		getDriver().get(baseUrl);
		
		List<WebElement> imgsForTest = getDriver().findElements(By.tagName("img"));
		
		// if find broken img inform the location of that img and set false for testCase
		for (WebElement element : imgsForTest) {
			
			res = element.getAttribute("naturalWidth");
			
			if (res.equals("0")) {
				System.out.println("IMG BROKEN ! @ location: " + element.getLocation());
				forTest = false;
			}					
		}		
		// test will pass if all img elements is appear on page!
		assertTrue(forTest);
				
	}

}
