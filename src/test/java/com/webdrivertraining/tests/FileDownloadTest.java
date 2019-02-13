package com.webdrivertraining.tests;


import java.io.File;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import com.webdrivertraining.testbase.TestBase;

public class FileDownloadTest extends TestBase {
	
	@Test
	public void DownloadTest() {
		String filename="LoveIsinTheAir.jpeg";
		
		getDriver().get("http://the-internet.herokuapp.com/download");
		WebElement linkByPartialText = driver.findElement(By.partialLinkText(filename));
				linkByPartialText.click();

		
	}

}
