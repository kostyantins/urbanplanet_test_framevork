package project.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import project.elements.locators.HomePageLocators;
import project.elements.wrapers.Element;
import project.elements.wrapers.Link;
import project.utils.PropertiesReader;

@Getter
public class HomePage extends PageObject<HomePage> {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final Element logo = new Element(driver, HomePageLocators.LOGO);
    private final Element clock = new Element(driver, HomePageLocators.CLOCK);
    private final Element newsAlertWindow = new Element(driver, HomePageLocators.NEWS_ALERT_WINDOW);
    private final Link userOfficePageLink = new Link(driver, HomePageLocators.USER_OFFICE_PAGE_LINK);

    @Override
    public final HomePage refreshPage() {

        super
                .refreshPage();

        return this;
    }

    public final UserOfficePage goToUserOfficePage() {

        userOfficePageLink
                .click();

        return new UserOfficePage(driver);
    }

    public final void isValidUserLogIn() {

        final String userName = PropertiesReader.getProperty("valid.login");

        getUserOfficePageLink()
                .getText()
                .contains(userName);
    }
}
