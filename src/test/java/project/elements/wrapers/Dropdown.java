package project.elements.wrapers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import project.elements.interfaces.ILocator;
import project.utils.Logger;

public class Dropdown extends AbstractClickableElement<Dropdown> {

    public Dropdown(final WebDriver driver, final ILocator locator) {
        super(driver, locator);
    }

    public final Dropdown selectByValue(final String valueOfElement) {

        new Select(wait
                .getClickableElement())
                .selectByValue(valueOfElement);

        return this;
    }

    public final void sendKeys(final String inputText) {

        wait
                .getClickableElement()
                .sendKeys(inputText);

        Logger
                .logInfo("<font color='black'>Selected by value: " + inputText + " into " + "<b>" + locator.getName() + "</b></font>");
    }
}
