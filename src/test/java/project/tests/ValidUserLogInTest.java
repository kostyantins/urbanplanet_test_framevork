package project.tests;

import org.testng.annotations.Test;
import project.pageobjects.UserOfficePage;
import project.utils.TestRunner;

public class ValidUserLogInTest extends TestRunner {

    @Test
    public final void testValidUserLogIn() {

        homePage
                .goToUserOfficePage();

        userOfficePage = new UserOfficePage(driver)
                .logIn();

        homePage
                .isValidUserLogIn();
    }
}
