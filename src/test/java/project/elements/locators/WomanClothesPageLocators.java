package project.elements.locators;

import org.openqa.selenium.By;
import project.elements.LocatorsType;
import project.elements.interfaces.ILocator;

public enum WomanClothesPageLocators implements ILocator {

    //unique page locator for page identification
    WOMAN_CLOTHES_TEXT_LABEL("Woman clothes text label",LocatorsType.BY_XPATH, "//*[@id='breadcrumb']/span[2]");

    private String elementName;
    private LocatorsType locatorType;
    private String locatorValue;
    private String modifiedLocator;

    WomanClothesPageLocators(final String elementName, final LocatorsType locatorType, final String locatorValue) {

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
    public WomanClothesPageLocators modify(final String parameter) {

        this.modifiedLocator = String.format(this.locatorValue, parameter);

        return this;
    }
}
