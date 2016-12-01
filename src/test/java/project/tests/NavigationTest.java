package project.tests;

import org.testng.annotations.Test;
import project.elements.wrapers.AbstractClickableElement;
import project.elements.wrapers.AbstractElement;
import project.enums.PageToGo;
import project.enums.PageToGoConfirmElement;
import project.utils.DataProvider;
import project.utils.TestRunner;

import static project.asserts.FluentAssertions.assertThat;

public class NavigationTest extends TestRunner {

    @Test(dataProvider = "testDataNavigation", dataProviderClass = DataProvider.class)
    public final void testUserOfficePage(final PageToGo pageToGo, final PageToGoConfirmElement elementToConfirm) {

        homePage
                .goToPage(pageToGo);

        assertThat(homePage.confirmOf(elementToConfirm)).isDisplayed();

        driver
                .navigate()
                .back();

        assertThat(homePage.getHomePageLogo()).isDisplayed();
    }
}


