package com.webdrivertraining.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdrivertraining.testbase.TestBase;

public class WtheStart extends TestBase{
	
	String baseUrl = "http://www.way2automation.com/demo.html";
	
	@Test
	public void clickAndLogIn() {
		
		getDriver().get(baseUrl);
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		
		System.out.println(getDriver().getCurrentUrl());
		
		getDriver().findElement(By.xpath("//h2[.='Draggable']")).click();
		
		System.out.println(getDriver().getCurrentUrl());
		
		// getDriver().switchTo().window("i1.next()");
		
		System.out.println(getDriver().getCurrentUrl());
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fancybox")));
		
		getDriver().findElement(By.className("fancybox")).click();
		
		getDriver().findElement(By.cssSelector("#login [type='text']")).sendKeys("admin");
		
		getDriver().findElement(By.cssSelector("#login [type='password']")).sendKeys("admin");
		
		getDriver().findElement(By.cssSelector("#login [value='Submit']")).click();
		
		getDriver().findElement(By.xpath("//h2[.='Draggable']")).click();
		
		
		
		
		
	}

}
