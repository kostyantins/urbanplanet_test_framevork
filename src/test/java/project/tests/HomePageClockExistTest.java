package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.utils.TestRunner;

import static project.pageobjects.HomePage.CLOCK;

public class HomePageClockExistTest extends TestRunner {

    @Test
    public final void testHomePageClockExist() {

        Assert.assertTrue(homePage.getClock().isDisplayed());
    }
}
