package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class MultipleWindows extends TestBase {
	String url = "http://the-internet.herokuapp.com/windows";
	String newPageH3Value = "";
	@Test
	public void MultipleWindowstTest() {
		getDriver().get(url);
		getDriver().findElement(By.cssSelector(".example > a:nth-child(2)")).click();
		for(String winHandle : getDriver().getWindowHandles()){ //getDriver().getWindowHandles() list of actual open pages
			getDriver().switchTo().window(winHandle);
		}
		newPageH3Value = getDriver().findElement(By.cssSelector(".example > h3:nth-child(1)")).getText();
		assertEquals(newPageH3Value,"New Window");
	}
}
