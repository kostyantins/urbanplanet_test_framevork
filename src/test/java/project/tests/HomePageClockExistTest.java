package project.tests;

import org.testng.annotations.Test;
import project.utils.TestRunner;

import static project.asserts.FluentAssertions.assertThat;

public class HomePageClockExistTest extends TestRunner {

    @Test
    public final void testHomePageClockExist() {

        assertThat(homePage
                .getClock()
                .isDisplayed());
    }
}
