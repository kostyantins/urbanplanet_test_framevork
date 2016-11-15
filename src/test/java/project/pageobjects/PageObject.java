package project.pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public abstract class PageObject<T> {

    protected WebDriver driver;

    public PageObject(final WebDriver driver) {
        this.driver = driver;
    }

//    public HomePage doLogOut() {
//
//        clickLogOut();
//        acceptAlert();
//
//        return new HomePage(driver);
//    }

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
