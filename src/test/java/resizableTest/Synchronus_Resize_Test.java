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
 * 5.Drag the resize handle to resize the first resizable element
 *6.Get the final width and height of secondResizeable element
 * Verify that the second ResizableElement resize Synchronusly
 */

public class Synchronus_Resize_Test extends Hooks {
    Pages pages = new Pages();
    @Test
    void testSynchronusResize(){
        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();
        //3.Click on the default functionality button
        pages.getWebAutomationPage().clickOnSynchronusResizeLink();
       //  4.Get the initial sizes of second resizeable element
        int width = pages.getSynchronusResizePage().getWidthOfSecondElement();
        int height = pages.getSynchronusResizePage().getHeightOfSecondElement();
        //5.Drag the resize handle to resize the first resizable element
        pages.getSynchronusResizePage().resizeTheFirstElement(100,100);
        BrowserUtils.wait(2.0);
        //6.Get the final width and height of secondResizeable element
        int finalWidth = pages.getSynchronusResizePage().getWidthOfSecondElement();
        int finalHeight = pages.getSynchronusResizePage().getHeightOfSecondElement();
        //Verify that the second ResizableElement resize Synchronusly
        Assertions.assertThat(finalWidth).as("The final size have to be bigger than initial! ").isGreaterThan(width);
        Assertions.assertThat(finalHeight).as("The final size have to be bigger than initial! ").isGreaterThan(height);
    }
}
