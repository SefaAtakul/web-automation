package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the Alert button
 * 3. click on the ShowConfirm button
 * 4. switch to alert and accept the ShowConfirm alert.
 * 5.Verify that the message shown
 * 6.Dismiss the LAst message
 */
public class AlertTypes_ShowPrompt_Test extends Hooks {
    @Test
    void testShowPromptButton(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the Alert button
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnAlertsLink();
        BrowserUtils.scrollUpWithPageUp();
        //3. click on the ShowPrompt button
        pages.getAlertTypes_page_1().clickOnPromptButton();
        //4.Swtich to alert and sendKey as name
        pages.getAlertTypes_page_1().switchToAlert();
        pages.getAlertTypes_page_1().sendMessageTheAlert("Johny King");
        //5.Confirm the alert
        pages.getAlertTypes_page_1().confirmTheAlert();
        //6.Verify that the Confirmation message  prompted
        String actual = pages.getAlertTypes_page_1().getTextOfAlert();
        String expected ="Hello, Johny King!";
        Assertions.assertEquals(expected,actual,"The message did not seen!");
        //7.Comfirm the last message
        pages.getAlertTypes_page_1().confirmTheAlert();
    }
}
