package com.webdrivertraining.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/**
 * This class is responsible for creating the Webdriver instances.
 *
 * @author Tihomir Turzai
 */
public class DriverFactory {

    private static final int IMPLICIT_WAIT_TIME = 0;
    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {
        return instance;
    }

    private void setChromeDriverLocation() {
        String driverLocation = "drivers/chromedriver.exe";

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(driverLocation).getFile());

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    }

    private WebDriver createHeadlessChromeDriver() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(
            "headless", 
            "disable-gpu", 
            "ignore-certificate-errors",
            "no-sandbox");

        DesiredCapabilities crcapabilities = DesiredCapabilities.chrome();
        crcapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        crcapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        crcapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        crcapabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);

        chromeOptions.merge(crcapabilities);

        return new ChromeDriver(
            new ChromeDriverService.Builder().withSilent(true).build(), chromeOptions);
    }

    /**
     * Creates chromedriver.
     *
     * @return ChromeDriver
     */
    private WebDriver createChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();  
        List<String> logTypes = new ArrayList<String>();
        logTypes.add(LogType.BROWSER);


        LoggingPreferences logs = new LoggingPreferences();

        for (String logType: logTypes) {
            logs.enable(logType, Level.ALL);
        }

        chromeOptions.setCapability(CapabilityType.LOGGING_PREFS, logs);

        return new ChromeDriver(chromeOptions);
    }  

    /**
     * Creates and returns the chosen driver type.
     *
     * @param testMode - enum for test mode
     * @param driverType - enum for driver type
     * @return return the chosen webdriver
     */
    public WebDriver createDriver(final BrowserMode driverType) {
        WebDriver driver;

        setChromeDriverLocation();
        switch (driverType) {
            case CHROME:
                driver = createChromeDriver();
                break;
            case HEADLESS_CHROME:
                driver = createHeadlessChromeDriver();
                break;
            default:
                return null;
        }    

        maximizeDriver(driver);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.MILLISECONDS);
        return driver;
    }  

    /**
     * Inner enum for idnetifying driver types.
     *     
     */
    public enum BrowserMode {
        HEADLESS_CHROME,
        CHROME
    }
    
    /**
     * Maximizing browser window. 
     * @param driver (web driver)
     */
    public static void maximizeDriver(WebDriver driver) {
        driver.manage().window().maximize();
    }

}
