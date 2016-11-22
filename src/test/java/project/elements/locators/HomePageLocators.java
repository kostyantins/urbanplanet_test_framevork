package project.elements.locators;

import org.openqa.selenium.By;
import project.elements.LocatorsType;
import project.elements.interfaces.ILocator;

public enum HomePageLocators implements ILocator {

    //unique page locator for page identification
    CLOCK("Clock", LocatorsType.BY_XPATH, "(//*[@id='wpo-mainnav']//img)[2]"),
    HOME_PAGE_LOGO("Logo", LocatorsType.BY_XPATH, "//*[@id='wpo-mainnav']//a/img"),
    NEWS_ALERT_WINDOW("News alert window", LocatorsType.BY_XPATH, "//*[@id='subscribe-form']"),
    USER_OFFICE_PAGE_LINK("User office page link", LocatorsType.BY_XPATH, "(//*[@id='topbar']//a[1])[6]"),
    LOG_OUT_LINK("Log out link", LocatorsType.BY_XPATH, "//*[@id='main_lk']//li[3]/a"),
    ABOUT_US_PAGE_LINK("About us page link", LocatorsType.BY_XPATH, "(//*[@id='top-nav']//a)[2]"),
    ACCESSORIES_PAGE_LINK("Accessories page link", LocatorsType.BY_XPATH, "//*[@id='main-menu']/li[3]/a"),
    DELIVERY_AND_PAYMENT_PAGE_LINK("Delivery and payment page link", LocatorsType.BY_XPATH, "(//*[@id='top-nav']//a)[1]"),
    GUARANTY_PAGE_LINK("Guaranty page link", LocatorsType.BY_XPATH, "(//*[@id='top-nav']//a)[3]"),
    MAN_CLOTHES_PAGE_LINK("Man clothes page link", LocatorsType.BY_XPATH, "//*[@id='main-menu']/li[1]/a"),
    REGISTRATION_PAGE_LINK("Registration page link", LocatorsType.BY_XPATH, "//*[@id='topbar']//a[2]"),
    SHOPS_PAGE_LINK("Shops page link", LocatorsType.BY_XPATH, "//*[@id='main-menu']/li[5]/a"),
    WOMAN_CLOTHES_PAGE_LINK("Woman clothes page link", LocatorsType.BY_XPATH, "//*[@id='main-menu']/li[2]/a");

    private String elementName;
    private LocatorsType locatorType;
    private String locatorValue;
    private String modifiedLocator;

    HomePageLocators(final String elementName, final LocatorsType locatorType, final String locatorValue) {

        this.elementName = elementName;
        this.locatorType = locatorType;
        this.locatorValue = locatorValue;
    }

    @Override
    public String getName() {

        return this.elementName;
    }

    @Override
    public By getBy() {

        By by;

        if (this.modifiedLocator == null) {
            by = this.locatorType.getBy(this.locatorValue);
        } else {
            by = this.locatorType.getBy(this.modifiedLocator);
        }
        return by;
    }

    @Override
    public HomePageLocators modify(final String parameter) {

        this.modifiedLocator = String.format(this.locatorValue, parameter);

        return this;
    }
}
