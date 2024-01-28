package sortableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

public class Sortable_IncludeExcludeItems_Test extends Hooks {
    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testIcludeExcludeItems(){

        //Navigate to the IncludeExcludePage
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnSortableLink();
        pages.getWebAutomationPage().clickOnIcludeExcludeItemsLink();


        //5. Hold 'Item 1' and drag it under 'Item 4'
        pages.getIncludeExcludeItemsPage().moveUpperBoxElementByOffsets("Item 1", "Item 4");

        //6. Verify that 'Item 1' is in the fourth order
        String expectedFourthElement = "Item 1";
        String actualFourthElement = pages.getIncludeExcludeItemsPage().getWebElementsNameByItsOrder("upper", "4");

        Assertions.assertThat(actualFourthElement).as("Item 4 is not sortable!").isEqualTo(expectedFourthElement);

        //7. Hold '(I'm not sortable or a drop target)' element and drag it under 'Item 1'
        pages.getIncludeExcludeItemsPage().moveUpperBoxElementByOffsets("(I'm not sortable or a drop target)", "Item 4");

        // 8. Verify that '(I'm not sortable or a drop target)' element is not sortable
        expectedFourthElement = "Item 1";
        actualFourthElement = pages.getIncludeExcludeItemsPage().getWebElementsNameByItsOrder("upper", "4");

        Assertions.assertThat(actualFourthElement).as("(I'm not sortable or a drop target) is sortable!").isEqualTo(expectedFourthElement);

        //9. Hold 'Item 4' and drag it above the '(I'm not sortable or a drop target)' element
        // initial Position Of Item 4 = "3";
        pages.getIncludeExcludeItemsPage().moveUpperBoxElementByOffsets("Item 4", "(I'm not sortable or a drop target)");

        //10.Verify that 'Item 4' can not be droppable above '(I'm not sortable or a drop target)' element
        String expectedElementInThirdOrder = "Item 4";
        String actualElementInThirdOrder = pages.getIncludeExcludeItemsPage().getWebElementsNameByItsOrder("upper", "3");

        Assertions.assertThat(actualElementInThirdOrder).as("Wrong order!").isEqualTo(expectedElementInThirdOrder);
    }
}
