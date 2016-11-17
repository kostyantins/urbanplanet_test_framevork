package project.elements.wrapers;

import org.openqa.selenium.WebDriver;
import project.elements.interfaces.ILocator;

public class Button extends AbstractClickableElement {

    public Button(WebDriver driver, ILocator locator) {

        super(driver, locator);
    }
}
