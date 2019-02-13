package com.webdrivertraining.tests;


import java.io.File;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import com.webdrivertraining.testbase.TestBase;

public class SecureFileDownloadTest extends TestBase {
	
	@Test
	public void DownloadTest() {
		String filename="simple.txt";
		
		String username = "admin";
		String passw = "admin";
		getDriver().get("http://"+ username+":"+passw+"@the-internet.herokuapp.com/download_secure");
	
		WebElement linkByPartialText = driver.findElement(By.partialLinkText(filename));
				linkByPartialText.click();

		
	}

}
