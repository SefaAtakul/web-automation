package sliderTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

public class Slider_SnapToIncrements_Test extends Hooks {
    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testSnapToIncrements(){
        //Navigate To SnapToIncrementsPage
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnSliderLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnSnapToIncrementLink();

        //Slide the handle to the right
        pages.getWebAutomationPage().clickOnSnapToIncrementLink();

        // Slide the handle to the right for a specific value
        pages.getSnapToIncrementsPage().holdOnSlidingHandleAndDragToTheRightOrLeft(980);

        // Slide the handle to the left for a specific value
        pages.getSnapToIncrementsPage().holdOnSlidingHandleAndDragToTheRightOrLeft(-500);

        // Get the value of Donation Amount shown by "Donation amount ($50 increments):"
        boolean isDonationAmountMachWithIncrementAmount = pages.getSnapToIncrementsPage().isDonationAmountMachWithIncrementAmount(200);
        softAssertions.assertThat(isDonationAmountMachWithIncrementAmount).isTrue().as("Donation amount does not match with the increment amount provided");

        // Collect all failures if they occur
        softAssertions.assertAll();

    }
}
