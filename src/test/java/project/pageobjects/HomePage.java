package project.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import project.elements.locators.AboutUsPageLocators;
import project.elements.locators.HomePageLocators;
import project.elements.wrapers.AbstractClickableElement;
import project.elements.wrapers.Element;
import project.elements.wrapers.Link;
import project.utils.PropertiesReader;

import static project.asserts.FluentAssertions.assertThat;

@Getter
public class HomePage extends PageObject<HomePage> {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final Element clock = new Element(driver, HomePageLocators.CLOCK);
    private final Element newsAlertWindow = new Element(driver, HomePageLocators.NEWS_ALERT_WINDOW);
    private final Link userOfficePageLink = new Link(driver, HomePageLocators.USER_OFFICE_PAGE_LINK);
    private final Link aboutUsPageLink = new Link(driver, HomePageLocators.ABOUT_US_PAGE_LINK);
    private final Link accessoriesPageLink = new Link(driver, HomePageLocators.ACCESSORIES_PAGE_LINK);
    private final Link deliveryAndPaymentPageLink = new Link(driver, HomePageLocators.DELIVERY_AND_PAYMENT_PAGE_LINK);
    private final Link guarantyPageLink = new Link(driver, HomePageLocators.GUARANTY_PAGE_LINK);
    private final Link manClothesPageLink = new Link(driver, HomePageLocators.MAN_CLOTHES_PAGE_LINK);
    private final Link registrationPageLink = new Link(driver, HomePageLocators.REGISTRATION_PAGE_LINK);
    private final Link shopsPageLink = new Link(driver, HomePageLocators.SHOPS_PAGE_LINK);
    private final Link womanClothesPageLink = new Link(driver, HomePageLocators.WOMAN_CLOTHES_PAGE_LINK);


    @Override
    public final HomePage refreshPage() {

        super
                .refreshPage();

        return this;
    }

   public final UserOfficePage goToUserOfficePage (){
       userOfficePageLink.click();
       return new UserOfficePage(driver);
   }

    public final void isValidUserLogIn() {

        final String userName = PropertiesReader.getProperty("valid.login");

        assertThat(getUserOfficePageLink())
                .textContains(userName);
    }
}
