package com.webdrivertraining.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class ChallengingDOMTest extends TestBase {
	
	@Test
	public void DOMTest() {
		getDriver().get("http://the-internet.herokuapp.com/challenging_dom");
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]")).getText(); 
		System.out.println(innerText); 

		
		for(int i=0;i<3;i++) {
		driver.findElement(By.className("button")).click();
		String pageSource = getDriver().getPageSource();
		int firstText,lastText; String text2; char[] Str2 = new char[5];
		firstText=pageSource.indexOf("Answer: ");
		lastText=pageSource.indexOf("',90,112);");
		pageSource.getChars(firstText+8, lastText, Str2, 0);
		System.out.println(Str2);
		}
		
	}

}
