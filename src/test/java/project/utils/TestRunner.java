package project.utils;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import project.enums.Browsers;
import project.pageobjects.HomePage;

import java.util.concurrent.TimeUnit;

import static project.enums.Browsers.CHROME;
import static project.enums.Browsers.FIREFOX;

public class TestRunner {

    protected HomePage homePage;

    @Getter
    protected WebDriver driver;

    @BeforeMethod
    public final void setUp() {

        WebDriverFactory webDriverFactory = new WebDriverFactory();

        driver = webDriverFactory.getDriver(CHROME);

        driver
                .get("https://urbanplanet-streetwear.com");

        homePage = new HomePage(driver);
    }

    @AfterMethod
    public final void tarnDown() {

        driver
                .quit();
    }
}
