package project.pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import project.elements.locators.HomePageLocators;
import project.elements.locators.UserOfficePageLocators;
import project.elements.wrapers.AbstractClickableElement;
import project.elements.wrapers.AbstractElement;
import project.elements.wrapers.Link;

@Getter
public abstract class PageObject<T> {

    protected WebDriver driver;
    protected Link logOutLink;
    protected Link homePageLogo;
    protected Link userOfficePageLogo;


    public PageObject(final WebDriver driver) {

        this.driver = driver;
        logOutLink = new Link(driver, HomePageLocators.LOG_OUT_LINK);
        homePageLogo = new Link(driver, HomePageLocators.HOME_PAGE_LOGO);
        userOfficePageLogo = new Link(driver, UserOfficePageLocators.USER_OFFICE_PAGE_LOGO);
    }

    public T goTo(final AbstractClickableElement pageLink){

        pageLink
                .click();

        return (T) this;
    }

    public T doLogOut() {

        logOutLink
                .click();

        return (T) this;
    }

    public WebElement findElement(By pageElement) {

        driver
                .findElement(pageElement);

        return (WebElement) pageElement;
    }

    public T acceptAlert() {

        driver.switchTo()
                .alert()
                .accept();

        return (T) this;
    }

    public T dismissAlert() {

        driver.switchTo()
                .alert()
                .dismiss();

        return (T) this;
    }

    public T refreshPage() {

        driver
                .navigate()
                .refresh();

        return (T) this;
    }
}
