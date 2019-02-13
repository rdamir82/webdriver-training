package com.webdrivertraining.tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.webdrivertraining.testbase.TestBase;

public class InfiniteScrollTest extends TestBase{
	
	@Test
	public void Scroll() throws InterruptedException {
		getDriver().get("http://the-internet.herokuapp.com/infinite_scroll");
		for(int i=0;i<10;i++) {
		getDriver().findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		TimeUnit.SECONDS.sleep(1);

			}	
		
		
	}

}
