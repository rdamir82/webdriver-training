package com.webdrivertraining.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearchPage extends PageObject{

	private final String landingPageAdress = "https://www.google.com/";

	@FindBy(name = "q")
	WebElement q;

	@FindBy(name = "btnK")
	WebElement btn;

	public GoogleSearchPage(WebDriver driver) {
		super(driver);
		driver.get(landingPageAdress);
	}

	public void initializingPage() {
		assertTrue(isInitialized());
	}

	@Override
	protected void load() {
		
	}

	private boolean isInitialized() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(q));
		if (q.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public GoogleSearchResults fillSearchBarAndClickSearch(String searchTerm) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		q.sendKeys(searchTerm);
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		return new GoogleSearchResults(driver);
		
	}

	public GoogleSearchResults fillSearchBarAndPressEnter(String searchTerm) {
		q.sendKeys(searchTerm);
		q.sendKeys(Keys.RETURN);
		return new GoogleSearchResults(driver);
	}

	public void typeSearchTerm(String searchTerm) {
		q.sendKeys(searchTerm);
	}

	public String getPageTitle() {
		return (driver.getTitle());
	}

}
