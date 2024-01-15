package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;
/**
 * 1. Open the browser and navigate to the page
 * 2. click on the draggable button
 * 3. click on the auto scrolling button
 * 4.Get the current Locations of X and Y for FirstDraggable
 * 5. Drag the first draggable element by handling outsiderBox
 * 7.GetTheCurrent Locations of X and y for firstDraggable
 * 8.Verify that int sixth step the location didn't change
 * 9.Drag the first draggable element by handling insider
 * 10.Get theCurrent Locations
 * 11.Verify that the first draggable element changed places
 * 12.Get the initial position of second draggable
 * 13.Drag the daraggable element by using outSİderBox
 * 14.Verify that the draggable element moved
 * 15.Drag the draggable element by using insiderBox
 * Verify that the secondDraggable did not move
 */

public class Handles_Test extends Hooks {
    Pages pages = new Pages();
    @Test
    void testHandles(){
        // 1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        // 2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();
        // 3. click on the auto Handles button
        pages.getWebAutomationPage().clickOnHandlesLink();

        //4.Get the current Locations of X and Y for FirstDraggable
        int x1 = pages.getHandlesPage().getXLocationOfFirstDraggableElement();
        int y1 = pages.getHandlesPage().getYLocationOfFirstDraggableElement();

        //5. Drag the first draggable element by handling outsiderBox
        pages.getHandlesPage().dragTheFirstDraggableElementByOutSideBox(25,25);

        //7.GetTheCurrent Locations of X and y for firstDraggable
        int x2 = pages.getHandlesPage().getXLocationOfFirstDraggableElement();
        int y2 = pages.getHandlesPage().getYLocationOfFirstDraggableElement();

        //8.Verify that int sixth step the location didn't change
        Assertions.assertThat(x1).isEqualTo(x2);
        Assertions.assertThat(y1).isEqualTo(y2);

        //9.Drag the first draggable element by handling insider
        pages.getHandlesPage().dragTheFirstDraggableElementByInsiderBox(25,25);

        //10.Get theCurrent Locations
        int x3 = pages.getHandlesPage().getXLocationOfFirstDraggableElement();
        int y3 = pages.getHandlesPage().getYLocationOfFirstDraggableElement();

        //11.Verify that the first draggable element changed places
        Assertions.assertThat(x3).as("Changed place!").isGreaterThan(x2);
        Assertions.assertThat(y3).as("Place changed!").isGreaterThan(y2);

        //12.Get the initial position of second draggable
        int sx1 = pages.getHandlesPage().getXLocationOfSecondDraggableElement();
        int sy1 = pages.getHandlesPage().getYLocationOfSecondDraggableElement();

        //13.Drag the daraggable element by using outSİderBox
        pages.getHandlesPage().dragTheSecondDraggableElementByOutSideBox(25,25);

        //14.Get the current locations of second draggable
       int sx2 = pages.getHandlesPage().getXLocationOfSecondDraggableElement();
       int sy2 = pages.getHandlesPage().getYLocationOfSecondDraggableElement();

        //14.Verify that the draggable element moved
       Assertions.assertThat(sx2).as("Second draggable element moved").isGreaterThan(sx1);
       Assertions.assertThat(sy2).as("Second draggable element moved!").isGreaterThan(sy1);

       //15.Drag the draggable element by using insiderBox
        pages.getHandlesPage().dragTheFirstDraggableElementByInsiderBox(25,25);

        //Get the current Locations
        int sx3 = pages.getHandlesPage().getXLocationOfSecondDraggableElement();
        int sy3 = pages.getHandlesPage().getYLocationOfSecondDraggableElement();

        //Verify that the secondDraggable did not move
        Assertions.assertThat(sx3).isEqualTo(sx2);
        Assertions.assertThat(sy3).isEqualTo(sy2);


    }

}
