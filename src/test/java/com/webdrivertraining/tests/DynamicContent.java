package com.webdrivertraining.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;


public class DynamicContent extends TestBase{
	List<WebElement> pictureElements;
	List<WebElement> textElements;
	ArrayList<String> imgPathsBefore = new ArrayList<String>();
	ArrayList<String> imgPathsAfter = new ArrayList<String>();
	ArrayList<String> textsBefore = new ArrayList<String>();
	ArrayList<String> textsAfter = new ArrayList<String>();
	int test = 0;
	boolean ok = false;
	@Test
	public void DynamicContentTest() {
		String aTagText ="click here";
		getDriver().get("http://the-internet.herokuapp.com/dynamic_content");
		pictureElements = getDriver().findElements(By.cssSelector(".large-2 > img"));
		textElements = getDriver().findElements(By.cssSelector(".large-10.columns"));
		//before click IMG
		for(WebElement element: pictureElements) {
			imgPathsBefore.add(element.getAttribute("src"));
		}
		//before click text
		for(WebElement element: textElements) {
			textsBefore.add(element.getText());
		}
		//clearing elements from list
		pictureElements.clear();
		textElements.clear();
		
		getDriver().findElement(By.linkText(aTagText)).click();
		
		pictureElements = getDriver().findElements(By.cssSelector(".large-2 > img"));
		textElements = getDriver().findElements(By.cssSelector(".large-10.columns"));
		
		//after click IMG
		for(WebElement element: pictureElements) {
			imgPathsAfter.add(element.getAttribute("src").toString());
		}
		//after click "click here"
		for(WebElement element: textElements) {
			textsAfter.add(element.getText());
		}
		/*
		for(String text : textsAfter) {
			System.out.println(text);
		}
		*/
		for(String s : imgPathsBefore) {
			int i = imgPathsBefore.indexOf(s);
			String s2 = imgPathsAfter.get(i);
			if(!s.equals(s2)) {
				test++;
			}
		}
		
		
		for(String s2 : textsBefore) {
			int i2 = textsBefore.indexOf(s2);
			String s3 = textsAfter.get(i2);
			if(!s2.equals(s3)) {
				test++;
			}
		}
		
		if(test>0) {
			ok = true;
		}
		assertTrue(ok);
		
	}
}
