package com.webdrivertraining.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class LoginTest extends TestBase{
	String username="tomsmith";
	String passwd="SuperSecretPassword!";
	String username2="tomsmith";
	String passwd2="asdwqeq";
	@Test
	public void CorrectLoginCheck() {
		String resoult;
			
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.className("radius")).click();
		
		resoult = getDriver().findElement(By.id("flash")).getAttribute("class").toString();
		Assertions.assertEquals("flash success", resoult);
	}
	
	@Test
	public void InvalidLoginCheck() {
		String resoult;
		
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys(username2);
		driver.findElement(By.id("password")).sendKeys(passwd2);
		driver.findElement(By.className("radius")).click();
		
		resoult = getDriver().findElement(By.id("flash")).getAttribute("class").toString();
		Assertions.assertEquals("flash error", resoult);
		}
}