package project.tests;

import org.testng.annotations.Test;
import project.utils.TestRunner;

import static project.asserts.FluentAssertions.assertThat;

public class HomePageLogoExistTest extends TestRunner {

    @Test
    public final void testHomePageLogoExist() {

        assertThat(homePage
                .getLogo()
                .isDisplayed());
    }
}
