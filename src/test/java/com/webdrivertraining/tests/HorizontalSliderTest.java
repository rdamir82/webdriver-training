package com.webdrivertraining.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class HorizontalSliderTest extends TestBase {
	
	@Test
	public void Slider() {
		String result;
		getDriver().get("http://the-internet.herokuapp.com/horizontal_slider");
		for(int i=0;i<5;i++) {
		getDriver().findElement(By.cssSelector("input")).sendKeys(Keys.ARROW_RIGHT);
		result = getDriver().findElement(By.id("range")).getText();
		System.out.println(result);
		}
	}

}
