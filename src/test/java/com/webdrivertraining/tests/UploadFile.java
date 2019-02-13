package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class UploadFile extends TestBase {
	
	final String baseUrl = "http://the-internet.herokuapp.com/upload";
	final String excepted2 = "D:\\dummy.txt";
	final String excepted = "dummy.txt";
	
	@Test
	public void selectFileAndUpload() {
		
		getDriver().get(baseUrl);
		
		WebElement chooseFile = getDriver().findElement(By.id("file-upload"));
		WebElement submitFile = getDriver().findElement(By.id("file-submit"));
				
		chooseFile.sendKeys(excepted2);
		
		submitFile.click();
		
		WebElement uploadedFiles = getDriver().findElement(By.id("uploaded-files"));
		
		String res = uploadedFiles.getText();
		
		assertTrue(excepted.equals(res));
			
	}
	
}
