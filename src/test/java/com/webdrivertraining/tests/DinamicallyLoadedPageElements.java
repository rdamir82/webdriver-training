package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdrivertraining.testbase.TestBase;

public class DinamicallyLoadedPageElements extends TestBase {

	private final String baseUrl = "http://the-internet.herokuapp.com/dynamic_loading/1";
	private final String baseUrl2 = "http://the-internet.herokuapp.com/dynamic_loading/2";
	private final By elementLocator = By.cssSelector("#start > button");
	private final By apearedElementLocator = By.cssSelector("#finish > h4");

	@Test
	public void checkhForAppear1() {
		assertTrue((checkForAppearMethod(baseUrl, elementLocator, apearedElementLocator)), "Element is not appeared");
	}

	@Test
	public void checkhForAppear2() {
		assertTrue((checkForAppearMethod(baseUrl2, elementLocator, apearedElementLocator)), "Element is not appeared");
	}

	private boolean checkForAppearMethod(String baseUrl, By elementLocator, By apearedElementLocator) {

		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		getDriver().get(baseUrl);
		getDriver().findElement(elementLocator).click();
		// wait for this
		wait.until(ExpectedConditions.visibilityOfElementLocated(apearedElementLocator));
		// text of field:
		String res = getDriver().findElement(apearedElementLocator).getText();
		// test
		if (res.equals("Hello World!")) {
			return true;
		} else {
			return false;
		}
	}
}