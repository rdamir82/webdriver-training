package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.webdrivertraining.pageObjects.GoogleSearchPage;
import com.webdrivertraining.pageObjects.GoogleSearchResults;
import com.webdrivertraining.testbase.TestBase;

public class GoogleSearchTest extends TestBase {
	
	@Test
	public void fillAndClickGoogleSearchBtn(){
		
	   String searchTerm = "selenium";
        
       GoogleSearchPage gsp = new GoogleSearchPage(getDriver());
     
       GoogleSearchResults googleSearchResults = gsp.fillSearchBarAndClickSearch(searchTerm);
       
       assertTrue(gsp.getPageTitle().contains(searchTerm +" - Google"));
       
       
       googleSearchResults.firstResult();
	
	}  
	
	@Test
	public void fillAndPressReturnKey() {
		
		String searchTerm = "selenium";
		
		GoogleSearchPage gsp = new GoogleSearchPage(getDriver());
		
		gsp.fillSearchBarAndPressEnter(searchTerm);
	       
	    assertTrue(gsp.getPageTitle().contains(searchTerm +" - Google"));
	}
}