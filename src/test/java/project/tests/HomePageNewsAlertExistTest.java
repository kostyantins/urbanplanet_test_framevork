package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageobjects.HomePage;
import project.utils.TestRunner;

import static project.pageobjects.HomePage.NEWS_ALERT_WINDOW;

public class HomePageNewsAlertExistTest extends TestRunner {

    @Test
    public final void testHomePageNewsAlertExist(){

        Assert.assertTrue(homePage.getNewsAlertWindow().isDisplayed());

        homePage
                .refreshPage();

        Assert.assertTrue(homePage.getNewsAlertWindow().isDisplayed());
    }
}
