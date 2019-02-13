package com.webdrivertraining.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.webdrivertraining.testbase.TestBase;

public class LargeDeepDOM extends TestBase {
	
	@Test
	public void Dom() {
		
		String sibling,table;
		double siblingValue=37.2;
		int tableRow=35; //1-50
		int tableColumn=33;//1-50
		getDriver().get("http://the-internet.herokuapp.com/large");
		sibling=getDriver().findElement(By.id("sibling-"+siblingValue)).getText();
		//tablecolumn=getDriver().findElement(By.className("row-38")).getText();		
		//tableRow=getDriver().findElement(By.className("row-38")).getText();
		table = driver.findElement(By.xpath("//table/tbody/tr["+tableRow+"]/td["+tableColumn+"]")).getText(); 
		
		System.out.println("Sibling: "+sibling);
		System.out.println("Table: "+table);
		Assertions.assertEquals(tableRow+"."+tableColumn, table);
	}
	

}
