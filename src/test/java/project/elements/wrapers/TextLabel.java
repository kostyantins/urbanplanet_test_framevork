package project.elements.wrapers;

import org.openqa.selenium.WebDriver;
import project.elements.interfaces.ILocator;

public class TextLabel extends AbstractElement {

    public TextLabel(WebDriver driver, ILocator locator) {
        super(driver, locator);
    }
}
