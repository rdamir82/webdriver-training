package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdrivertraining.testbase.TestBase;

public class NotificationMessagesTest extends TestBase{
	String url = "http://the-internet.herokuapp.com/notification_message_rendered";
	@Test
	public void NotificationMessagesTest1 () {
		WebDriverWait wait = new WebDriverWait(getDriver(),5);
		
		getDriver().get(url);
		getDriver().findElement(By.cssSelector(".example > p:nth-child(2) > a:nth-child(5)")).click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector( "#flash")));
		WebElement link = getDriver().findElement(By.id("flash"));
		assertTrue(link.isDisplayed());
	}
}
