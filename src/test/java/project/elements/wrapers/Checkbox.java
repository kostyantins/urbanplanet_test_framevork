package project.elements.wrapers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import project.elements.interfaces.ILocator;

public class Checkbox extends AbstractClickableElement<Checkbox> {

    Checkbox(WebDriver driver, ILocator locator) {

        super(driver, locator);
    }

    public final void select() {

        final WebElement webElement = wait.getClickableElement();

        if (!webElement.isSelected()) {
            webElement.click();
        }
    }
}
