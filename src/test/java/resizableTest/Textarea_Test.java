package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;
/**
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the  button SynchronusResize
 * 4.Get the initial sizes of second resizeable element
 * 5.Drag the resize handle to resize the textAreaElement
 *6.Get the final location of resiZABLE ELEMENT
 *7.Verify that the resizzable element resized
 */

public class Textarea_Test extends Hooks {
    Pages pages = new Pages();
    @Test
    void testTesxtarea(){
    //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
    //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();
    //3.Click on the  button Textarea button
        pages.getWebAutomationPage().clickOnTextareaLink();
    // 4.Get the initial sizes of second resizeable element
        int width = pages.getTextareaPage().getWidthOfTextArea();
        int height = pages.getTextareaPage().getHeightOfTexArea();
    // 5.Drag the resize handle to resize the textAreaElement
        pages.getTextareaPage().resizeTheTextarea();
    // 6.Get the final location of resiZABLE ELEMENT
        int finalWidth = pages.getTextareaPage().getWidthOfTextArea();
        int finalHeight = pages.getTextareaPage().getHeightOfTexArea();
    // 7.Verify that the resizzable element resized
        Assertions.assertThat(finalWidth).as("Have to be bigger if it is resized!").isGreaterThan(width);
        Assertions.assertThat(finalHeight).as("Have to be bigger if it is resized!").isGreaterThan(height);
    }
}
