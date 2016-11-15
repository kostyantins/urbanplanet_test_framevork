package project.tests;

import org.testng.annotations.Test;
import project.pageobjects.HomePage;
import project.utils.TestRunner;

import static project.pageobjects.HomePage.NEWS_ALERT_WINDOW;

public class HomePageNewsAlertExistTest extends TestRunner {

    @Test
    public final void testHomePageNewsAlertExist(){

        homePage
                .isExist(NEWS_ALERT_WINDOW);
    }
}
