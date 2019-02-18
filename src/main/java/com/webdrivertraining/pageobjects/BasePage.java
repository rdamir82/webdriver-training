package com.webdrivertraining.pageobjects;

import static org.junit.jupiter.api.Assertions.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.webdrivertraining.testbase.PageUtils;

/**
 * Page object boilerplate code container
 * @author Arpad Farkas
 *
 */
public class BasePage extends LoadableComponent<BasePage>{

	//protected final static Logger logger = LoggerFactory.getLogger(BasePage.class);

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		//pageUtils = new PageUtils(driver);
		PageFactory.initElements(driver, this);
		this.get();
	}

	@Override
	protected void isLoaded() {
		// using this method to check if the important elements of the page are loaded
		// with fail we force the test devs to override this function
		fail("The page's static component test code is not working. Pls implement it by overwriting this function");
	}

	@Override
	protected void load() {
	}

}
