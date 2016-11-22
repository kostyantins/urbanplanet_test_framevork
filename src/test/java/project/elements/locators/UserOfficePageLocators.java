package project.elements.locators;

import org.openqa.selenium.By;
import project.elements.LocatorsType;
import project.elements.interfaces.ILocator;

public enum UserOfficePageLocators implements ILocator {

    //unique page locator for page identification
    LOG_IN_BUTTON("Log in button", LocatorsType.BY_NAME, "Login"),
    LOG_IN_TEXT_FIELD("Log in text field", LocatorsType.BY_ID, "user_login"),
    PASSWORD_TEXT_FIELD("Password text field", LocatorsType.BY_ID, "user_pass"),
    USER_OFFICE_PAGE_LOGO("User office page logo", LocatorsType.BY_XPATH, "//*[@id='login']//a");

    private String elementName;
    private LocatorsType locatorType;
    private String locatorValue;
    private String modifiedLocator;

    UserOfficePageLocators(final String elementName, final LocatorsType locatorType, final String locatorValue) {

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
    public UserOfficePageLocators modify(final String parameter) {

        this.modifiedLocator = String.format(this.locatorValue, parameter);

        return this;
    }
}
