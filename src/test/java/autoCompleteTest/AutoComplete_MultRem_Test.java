package autoCompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on web automation link
 * 3. click on the auto complete button
 * 4. click on the multiple and remote button
 * 5. Enter "s" in the text field
 * 6. Verify that the suggestion menu is not displayed
 * 7. Clear the text field
 * 8. Enter "sp" in the text field
 * 9. Verify that "Loading suggestions..." message is displayed
 * 10. Verify that the suggestion menu is displayed
 * 11.Verify that the suggestions in the menu starts with sp(suggestions can be more than one)
 */
public class AutoComplete_MultRem_Test extends Hooks {

    @Test
    void testMultipleAndRemoteAutoComplete(){
        //1. Open the browser and navigate to the home page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the auto complete button
        pages.getWebAutomationPage().clickOnAutoCompleteLink();

        //4. click on the multiple and remote button
        pages.getWebAutomationPage().clickOnMultipleAndRemoteLink();

        //5. Enter "s" in the text field
        pages.getMultipleAndRemotePage().enterMultipleRemoteInput("s");

        //6. Verify that the suggestion menu is not displayed
        Assertions.assertFalse(pages.getMultipleAndRemotePage().suggestionMenuIsDisplayed());

        //7. Clear the text field
        pages.getMultipleAndRemotePage().clearMultipleRemoteInput();

        //8. Enter "sp" in the text field
        pages.getMultipleAndRemotePage().enterMultipleRemoteInput("sp");

        //9. Verify that "Loading suggestions..." message is displayed
        String expectedMessage = "Loading suggestions...";
        String actualMessage = pages.getMultipleAndRemotePage().getSuggestionMessage();
        Assertions.assertEquals(expectedMessage, actualMessage, "Wrong Message !");

        //10. Verify that the suggestion menu is displayed
        Assertions.assertTrue(pages.getMultipleAndRemotePage().suggestionMenuIsDisplayed());

        //11.Verify that the suggestions in the menu starts with sp(suggestions can be more than one)
        String expectedSuggestion = "sp";
        Assertions.assertTrue(pages.getMultipleAndRemotePage().theElementsInTheMenuStartsWith(expectedSuggestion), "Wrong Suggestion !");
    }

}
