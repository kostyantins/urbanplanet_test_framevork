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

        final String chromeDriver = PropertiesReader.getDefaultProperty("chrome.driver.name");
        final String chromeDriverPath = PropertiesReader.getDefaultProperty("chrome.driver.path");

        switch (browsers) {

            case FIREFOX:
                driver = new FirefoxDriver();
                break;

            case CHROME:
                System.setProperty(chromeDriver, chromeDriverPath);
                driver = new ChromeDriver();
        }
        return driver;
    }
}
