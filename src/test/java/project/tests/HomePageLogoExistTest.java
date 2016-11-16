package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageobjects.HomePage;
import project.utils.TestRunner;

import static project.pageobjects.HomePage.LOGO;

public class HomePageLogoExistTest extends TestRunner {

    @Test
    public final void testHomePageLogoExist() {

        Assert.assertTrue(homePage.getLogo().isDisplayed());
    }
}
