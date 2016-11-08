package project.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class homePageLogoExistTest {

    WebDriver driver;

    @BeforeMethod
    public final void setUp() {

        driver = new FirefoxDriver();

        driver
                .get("https://urbanplanet-streetwear.com");

        driver
                .manage()
                .timeouts()
                .implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public final void tarnDown(){

        driver
                .quit();
    }

    @Test
    public final void testHomePageLogoExist() {

        WebElement element = driver
                .findElement(By.xpath("//div[@id='wpo-mainnav']//a/img"));

        Assert.assertTrue(element.isDisplayed(), element + "should be displayed!");

    }
}
