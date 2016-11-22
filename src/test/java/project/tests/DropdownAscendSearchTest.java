package project.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project.pageobjects.ManClothesPage;
import project.utils.Sort;
import project.utils.TestRunner;

import static project.asserts.FluentAssertions.*;
import static project.enums.OrderLine.ASCENDANT;
import static project.enums.SortConditions.PRICE_ASCEND;

public class DropdownAscendSearchTest extends TestRunner {

    @BeforeMethod
    public final void initialisePage() {

        manClothesPage = new ManClothesPage(driver);
    }

    @Test
    public final void testDropdownAscendSearch() {

        homePage
                .goTo(homePage.getManClothesPageLink());

        manClothesPage.sortClothesBy(PRICE_ASCEND);

        final boolean isSortedByAscent = Sort
                .isListSorted(manClothesPage.getManClothesTablePrices().getElements(), ASCENDANT);

        assertThat(isSortedByAscent).isTrue();
    }
}
