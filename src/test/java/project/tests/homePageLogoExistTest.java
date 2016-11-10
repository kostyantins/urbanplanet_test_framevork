package project.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.utils.TestRunner;

public class homePageLogoExistTest extends TestRunner {

    @Test
    public final void testHomePageLogoExist() {

        WebElement element = driver
                .findElement(By.xpath("//div[@id='wpo-mainnav']//a/img"));

        Assert.assertTrue(element.isDisplayed(), element + "should be displayed!");
    }
}
