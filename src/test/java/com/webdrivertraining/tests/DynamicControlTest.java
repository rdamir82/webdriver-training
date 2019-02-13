package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdrivertraining.testbase.TestBase;

public class DynamicControlTest extends TestBase{
	
	@Test
	 public void Dynamic() {
		WebDriverWait wait = new WebDriverWait(getDriver(),5);
		String result;
		getDriver().get("http://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.cssSelector("#checkbox-example > button")).click();
		driver.findElement(By.cssSelector("#input-example > button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector( "#message")));	
		result = getDriver().findElement(By.cssSelector("#message")).getText();
		assertEquals("It's gone!",result);
		
	
		

	
	}
}