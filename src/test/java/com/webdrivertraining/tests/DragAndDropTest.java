package com.webdrivertraining.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.webdrivertraining.testbase.TestBase;

public class DragAndDropTest extends TestBase {
	
	final String baseUrl = "http://demo.guru99.com/test/drag_drop.html"; 
	
	@Test
	public void dradAndDrop() {
		
		getDriver().get(baseUrl);
		
		WebElement from = getDriver().findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement to = getDriver().findElement(By.xpath("//*[@id='bank']/li"));
		
		Actions act = new Actions(getDriver());
		
		act.dragAndDrop(from, to).build().perform();
		
		System.out.println("stop");
		
		
		
	}

}
