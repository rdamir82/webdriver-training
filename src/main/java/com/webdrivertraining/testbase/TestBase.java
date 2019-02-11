package com.webdrivertraining.testbase;

import com.webdrivertraining.testbase.DriverFactory.BrowserMode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;


public class TestBase {

  private WebDriver driver;

  public TestBase() {          
    super();
  }

  @BeforeEach
  public void beforeTestBase() {
    createNewDriver();
  }
  /**
   * Method for creating new web driver if previous driver is closed.
   * @return an instance of a web driver.
   */
  private WebDriver createNewDriver() {
      driver = DriverFactory.getInstance().createDriver(BrowserMode.CHROME);
      return driver;
  }

  public WebDriver getDriver() {
    return driver;
  }
  
  @AfterEach
  public void afterTestBase() throws Exception {
  
    try {
      if (!driver.toString().contains("(null)")) {
        driver.quit();
      }

    } catch (Throwable e) {
    //  TestBase.logger.error("driver close failed " + e);
    }
  }
  
}