package spinnerTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 *Navigate to the SpinnerOverflowPage
 *Click to the increment button
 *Set SpinnerOverflow box to number'10' and click increment button '1' time
 *Verify that the SpinnerOverFlowBox is equal to'-10'
 *Set SpinnerOverflow box to number'-10' and click decrement button '1' time
 *Verify that the SpinnerOverFlowBox is equal to'-10'
 */

public class Spinner_SpinnerOverflow_Test extends Hooks {
    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testSpinnerOverflow(){
        //Navigate to the SpinnerOverflowPage
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnSpinnerLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnSpinnerOverflowLink();


        //Click to the increment button
        pages.getSpinnerOverflowPage().clickOnIncrementButton(5);
        BrowserUtils.wait(1.0);
        pages.getSpinnerOverflowPage().clickOnDecrementButton(3);

        //Set SpinnerOverflow box to number'10' and click increment button '1' time
        pages.getSpinnerOverflowPage().sendNumberToSelectionBox("10");
        pages.getSpinnerOverflowPage().clickOnIncrementButton(1);

        //Verify that the SpinnerOverFlowBox is equal to'-10'
        String actual = pages.getSpinnerOverflowPage().getSelectedValue();
        Assertions.assertEquals("-10",actual);

        //Set SpinnerOverflow box to number'-10' and click decrement button '1' time
        pages.getSpinnerOverflowPage().sendNumberToSelectionBox("-10");
        pages.getSpinnerOverflowPage().clickOnDecrementButton(1);

        //Verify that the SpinnerOverFlowBox is equal to'-10'
        String actual1 = pages.getSpinnerOverflowPage().getSelectedValue();
        Assertions.assertEquals("10",actual1);
    }
}
