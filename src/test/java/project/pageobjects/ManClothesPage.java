package project.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import project.elements.locators.ManClothesPageLocators;
import project.elements.wrapers.Dropdown;
import project.elements.wrapers.Link;
import project.elements.wrapers.TextLabel;
import project.enums.SortConditions;

@Getter
public class ManClothesPage extends PageObject<ManClothesPage> {

    public ManClothesPage(WebDriver driver) {
        super(driver);
    }

    private final TextLabel manClothesTextLabel = new TextLabel(driver, ManClothesPageLocators.MAN_CLOTHES_TEXT_LABEL);
    private final TextLabel manClothesTablePrices = new TextLabel(driver, ManClothesPageLocators.MAN_CLOTHES_TABLE_PRICES);
    private final Link sortByAppearLink = new Link(driver, ManClothesPageLocators.SORT_BY_APPEAR_LINK);
    private final Link sortByDataLink = new Link(driver, ManClothesPageLocators.SORT_BY_DATA_LINK);
    private final Link sortByPriceAscendLink = new Link(driver, ManClothesPageLocators.SORT_BY_PRICE_ASCEND_LINK);
    private final Link sortByPriceDescendLink = new Link(driver, ManClothesPageLocators.SORT_BY_PRICE_DESCEND_LINK);

    public final ManClothesPage sortClothesBy(final SortConditions condition) {

        switch (condition) {

            case APPEAR:
                sortByAppearLink.click();
                break;
            case DATA:
                sortByDataLink.click();
                break;
            case PRICE_ASCEND:
                sortByPriceAscendLink.click();
                break;
            case PRICE_DESCEND:
                sortByPriceDescendLink.click();
                break;
        }
        return this;
    }
}
