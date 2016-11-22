package project.pageobjects;

import org.openqa.selenium.WebDriver;
import project.elements.locators.ManClothesPageLocators;
import project.elements.locators.UserOfficePageLocators;
import project.elements.wrapers.TextInputField;
import project.elements.wrapers.TextLabel;

public class ManClothesPage extends PageObject<ManClothesPage> {

    public ManClothesPage(WebDriver driver) {
        super(driver);
    }

    private final TextLabel manClothesTextLabel = new TextLabel(driver, ManClothesPageLocators.MAN_CLOTHES_TEXT_LABEL);

}
