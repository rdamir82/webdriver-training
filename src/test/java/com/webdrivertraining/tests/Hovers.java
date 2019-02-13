package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.webdrivertraining.testbase.TestBase;

public class Hovers extends TestBase{
	
	String baseUrl = "http://the-internet.herokuapp.com/hovers";
	
	// 
	
	@Test
	public void getTextFromHoweredElement() {
		
		getDriver().get(baseUrl);
		
		WebElement img = getDriver().findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
		WebElement nameUser = getDriver().findElement(By.cssSelector("#content > div > div:nth-child(3) > div > h5"));
		String exceptedRes = "name: user1";
		String res = "";
		
		// res = nameUser1.getText();
		
		Actions builder = new Actions(getDriver());
		
		Action mouseOverImg = builder.moveToElement(img).build();
		
		mouseOverImg.perform();
		
		res = nameUser.getText();
		
		assertTrue(exceptedRes.contentEquals(res));
		
	}
	
	@Test
	public void getTextFromHoweredElement2() {
		
		getDriver().get(baseUrl);
		
		WebElement img = getDriver().findElement(By.cssSelector("#content > div > div:nth-child(4) > img"));
		WebElement nameUser = getDriver().findElement(By.cssSelector("#content > div > div:nth-child(4) > div > h5"));
		String exceptedRes = "name: user2";
		String res = "";
		
		Actions builder = new Actions(getDriver());
		
		Action mouseOverImg = builder.moveToElement(img).build();
		
		mouseOverImg.perform();
		
		res = nameUser.getText();
		
		assertTrue(exceptedRes.contentEquals(res));
		
	}
	
	@Test
	public void getTextFromHoweredElement3() {
		
		getDriver().get(baseUrl);
		
		WebElement img = getDriver().findElement(By.cssSelector("#content > div > div:nth-child(5) > img"));
		WebElement nameUser = getDriver().findElement(By.cssSelector("#content > div > div:nth-child(5) > div > h5"));
		String exceptedRes = "name: user3";
		String res = "";
		
		Actions builder = new Actions(getDriver());
		
		Action mouseOverImg = builder.moveToElement(img).build();
		
		mouseOverImg.perform();
		
		res = nameUser.getText();
		
		assertTrue(exceptedRes.contentEquals(res));
		
	}

}
