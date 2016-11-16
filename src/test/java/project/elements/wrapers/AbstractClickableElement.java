package project.elements.wrapers;

import org.openqa.selenium.WebDriver;
import project.elements.interfaces.ILocator;
import project.utils.Logger;

public abstract class AbstractClickableElement<T> extends AbstractElement {

    AbstractClickableElement(final WebDriver driver, final ILocator locator) {

        super(driver, locator);
    }

    public final T click() {

        wait
                .getClickableElement()
                .click();

        Logger
                .logInfo("<font color='black'>Clicked On " + "<b>" + locator.getName() + "</b></font>");

        return (T) this;
    }
}
