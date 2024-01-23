package datepickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 * Navigate To Selecet Date Range Page
 * ClickOn fromDateBox
 * Verify that the Months are Displaying
 * ClickOn Prev and next Buttons
 * Click to toDateButton and check the Prev and Next buttons
 * Select a month and verify that selection process worked correctly
 */

public class SelectDateRange_Test extends Hooks {
    Pages pages = new Pages();
    @Test
    public void testSelectDateRange(){
        //Navigate To Selecet Date Range Page
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnDatePickerLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnSelectDateRangeLink();


        //ClickOn fromDateBox
        pages.getSelecDateRangePage().clickFromDateBox();

        //Verify that the Months are Displaying
        Assertions.assertTrue(pages.getSelecDateRangePage().isDisplayedFromfromDateList(),"The table can not seen.");

        //ClickOn Prev and next Buttons
        pages.getSelecDateRangePage().clickNextButtons(3);
        pages.getSelecDateRangePage().clickPrevButtons(3);

        //Click to toDateButton and check the Prev and Next buttons
        pages.getSelecDateRangePage().clickToDateBox();
        pages.getSelecDateRangePage().clickPrevButtons(2);
        pages.getSelecDateRangePage().clickNextButtons(2);

        //Select a month and verify that selection process worked correctly
        pages.getSelecDateRangePage().clickFromDateBox();
        pages.getSelecDateRangePage().selectTheMonth("5");
        boolean isCorrect = pages.getSelecDateRangePage().isSelectedMonthShownCorrectly("july");
        Assertions.assertTrue(isCorrect,"Upcoming month should be june!!");
    }
}
