package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.webdrivertraining.testbase.TestBase;

public class Hovers extends TestBase {

	String baseUrl = "http://the-internet.herokuapp.com/hovers";

	By imgToHoverOn = By.cssSelector("#content > div > div:nth-child(3) > img");
	By textAppearOnHover = By.cssSelector("#content > div > div:nth-child(3) > div > h5");
	String exceptedRes = "name: user1";

	By imgToHoverOn2 = By.cssSelector("#content > div > div:nth-child(4) > img");
	By textAppearOnHover2 = By.cssSelector("#content > div > div:nth-child(4) > div > h5");
	String exceptedRes2 = "name: user2";

	By imgToHoverOn3 = By.cssSelector("#content > div > div:nth-child(5) > img");
	By textAppearOnHover3 = By.cssSelector("#content > div > div:nth-child(5) > div > h5");
	String exceptedRes3 = "name: user3";
	//

	@Test
	public void checkTextAfterHover() {
		assertTrue(checkTextOnHoweredElement(baseUrl, imgToHoverOn, textAppearOnHover, exceptedRes));
	}

	@Test
	public void checkTextAfterHover2() {
		assertTrue(checkTextOnHoweredElement(baseUrl, imgToHoverOn2, textAppearOnHover2, exceptedRes2));
	}

	@Test
	public void checkTextAfterHover3() {
		assertTrue(checkTextOnHoweredElement(baseUrl, imgToHoverOn3, textAppearOnHover3, exceptedRes3));
	}

	private boolean checkTextOnHoweredElement(String baseUrl, By elementLocator, By textInElementAfterHoverLocator,
			String exceptedText) {

		getDriver().get(baseUrl);

		WebElement img = getDriver().findElement(elementLocator);
		WebElement nameUser = getDriver().findElement(textInElementAfterHoverLocator);

		Actions builder = new Actions(getDriver());

		Action mouseOverImg = builder.moveToElement(img).build();

		String result = "";

		mouseOverImg.perform();

		result = nameUser.getText();

		if (exceptedText.contentEquals(result)) {
			return true;
		} else {
			return false;
		}
	}
}