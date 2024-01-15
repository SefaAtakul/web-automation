package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;
/**
 * 1. Open the browser and navigate to the page
 * 2. click on the droppable button
 * 3. click on the default functionality button
 * 4.Get the text of Droppable element
 * 5.Drag and drop the first draggable element to droppable element
 * 6. check the text of droppable element
 * 7.Verifey that the text did not change
 * 8.Drag and drop the secondDraggable element to droppable element
 * 9.Get the text of droppable element
 *
 */

public class Droppable_Accept_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    void testAcceptDroppable(){
       // 1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();
        //3. click on the AcceptLink button
        pages.getWebAutomationPage().clickOnAcceptLink();
        //4.Get the text of Droppable element
        String text1 = pages.getDroppableAcceptPage().getDroppableElementText();
        //5.Drag and drop the first draggable element to droppable element
        pages.getDroppableAcceptPage().dragAndDropFirstElement();
        //6. check the text of droppable element
        String text2 = pages.getDroppableAcceptPage().getDroppableElementText();
        //7.Verifey that the text did not change
        Assertions.assertThat(text1).isEqualTo(text2);
        //8.Drag and drop the secondDraggable element to droppable element
        pages.getDroppableAcceptPage().dragAndDropSecondElement();
        //9.Get the text of droppable element
        String text3 = pages.getDroppableAcceptPage().getDroppableElementText();
        //10.Verify tha the text cahnaged
        String textExpected = "Dropped!";
        Assertions.assertThat(textExpected).as("Text is changed!").isEqualTo(text3);
    }

}
