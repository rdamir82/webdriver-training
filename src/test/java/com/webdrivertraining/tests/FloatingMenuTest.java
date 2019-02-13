package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.webdrivertraining.testbase.TestBase;

public class FloatingMenuTest extends TestBase {
	
	@Test
	public void FloatingMenu01() throws InterruptedException {
		String testURL="http://the-internet.herokuapp.com/floating_menu#news";
		
		getDriver().get("http://the-internet.herokuapp.com/floating_menu");
		
		for(int i=0;i<10;i++) {
			getDriver().findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
			TimeUnit.NANOSECONDS.sleep(100);
		}
		getDriver().findElement(By.cssSelector("#menu > ul > li:nth-child(2) > a")).click();
		String URL = driver.getCurrentUrl();
		
		assertEquals(testURL,URL);
		
		
	}
}
