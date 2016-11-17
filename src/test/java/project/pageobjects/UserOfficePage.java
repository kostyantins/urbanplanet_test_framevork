package project.pageobjects;

import org.openqa.selenium.WebDriver;
import project.elements.locators.UserOfficePageLocators;
import project.elements.wrapers.Button;
import project.elements.wrapers.TextInputField;
import project.utils.PropertiesReader;

public class UserOfficePage extends PageObject<UserOfficePage> {


    public UserOfficePage(WebDriver driver) {
        super(driver);
    }

    private final Button logInButton = new Button(driver, UserOfficePageLocators.LOG_IN_BUTTON);
    private final TextInputField logLnTextField = new TextInputField(driver, UserOfficePageLocators.LOG_IN_TEXT_FIELD);
    private final TextInputField passwordTextField = new TextInputField(driver, UserOfficePageLocators.PASSWORD_TEXT_FIELD);

    public final HomePage logIn() {

        final String userName = PropertiesReader.getProperty("valid.login");
        final String userPassword = PropertiesReader.getProperty("valid.password");

        logLnTextField
                .clear()
                .sendKeys(userName);

        passwordTextField
                .clear()
                .sendKeys(userPassword);

        logInButton
                .click();

        return new HomePage(driver);
    }

}
