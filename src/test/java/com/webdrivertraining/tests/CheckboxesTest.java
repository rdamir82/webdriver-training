package com.webdrivertraining.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class CheckboxesTest extends TestBase{

	@Test
	public void CheckboxesTesting0() {
		
		getDriver().get("http://the-internet.herokuapp.com/checkboxes");
		List<WebElement> checkBoxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkBox: checkBoxes) {
		    if(!checkBox.isSelected()){
		    	checkBox.click();
		    	assertEquals(checkBox.getAttribute("checked"),"true");
		    }
		    else {
		    	checkBox.click();
		    	assertEquals(checkBox.getAttribute("checked"),null);
		    }
		
		    	
		    
		}
		
	}
}
