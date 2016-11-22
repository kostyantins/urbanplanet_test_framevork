package project.utils;

import project.pageobjects.HomePage;
import project.pageobjects.UserOfficePage;

public class DataProvider {

    private DataProvider() {
    }

    @org.testng.annotations.DataProvider
    public static Object[][] testDataNavigation() {
        return new Object[][]{
                {new HomePage(new TestRunner().getDriver()).getUserOfficePageLink(),
                        new UserOfficePage(new TestRunner().getDriver()).getUserOfficePageLogo(),
                        new UserOfficePage(new TestRunner().getDriver()),
                        new UserOfficePage(new TestRunner().getDriver()).getUserOfficePageLogo()}};

    }
}
