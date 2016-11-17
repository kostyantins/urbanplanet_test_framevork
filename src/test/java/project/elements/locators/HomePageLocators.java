package project.elements.locators;

import org.openqa.selenium.By;
import project.elements.LocatorsType;
import project.elements.interfaces.ILocator;

public enum HomePageLocators implements ILocator {

    //unique page locator for page identification
    CLOCK("Clock", LocatorsType.BY_XPATH, "(//*[@id='wpo-mainnav']//img)[2]"),
    LOGO("Logo", LocatorsType.BY_XPATH, "//*[@id='wpo-mainnav']//a/img"),
    NEWS_ALERT_WINDOW("News alert window", LocatorsType.BY_XPATH, "//*[@id='subscribe-form']"),
    USER_OFFICE_PAGE_LINK("User office page link", LocatorsType.BY_XPATH, "(//*[@id='topbar']//a[1])[6]");

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
