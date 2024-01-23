package menuTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

public class MenuIcons_Test extends Hooks {

    Pages pages =new Pages();
    @Test
    public void testIcons(){
        SoftAssertions softAssertions =new SoftAssertions();

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the draggable button
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnMenuLink();

        // Click on the Accept button
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnIconsLink();

        // Check the "Save" icon if selectable
        boolean isSelectable = pages.getMenuIconsPage().hoverOnIcon("Save");
        softAssertions.assertThat(isSelectable).as("Save should be selectable").isTrue();

        // Check the "Zoom In" icon if selectable
        isSelectable = pages.getMenuIconsPage().hoverOnIcon("Zoom In");
        softAssertions.assertThat(isSelectable).as("Zoom In should be selectable").isTrue();

        // Check the "Zoom Out" icon if selectable
        isSelectable = pages.getMenuIconsPage().hoverOnIcon("Zoom Out");
        softAssertions.assertThat(isSelectable).as("Zoom Out should be selectable").isTrue();

        // Check the "Print" icon if selectable
        isSelectable = pages.getMenuIconsPage().hoverOnIcon("Print");
        softAssertions.assertThat(isSelectable).as("Print should not be selectable").isFalse();

        // Check the "Playback" icon if selectable
        isSelectable = pages.getMenuIconsPage().hoverOnIcon("Playback");
        softAssertions.assertThat(isSelectable).as("Playback should be selectable").isTrue();

        // Check the "Learn more about this menu" icon if selectable
        isSelectable = pages.getMenuIconsPage().hoverOnIcon("Learn more about this menu");
        softAssertions.assertThat(isSelectable).as("\"Learn more about this menu\" should be selectable").isTrue();


        // Check the "Play" icon if selectable
        isSelectable = pages.getMenuIconsPage().isSelectable("Play");
        softAssertions.assertThat(isSelectable).as("Play should be selectable").isTrue();

        // Check the "Prev" icon if selectable
        isSelectable = pages.getMenuIconsPage().isSelectable("Prev");
        softAssertions.assertThat(isSelectable).as("Prev should be selectable").isTrue();

        // Check the "Stop" icon if selectable
        isSelectable = pages.getMenuIconsPage().isSelectable("Stop");
        softAssertions.assertThat(isSelectable).as("Stop should be selectable").isTrue();

        // Check the "Next" icon if selectable
        isSelectable = pages.getMenuIconsPage().isSelectable("Next");
        softAssertions.assertThat(isSelectable).as("Next should be selectable").isTrue();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}
