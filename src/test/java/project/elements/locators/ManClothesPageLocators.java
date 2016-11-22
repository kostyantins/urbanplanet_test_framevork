package project.elements.locators;

import org.openqa.selenium.By;
import project.elements.LocatorsType;
import project.elements.interfaces.ILocator;

public enum ManClothesPageLocators implements ILocator {

    //unique page locator for page identification
    MAN_CLOTHES_TEXT_LABEL("Man clothes text label",LocatorsType.BY_XPATH, "//*[@id='breadcrumb']/span[2]"),
    MAN_CLOTHES_TABLE_PRICES("Man clothes table prices",LocatorsType.BY_XPATH, "//*[@id='wpo-mainbody']//span[@class='amount']"),
    SORT_BY_APPEAR_LINK("Sort by appear link",LocatorsType.BY_XPATH, "(//*[@id='myForm']//option)[1]"),
    SORT_BY_DATA_LINK("Sort by data link",LocatorsType.BY_XPATH, "(//*[@id='myForm']//option)[2]"),
    SORT_BY_PRICE_ASCEND_LINK("Sort by price ascend link",LocatorsType.BY_XPATH, "(//*[@id='myForm']//option)[3]"),
    SORT_BY_PRICE_DESCEND_LINK("Sort by price descend link",LocatorsType.BY_XPATH, "(//*[@id='myForm']//option)[4]");

    private String elementName;
    private LocatorsType locatorType;
    private String locatorValue;
    private String modifiedLocator;

    ManClothesPageLocators(final String elementName, final LocatorsType locatorType, final String locatorValue) {

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
    public ManClothesPageLocators modify(final String parameter) {

        this.modifiedLocator = String.format(this.locatorValue, parameter);

        return this;
    }
}
