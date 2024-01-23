package controlGroupTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 * Navigate to the ToolBarLink
 * Change zoom option as 150
 * Select Yellow as Heiglight
 * Select Yellow as Heiglight
 * Verify that whether selected highlight option is matched
 * Select black as colour and Verify that whether selected color option is matched
 * Clear and chage the textField
 * Verify that whether selected bold option
 * Click to the ıtalick button and verfy that the button works properly
 * Click the underscore button and verify that Button works Properly
 * Verify that whether print option functions properly
 *
 */

public class ControlGroup_ToolBar_Test extends Hooks {
    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();
    @Test
    public void testToolBar(){

        //Navigate to the ToolBarLink
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnControlGroupLink();
        pages.getWebAutomationPage().clickOnToolBarLink();

        //Change zoom option as 150
        pages.getToolBarPage().selectZoom("150");
        BrowserUtils.wait(1.0);

        //Select Yellow as Heiglight
        pages.getToolBarPage().selectHeigleight("Yellow");
        BrowserUtils.wait(1.0);

        // Verify that whether selected highlight option is matched
        boolean isHighLightMatch = pages.getToolBarPage().isHighLightOptionMatch("Yellow");
        softAssertions.assertThat(isHighLightMatch).as("Expected result for highlight option is Orange but actual result is different").isTrue();

        //Select black as colour
        pages.getToolBarPage().selectColour("Black");
        BrowserUtils.wait(1.0);

        // Verify that whether selected color option is matched
        boolean isColorMatch = pages.getToolBarPage().isColorOptionMatch("Black");
        softAssertions.assertThat(isColorMatch).as("Expected result for color option is Purple but actual result is different").isTrue();

        //Clear and chage the textField
        pages.getToolBarPage().sendText("That is the new version testing!");

        // Verify that whether selected bold option
        pages.getToolBarPage().clickOnBButton();
        boolean isBOptionActive = pages.getToolBarPage().isBOptionActive();
        softAssertions.assertThat(isBOptionActive).as("Expected result for bold option is active but actual result is not").isTrue();

        //Click to the ıtalick button and verfy that the button works properly
        pages.getToolBarPage().clickOnIButton();
        boolean isIOptionActive = pages.getToolBarPage().isIOptionActive();
        softAssertions.assertThat(isIOptionActive).as("Expected result for italic option is active but actual result is not").isTrue();

        //Click the underscore button and verify that Button works Properly
        pages.getToolBarPage().clickOnUButton();
        boolean isUOptionActive = pages.getToolBarPage().isUOptionActive();
        softAssertions.assertThat(isUOptionActive).as("Expected result for underline option is active but actual result is not").isTrue();


        // Verify that whether print option functions properly
        boolean isPrintOptionActive = pages.getToolBarPage().isPrintOptionActive();
        softAssertions.assertThat(isPrintOptionActive).as("Expected result for print option is active but actual result is not").isTrue();

    }
}
