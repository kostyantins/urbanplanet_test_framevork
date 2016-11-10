package project.utils;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import project.enums.Browsers;

@Getter
public class WebDriverFactory {

    WebDriver driver;

    public WebDriver getDriver(final Browsers browsers) {

        switch (browsers) {

            case FIREFOX:
                driver = new FirefoxDriver();
                break;

            case CHROME:
                driver = new ChromeDriver();
                System.setProperty("webdriver.chrome.driver", "src//resources//drivers//chromedriver");
        }

        return driver;
    }
}
