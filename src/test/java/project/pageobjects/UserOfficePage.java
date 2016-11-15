package project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserOfficePage extends PageObject<UserOfficePage> {


    public UserOfficePage(WebDriver driver) {
        super(driver);
    }

    public static final By LOG_IN_TEXT_FIELD = By.id("user_login");

    public static final By PASSWORD_TEXT_FIELD = By.id("user_pass");

    public static final By LOG_IN_BUTTON = By.name("Login");

}
