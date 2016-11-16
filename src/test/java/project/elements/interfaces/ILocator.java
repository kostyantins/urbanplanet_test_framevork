package project.elements.interfaces;

import org.openqa.selenium.By;

public interface ILocator {

    String getName();

    By getBy();

    ILocator modify(String newLocatorValue);
}
