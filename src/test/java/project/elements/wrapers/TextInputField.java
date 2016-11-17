package project.elements.wrapers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import project.elements.interfaces.ILocator;
import project.utils.Logger;

public class TextInputField extends AbstractClickableElement {

    public TextInputField(WebDriver driver, ILocator locator) {

        super(driver, locator);
    }

    public final WebElement clear() {

        final WebElement element = wait.getClickableElement();

        element
                .clear();

        Logger
                .logInfo("<font color='black'>Cleared Element " + "<b>" + locator.getName() + "</b></font>");

        return element;
    }

    public final void sendKeys(final String inputText) {

        clear()
                .sendKeys(inputText);

        Logger
                .logInfo("<font color='black'>Made input: " + inputText + " into " + "<b>" + locator.getName() + "</b></font>");
    }
}
