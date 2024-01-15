package draggableTests;

import BaseTest.Hooks;
import dev.failsafe.internal.util.Assert;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the draggable button
 * 3. click on the auto ConstructMovement button.
 * 4. Drag the fifth draggable element by 215 pixels to the right
 * 5. Drag the sixth draggable element by -215 pixels to the left
 * 6, Drag the seventh draggable element by 215 pixels on xOffset andYOffset
 * 7. Drag the eight draggable element by 215 pixels on xOffset andYOffset
 * 8. Verify that the four elements locations are unchanged.
 */
public class Draggable_ConstrainMovement_Test extends Hooks {
    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    void testConstrainMovement(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
       // 2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();
        //3. click on the auto ConstructMovement button.
        pages.getWebAutomationPage().clickOnConstrainMovementLink();

        // Get the first positions X Location's of Elements
        int x5FirstLocat = pages.getConstrainMovementPage().getLocationOfFifththDraggableElement();
        int x6FirstLocat = pages.getConstrainMovementPage().getLocationOfSixthDraggableElement();
        int x7FirstLocat = pages.getConstrainMovementPage().getLocationOfSeventhDraggableElement();
        int x8FirstLocat = pages.getConstrainMovementPage().getLocationOfEigthDraggableElement();

        //4. Drag the fifth draggable element by 215 pixels to the right
        pages.getConstrainMovementPage().dragFifthDraggableElementByYOffset(215);
        //5. Drag the sixth draggable element by -215 pixels to the left
        pages.getConstrainMovementPage().dragSixthDraggableElementByXOffset(20);
        //6, Drag the seventh draggable element by 215 pixels on xOffset andYOffset
        pages.getConstrainMovementPage().dragSeventhDraggableElemntByXAndYOffset(-215,-215);
        //7. Drag the eight draggable element by 215 pixels on xOffset andYOffset
        pages.getConstrainMovementPage().drageighthDraggableElemntByXAndYOffset(-215,-215);

        //8. Verify that the four elements locations are unchanged.
        int x5FinalLocat = pages.getConstrainMovementPage().getLocationOfFifththDraggableElement();
        int x6FinalLocat = pages.getConstrainMovementPage().getLocationOfSixthDraggableElement();
        int x7FinalLocat = pages.getConstrainMovementPage().getLocationOfSeventhDraggableElement();
        int x8FinalLocat = pages.getConstrainMovementPage().getLocationOfEigthDraggableElement();
        //Verification of first and second steps
       Assertions.assertThat(x5FinalLocat).as("Draggable element cannot move horizontally!").isEqualTo(x5FirstLocat);
       Assertions.assertThat(x6FinalLocat).as("Draggable element cannot move vertically!").isEqualTo(x6FirstLocat);

       //Verification of third step
       Assertions.assertThat(x7FinalLocat).as("Draggable element cannot move out of bigBox!").isEqualTo(x7FirstLocat);
       int xOfBigBox = pages.getConstrainMovementPage().getXOfBigBoxElement();
       Assertions.assertThat(x7FinalLocat).isGreaterThan(xOfBigBox);

       //Verification of fourth step
       Assertions.assertThat(x8FinalLocat).as("Draggable element cannot move out of smallBox").isEqualTo(x8FirstLocat);
        int xOfSmallSurroundBox = pages.getConstrainMovementPage().getXOfSmallBoxElement();
        Assertions.assertThat(x8FinalLocat).isGreaterThan(xOfSmallSurroundBox);

        softAssertions.assertAll();

    }

}
