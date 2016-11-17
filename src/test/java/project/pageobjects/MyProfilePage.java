package project.pageobjects;

import org.openqa.selenium.WebDriver;
import project.elements.locators.HomePageLocators;
import project.elements.locators.MyProfilePageLocators;
import project.elements.wrapers.Element;

public class MyProfilePage extends PageObject<MyProfilePage> {

    public MyProfilePage(WebDriver driver) {
        super(driver);
    }

    private final Element myProfileTextLabel = new Element(driver, MyProfilePageLocators.MY_PROFILE_TEXT_LABEL);

}
