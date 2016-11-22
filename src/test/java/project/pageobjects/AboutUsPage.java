package project.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import project.elements.locators.AboutUsPageLocators;
import project.elements.wrapers.TextLabel;

@Getter
public class AboutUsPage extends PageObject<AboutUsPage> {

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    private final TextLabel aboutUsTextLabel = new TextLabel(driver, AboutUsPageLocators.ABOUT_UA_TEXT_LABEL);

}
