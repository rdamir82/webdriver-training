package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class FramesTestCases extends TestBase {

	String baseUrl = "http://the-internet.herokuapp.com/frames";

	@Test
	public void iFrames() {

		getDriver().get(baseUrl);

		// go to iframe:

		getDriver().findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > a")).click();

		// Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0
		// for help

		getDriver().switchTo().frame(getDriver().findElement(By.tagName("iframe")));

		String res = getDriver().findElement(By.cssSelector("#tinymce > p")).getText();

		System.out.println(res);

		assertTrue(res.equals("Your content goes here."));

	}

	@Test
	public void nestedFrames() {

		getDriver().get(baseUrl);
		// navigation
		getDriver().findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > a")).click();

		getDriver().switchTo().frame("frame-top");

		getDriver().switchTo().frame("frame-left");

		String res = getDriver().findElement(By.tagName("body")).getText();

		assertTrue(res.contentEquals("LEFT"));

		getDriver().switchTo().parentFrame();

		getDriver().switchTo().frame("frame-middle");

		res = getDriver().findElement(By.tagName("body")).getText();

		assertTrue(res.contentEquals("MIDDLE"));

		getDriver().switchTo().parentFrame();

		getDriver().switchTo().frame("frame-right");

		res = getDriver().findElement(By.tagName("body")).getText();

		assertTrue(res.contentEquals("RIGHT"));

		getDriver().switchTo().parentFrame();
		getDriver().switchTo().parentFrame();

		getDriver().switchTo().frame("frame-bottom");

		res = getDriver().findElement(By.tagName("body")).getText();

		assertTrue(res.contentEquals("BOTTOM"));

		// getDriver().switchTo().frame(getDriver().findElement(By.name("frame-left")));

		// getDriver().switchTo().frame(getDriver().findElement(By.name("frame-left")));

	}

}
