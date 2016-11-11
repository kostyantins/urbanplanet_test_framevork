package project.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import project.enums.Browsers;

import java.util.concurrent.TimeUnit;

import static project.enums.Browsers.CHROME;
import static project.enums.Browsers.FIREFOX;

public class TestRunner {

    protected WebDriver driver;

    @BeforeMethod
    public final void setUp() {

        WebDriverFactory webDriverFactory = new WebDriverFactory();

        driver = webDriverFactory.getDriver(CHROME);

        driver
                .get("https://urbanplanet-streetwear.com");

        driver
                .manage()
                .timeouts()
                .implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public final void tarnDown() {

        driver
                .quit();
    }
}
