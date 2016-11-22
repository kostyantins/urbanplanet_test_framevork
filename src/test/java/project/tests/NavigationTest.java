package project.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project.elements.wrapers.AbstractClickableElement;
import project.pageobjects.AboutUsPage;
import project.pageobjects.PageObject;
import project.pageobjects.UserOfficePage;
import project.utils.DataProvider;
import project.utils.TestRunner;

import static project.asserts.FluentAssertions.assertThat;

public class NavigationTest extends TestRunner {

    @BeforeMethod
    public final void initialisePageObjects() {

        userOfficePage = new UserOfficePage(driver);
        aboutUsPage = new AboutUsPage(driver);
    }

    @Test   //(dataProvider = "testDataNavigation", dataProviderClass = DataProvider.class)
    public final void testUserOfficePage() {

        homePage
                .goTo(homePage.getUserOfficePageLink()); //final AbstractClickableElement pageToGo, final AbstractClickableElement PageToGoConfirm, final PageObject currentPage, final AbstractClickableElement backToHomePage,

        assertThat(userOfficePage.getUserOfficePageLogo()).isDisplayed();

        userOfficePage
                .goTo(userOfficePage.getUserOfficePageLogo());

        assertThat(homePage.getHomePageLogo()).isDisplayed();

    }

    @Test
    public final void testAboutUsPage() {

        homePage
                .goTo(homePage.getAboutUsPageLink());

        assertThat(aboutUsPage.getAboutUsTextLabel()).isDisplayed();

        aboutUsPage
                .goTo(aboutUsPage.getHomePageLogo());

        assertThat(homePage.getHomePageLogo()).isDisplayed();
    }
}

