package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;
/**
 * 1. Open the browser and navigate to the page
 * 2. click on the droppable button
 * 3. click on the Revert draggable button
 *
 *
 *
 *
 */

public class Droppable_Revert_Draggable_Test extends Hooks {
    Pages pages = new Pages();
    @Test
    void Droppable_Revert_Draggable_Test(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();
        //3. click on the Revert draggable button
        pages.getWebAutomationPage().clickOnRevertDraggablePositionLink();
        //4.get The initial Locations of firstDraggable
        int firstDraggablesX = pages.getDroppableRevertDraggablePositionPage().getTheLocacionOfFirstDraggablesX();
        int firstDraggablesY = pages.getDroppableRevertDraggablePositionPage().getTheLocacionOfFirstDraggablesY();
        //Get the text of droppable element
        String text1 = pages.getDroppableRevertDraggablePositionPage().getTextOfDroppableElement();
        //5.Drag and Drop the firtElement to droppable element
        pages.getDroppableRevertDraggablePositionPage().dragAndDropFirstElement();
        BrowserUtils.wait(2.0);
        //6.Verifey that the textOf droppable changed and firstElement did not change the place
        int firstDraggableX2 = pages.getDroppableRevertDraggablePositionPage().getTheLocacionOfFirstDraggablesX();
        int firstDraggableY2 = pages.getDroppableRevertDraggablePositionPage().getTheLocacionOfFirstDraggablesY();
        String finalText = pages.getDroppableRevertDraggablePositionPage().getTextOfDroppableElement();
        Assertions.assertThat(firstDraggableX2).isEqualTo(firstDraggablesX);
        Assertions.assertThat(firstDraggableY2).isEqualTo(firstDraggablesY+1);//1 milimlik bir hata var o sebeple 1 ekledim
        Assertions.assertThat("Dropped!").isEqualTo(finalText);

        //7.Get initial location of secondDraggable
        int secondDraggableX = pages.getDroppableRevertDraggablePositionPage().getTheLocationOfSecondDraggablesX();
        int secondDraggableY = pages.getDroppableRevertDraggablePositionPage().getTheLocationOfSecondDraggablesY();
        //8.Drag and Drop the secondElement to droppable element
        pages.getDroppableRevertDraggablePositionPage().dragAndDropSecondElement();
        BrowserUtils.wait(2.0);
        //9.Verifey that the textOf droppable changed and secondElement did not change the place
        int secondDraggableX2 = pages.getDroppableRevertDraggablePositionPage().getTheLocationOfSecondDraggablesX();
        int secondDraggableY2 = pages.getDroppableRevertDraggablePositionPage().getTheLocationOfSecondDraggablesY();
        Assertions.assertThat(secondDraggableX2).as("The element did not revert back").isGreaterThan(secondDraggableX);
        Assertions.assertThat(secondDraggableY2).as("The element did not revert back").isGreaterThan(secondDraggableY);
    }
}
