package autoCompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;
/**
 * 1. Open the browser and navigate to the page
 * 2. click on web automation link
 * 3. click on the auto complete button
 * 4. click on the AccentFolding button
 * 5. Enter "Jo" to Developer text field
 * 6. Verify that the sugesstion menu suggest "John" and "Jörn"
 * 7. Clear the text field
 * 8. Enter "jö" in the text field
 * 9. Verify that only jörn seen in developer suggestion menu
 * 10.
 * 11.
 */

public class AutoComplete_AccentFolding_Test extends Hooks {

    Pages pages = new Pages();
    @Test
    public void testAccentFolding(){
        //1. Open the browser and navigate to the page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the auto complete button
        pages.getWebAutomationPage().clickOnAutoCompleteLink();

        //4. click on the AccentFolding button
        pages.getWebAutomationPage().clickOnAccentFoldingLink();

        //5. Enter Jo to Developer text field
        pages.getAccentFoldingPage().enterDeveloperInput("jo");

        //6. Verify that the sugesstion menu uggest "John" and "Jörn"
        boolean isDisplayed = pages.getAccentFoldingPage().getSuggestionMenuDisplayed();
        Assertions.assertTrue(isDisplayed, "true");

        String firstName = pages.getAccentFoldingPage().getSuggestionMenu().get(0);
        Assertions.assertEquals("Jörn Zaefferer",firstName,"Wrong name displayed!");

        String secondName = pages.getAccentFoldingPage().getSuggestionMenu().get(1);
        Assertions.assertEquals("John Resig",secondName,"Wrong name displayed!");

        //7. Clear the text field
        pages.getAccentFoldingPage().clearDeveloperInput();

        // 8. Enter "jö" in the text field
        pages.getAccentFoldingPage().enterDeveloperInput("jö");

        //9. Verify that only jörn seen in developer suggestion menu
        boolean isDisplayed1 = pages.getAccentFoldingPage().getSuggestionMenuDisplayed();
        Assertions.assertTrue(isDisplayed1,"true");

        int sizeOfMenu = pages.getAccentFoldingPage().getSuggestionMenu().size();
        Assertions.assertEquals(2,sizeOfMenu);
    }
}
