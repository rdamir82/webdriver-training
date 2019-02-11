package com.webdrivertraining.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.webdrivertraining.testbase.TestBase;

public class DropDownListTest extends TestBase{

	@Test
	public void DropDownListTest0() {
//		getDriver().get("http://the-internet.herokuapp.com/dropdown");
//		//getDriver().findElement(By.id("dropdown")).click();
//		Select dropdown = new Select(getDriver().findElement(By.id("dropdown")));
//		dropdown.selectByIndex(1);
//		WebElement option = dropdown.getFirstSelectedOption();
//		assertEquals(option.getText().toString(),"Option 1");
	
		getDriver().get("http://the-internet.herokuapp.com/checkboxes");
		List<WebElement> checkBoxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkBox: checkBoxes) {
		    System.out.println(checkBox.getAttribute("checked")); // to iterate over each checkbox element.
		}
		
	
	}
}
