package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;
/**
 * 1. Open the browser and navigate to the page
 * 2. click on the Alert button
 * 3. click on the ShowConfirm button
 * 4. switch to alert and accept the ShowConfirm alert.
 * 5.Verify that the message shown
 * 6.Dismiss the LAst message
 */

public class AlertTypes_ShowConfirm_Test extends Hooks {
    Pages pages = new Pages();
    @Test
    void testAlertTypesComfirm(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the Alert button
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnAlertsLink();
        BrowserUtils.scrollUpWithPageUp();
        //3. click on the ShowConfirm button
        pages.getAlertTypes_page_1().clickOnConfirmButton();
        BrowserUtils.wait(2);
        //4. switch to alert and accept the ShowConfirm alert.
        pages.getAlertTypes_page_1().switchToAlert();
        pages.getAlertTypes_page_1().confirmTheAlert();
        //5.Verify that the message shown
        String actual = pages.getAlertTypes_page_1().getTextOfAlert();
        String expected = "Confirmed!";
        Assertions.assertEquals(expected,actual,"We get the wrong text message!");
        //6.Dismiss the LAst message
        pages.getAlertTypes_page_1().rejectTheAlert();

    }
}
