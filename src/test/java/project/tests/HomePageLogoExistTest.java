package project.tests;

import org.testng.annotations.Test;
import project.utils.TestRunner;

import static project.pageobjects.HomePage.LOGO;

public class HomePageLogoExistTest extends TestRunner {

    @Test
    public final void testHomePageLogoExist() {

        homePage
                .isExist(LOGO);
    }
}
