package project.elements.wrapers;

import org.openqa.selenium.WebDriver;
import project.elements.interfaces.ILocator;

public class Link extends AbstractClickableElement {

    public Link(WebDriver driver, ILocator locator) {
        super(driver, locator);
    }
}
