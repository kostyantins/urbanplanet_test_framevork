package project.utils;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import project.enums.Browsers;

@Getter
public class WebDriverFactory {

    private WebDriver driver;

    public WebDriver getDriver(final Browsers browsers) {

        final String chromeDriver = PropertiesReader.getProperty("chrome.driver.name");
        final String chromeDriverPath = PropertiesReader.getProperty("chrome.driver.path");

        switch (browsers) {

            case CHROME:
                System.setProperty(chromeDriver, chromeDriverPath);
                driver = new ChromeDriver();

            default:
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
        }
        return driver;
    }
}
