package datepickerTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 1.navigate to the DatePickerLink
 2.ClickOn DisplayMultipleMonths
 3.ClickOn dateField
 4.Verify that the prev and next buttons works clearly
 5.select a date from first month
 6.verify that selected month and actual equals
 7.Control the today and done buttons
 8.Verify that Today process works properly
**/

public class DisplayMultipleMonths_Test extends Hooks {

    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();
    @Test
    public void testDisplasyMultipleMonths(){

        //navigate to the DatePickerLink
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnDatePickerLink();

        //ClickOn DisplayMultipleMonths
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnDisplayMultipleMonthsLink();

        //ClickOn dateField
        pages.getDisplayMultipleMonthsPage().clickOnDateField();
        BrowserUtils.wait(2.0);

        //Verify that the prev and next buttons works clearly
        pages.getDisplayMultipleMonthsPage().clickOnPrevButtonToSeePassingMonths(3);
        pages.getDisplayMultipleMonthsPage().clickOnNextButtonToSeePassingMonths(3);

        //select a date from first month
        pages.getDisplayMultipleMonthsPage().selectASpecificDateForFirstMonth(14);

        //verify that selected month and actual equals
        //String dateSelectedFromDatePicker = pages.getDisplayMultipleMonthsPage().getDateShownOnDateField();
        //String dateExpected = "01/14/2024";
        //softAssertions.assertThat(dateSelectedFromDatePicker).isEqualTo(dateExpected);

        //Control the today and done buttons
        pages.getDisplayMultipleMonthsPage().clickOnDateDisplayField();
        pages.getDisplayMultipleMonthsPage().clickOnTodayButton();
        pages.getDisplayMultipleMonthsPage().clickOnDOneButton();

        //Verify that Today process works properly
        String currentDate = pages.getDisplayMultipleMonthsPage().getCurrentDate(); // Get the date of the current day in a specific format (MM/dd/yyyy)
        String actualDate = pages.getDisplayMultipleMonthsPage().getDateShownOnDateField();
        Assertions.assertEquals(currentDate,actualDate,"The today button is not work clearly");


        softAssertions.assertAll();
    }
}
