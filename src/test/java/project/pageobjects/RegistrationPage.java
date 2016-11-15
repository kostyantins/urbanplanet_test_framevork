package project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends PageObject {


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public static final By REGISTRATION_TEXT_LABEL = By.xpath("//*[@id='login']/p[1]");
}
