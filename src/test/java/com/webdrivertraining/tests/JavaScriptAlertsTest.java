package com.webdrivertraining.tests;

import java.awt.datatransfer.StringSelection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class JavaScriptAlertsTest extends TestBase {
	
	final String text="Kis Bela";
	String resoult;
	
	@Test
	public void ButtonAndAlertClick() {
		//Check JS Alert
		getDriver().get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		resoult = getDriver().findElement(By.id("result")).getText();
		Assertions.assertEquals("You successfuly clicked an alert", resoult);
		
	//-----------------------------------------------------------------------------------------------------------------	
		
		//Check JS Confirm
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert_box = driver.switchTo().alert();	
		alert_box.accept();
		resoult = getDriver().findElement(By.id("result")).getText();
		Assertions.assertEquals("You clicked: Ok", resoult);
		
	//-----------------------------------------------------------------------------------------------------------------	
		
		//Check JS Prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert_box2 = driver.switchTo().alert();
		alert_box2.sendKeys(text);
		alert_box2.accept();
		resoult = getDriver().findElement(By.id("result")).getText();
		Assertions.assertEquals("You entered: "+text,resoult);

	}
	
	
	
	/*@Test
	public void ButtonAndAlertClick2() {
		
		getDriver().get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert_box = driver.switchTo().alert();
	
		alert_box.accept();
		String resoult;
		resoult = getDriver().findElement(By.id("result")).getText();
		
		
		Assertions.assertEquals("You clicked: Ok", resoult);

	
	}
	@Test
	public void ButtonAndAlertClick3() {
		
		
		getDriver().get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert_box = driver.switchTo().alert();
		alert_box.sendKeys(text);
		alert_box.accept();
		String resoult;
	
		resoult = getDriver().findElement(By.id("result")).getText();
		
		
		Assertions.assertEquals("You entered: "+text,resoult);

	
	}*/
}
