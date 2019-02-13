package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class SortableDataTableTesst extends TestBase {
	
	@Test
	public void TableAndLInkCheck() {
		
		getDriver().get("http://the-internet.herokuapp.com/tables");

		WebElement linkByPartialText = driver.findElement(By.partialLinkText("edit"));
		linkByPartialText.click();
		String URL = driver.getCurrentUrl();
		assertEquals("http://the-internet.herokuapp.com/tables#edit",URL);
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText(); 
		System.out.println(innerText);
	}

}
