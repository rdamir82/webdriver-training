package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class RedirectLinkTest extends TestBase {
	
	@Test
	public void Redirect(){
		String linkText="here",result,result2;
		
		getDriver().get("http://the-internet.herokuapp.com/redirector");
		WebElement linkByPartialText = driver.findElement(By.partialLinkText(linkText));
		linkByPartialText.click();
		result = getDriver().findElement(By.tagName("h3")).getText();
		assertEquals("Status Codes",result);
		
		linkByPartialText = driver.findElement(By.partialLinkText("404"));
		linkByPartialText.click();
		
		result2 = getDriver().findElement(By.tagName("p")).getText();
		System.out.print(result2);
		assertEquals("This page returned a 404 status code.\r\n" + 
				"\r\n" + 
				"For a definition and common list of HTTP status codes, go here",result2);
		
	}
	
}
