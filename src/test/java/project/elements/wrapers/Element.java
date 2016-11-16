package project.elements.wrapers;

import org.openqa.selenium.WebDriver;
import project.elements.interfaces.ILocator;

public class Element extends AbstractElement {


    public Element(WebDriver driver, ILocator locator) {

        super(driver, locator);
    }

}
