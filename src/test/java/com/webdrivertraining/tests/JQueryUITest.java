package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class JQueryUITest extends TestBase {
	@Test
	public void JQuery01() {
		String result;
		String text="JQuery UI is many things, but one thing specifically that causes automation challenges is their set of Widgets";
		getDriver().get("http://the-internet.herokuapp.com/jqueryui");
		WebElement linkByPartialText = driver.findElement(By.partialLinkText("Menu"));
		linkByPartialText.click();
		getDriver().findElement(By.cssSelector("#ui-id-2")).click();
		getDriver().findElement(By.cssSelector("#ui-id-5")).click();		
		result=getDriver().findElement(By.cssSelector("#content > div > div > p")).getText();
		assertEquals(text,result);
	}

}
