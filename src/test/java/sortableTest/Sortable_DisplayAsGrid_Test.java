package sortableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

public class Sortable_DisplayAsGrid_Test extends Hooks {

    Pages pages = new Pages();
    SoftAssertions softAssertions =new SoftAssertions();

    @Test
    public void testDisplayAsGrid(){
        //Navigate to the DisplayAsGridPage
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnSortableLink();


        //Click on Display as grid button
        pages.getWebAutomationPage().clickOnDisplayAsGridLink();
        String initialArrangement = pages.getDisplayAsGridPage().lineageOfNumbers();

        // Hold '1' and move it to place of '6'
        pages.getDisplayAsGridPage().moveToElementByOffset("1",110,100);


        // Verify that location of '1' is now '6'
        String expectedLocation = "1";
        String actualLocation = pages.getDisplayAsGridPage().getNumberElementLocation("6");

        Assertions.assertThat(actualLocation).as("Location is not true!").isEqualTo(expectedLocation);

        // Verify that arrangement of numbers changed
        String finalArrangement = pages.getDisplayAsGridPage().lineageOfNumbers();

        Assertions.assertThat(finalArrangement).as("Arrangement is not changed!").isNotEqualTo(expectedLocation);

    }
}
