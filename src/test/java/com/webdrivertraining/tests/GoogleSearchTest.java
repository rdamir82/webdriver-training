package com.webdrivertraining.tests;

import org.junit.jupiter.api.Test;

import com.webdrivertraining.pageObjects.GoogleSearchPage;

public class GoogleSearchTest extends GoogleSearchPage {
	
	@Test
	public void testingPageOject() {
	
		GoogleSearchPage google = new GoogleSearchPage();
	
		google.open("google.com");
	
		google.searchFor("selenium");
		
		System.out.println(google.getTitle());	
	}
}
