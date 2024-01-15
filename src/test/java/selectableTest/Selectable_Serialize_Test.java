package selectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the selectable button
 * 3. Click on the serialize button
 * 4.ClickOn item 5 and verify that the item 5 is selected
 * 5. Verify that "You've selected: #5" is displayed
 * 6 Click on Item 6 and Verify that Item 6 is selected
 *7. Verify that "You've selected: #6" is displayed
 * 8. Click on Item 1, Item 3 by holding down the Ctrl key
 * 9. Verify that Item 1, Item 3 are selected
 *  10. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
 *  11. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
 *  12. Verify that Item 1, Item 2, Item 3 are selected
 *  13. Verify that "You've selected: #1 #2 #3" is displayed
 */

public class Selectable_Serialize_Test extends Hooks {
    Pages pages = new Pages();
    @Test
    void testSerialize(){
        //1. Open the browser and navigate to the URL+
        pages.getHomePage().clickOnWebAutomationLink();
        //2. Click on Selectable button
        pages.getWebAutomationPage().clickOnSelectableLink();
        //3. Click on Serialize button
        pages.getWebAutomationPage().clickOnSerialize();
        //4.ClickOn item 5 and verify that the item 5 is selected
        pages.getSelectableSerializePage().clickItems(5);
        assertTrue(pages.getSelectableSerializePage().isSelected(5), "Not selected");
        //5. Verify that "You've selected: #5" is displayed
        String expectedResult = "You've selected: #5.";
        String actualResult = pages.getSelectableSerializePage().getText();
        assertEquals(expectedResult, actualResult, "Wrong Text!");

        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1.0);
        //6 Click on Item 6 and Verify that Item 6 is selected
        pages.getSelectableSerializePage().clickItems(6);
        assertTrue(pages.getSelectableSerializePage().isSelected(6), "Not selected");

        //7. Verify that "You've selected: #6" is displayed
        String expectedResult2 = "You've selected: #6.";
        String actualResult2 = pages.getSelectableSerializePage().getText();
        assertEquals(expectedResult2, actualResult2, "Wrong Text!");

        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1.0);

        //8. Click on Item 1, Item 3 by holding down the Ctrl key
        pages.getSelectableSerializePage().clickItemsWithCtrl(1, 3);

        //9. Verify that Item 1, Item 3 are selected
        assertTrue(pages.getSelectableSerializePage().isSelected(1), "Not selected");
        assertTrue(pages.getSelectableSerializePage().isSelected(3), "Not selected");

        // 10. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
        String expectedResult3 = "You've selected: #1 #3 #6.";
        String actualResult3 = pages.getSelectableSerializePage().getText();
        assertEquals(expectedResult3, actualResult3, "Wrong Text!");

        //11. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
        pages.getSelectableSerializePage().clickWithMouse(1, 2, 3);

        //12. Verify that Item 1, Item 2, Item 3 are selected
        assertTrue(pages.getSelectableSerializePage().isSelected(1), "Not selected");
        assertTrue(pages.getSelectableSerializePage().isSelected(2), "Not selected");
        assertTrue(pages.getSelectableSerializePage().isSelected(3), "Not selected");

        //13. Verify that "You've selected: #1 #2 #3" is displayed
        String expectedResult4 = "You've selected: #1 #2 #3.";
        String actualResult4 = pages.getSelectableSerializePage().getText();
        assertEquals(expectedResult4, actualResult4, "Wrong Text!");
    }
    }
