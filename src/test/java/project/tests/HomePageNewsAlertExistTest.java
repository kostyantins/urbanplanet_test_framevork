package project.tests;

import org.testng.annotations.Test;
import project.utils.TestRunner;

import static project.asserts.FluentAssertions.assertThat;

public class HomePageNewsAlertExistTest extends TestRunner {

    @Test
    public final void testHomePageNewsAlertExist() {

        assertThat(homePage.getNewsAlertWindow()).isDisplayed();
    }
}
