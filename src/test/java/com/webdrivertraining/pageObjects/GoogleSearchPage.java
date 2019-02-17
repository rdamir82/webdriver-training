package com.webdrivertraining.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdrivertraining.testbase.TestBase;

public class GoogleSearchPage extends TestBase {
	
	
	private WebElement q = getDriver().findElement(By.name("q"));
	private WebElement btn = getDriver().findElement(By.name("btnK"));
	
	public void open(String url) {
		getDriver().get(url);
		}
	
	public String getTitle() {
		return getDriver().getTitle();
		}
	
	
	public void searchFor(String searchTerm) {
		q.sendKeys(searchTerm);
		btn.click();
		}
	
	public void typeSearchTerm(String searchTerm) {
		q.sendKeys(searchTerm);
		}
	
	public void clickOnSearch() {
		btn.click();
		}
}
