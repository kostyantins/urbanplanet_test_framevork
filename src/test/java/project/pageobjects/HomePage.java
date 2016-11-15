package project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends PageObject<HomePage> {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static final By LOGO = By.xpath("//*[@id='wpo-mainnav']//a/img");
    public static final By CLOCK = By.xpath("(//*[@id='wpo-mainnav']//img)[2]");
    public static final By NEWS_ALERT_WINDOW = By.xpath("//*[@id='subscribe-form']");

    public HomePage isExist(final By pageElement) {

        final WebDriverWait wait = new WebDriverWait(driver, 50);

        final WebElement element = wait
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.presenceOfElementLocated(pageElement));

        Assert.assertTrue(element.isDisplayed(), element + "should be displayed!");

        return this;
    }

    @Override
    public HomePage refreshPage() {

        super
                .refreshPage();

        return this;
    }
}
