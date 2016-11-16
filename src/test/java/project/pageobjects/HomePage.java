package project.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import project.elements.locators.HomePageLocators;
import project.elements.wrapers.Element;

@Getter
public class HomePage extends PageObject<HomePage> {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final Element logo = new Element(driver, HomePageLocators.LOGO);
    private final Element clock = new Element(driver, HomePageLocators.CLOCK);
    private final Element newsAlertWindow = new Element(driver, HomePageLocators.NEWS_ALERT_WINDOW);

    @Override
    public HomePage refreshPage() {

        super
                .refreshPage();

        return this;
    }
}
