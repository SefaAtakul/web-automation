package acordionTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/**
 * Navigate to the CollapseContentPage
 * Click the firstElement and  Verify that first elements content is open
 * Click the secondElement and Verify that second elements content is open
 * Click the thirdElement and Verify that third elements content is open
 * Click the fourthElement and Verify that third elements content is open
 */

public class Accordion_CollapseContent_Test extends Hooks {

    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testCollapseContent(){
        //Navigate to the CollapseContentPage
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnAccordionLink();
        pages.getWebAutomationPage().clickOnCollapseContentLink();

        //Click the firstElement and  Verify that first elements content is open
        pages.getCollapseContentPage().clickOnElement(1);
        boolean isContentPaneOpen = pages.getCollapseContentPage().isContentPaneOpenFor("firstElement");
        softAssertions.assertThat(isContentPaneOpen).as("Since the firstElements content is open").isTrue();

        //Click the secondElement and Verify that second elements content is open
        pages.getCollapseContentPage().clickOnElement(2);
        isContentPaneOpen = pages.getCollapseContentPage().isContentPaneOpenFor("secondElement");
        softAssertions.assertThat(isContentPaneOpen).as("Since we click on the secondElement its content should be open").isTrue();

        //Click the thirdElement and Verify that third elements content is open
        pages.getCollapseContentPage().clickOnElement(3);
        isContentPaneOpen = pages.getCollapseContentPage().isContentPaneOpenFor("thirdElement");
        softAssertions.assertThat(isContentPaneOpen).as("Since we click on the secondElement its content should be open").isTrue();

        //Click the fourthElement and Verify that third elements content is open
        pages.getCollapseContentPage().clickOnElement(4);
        isContentPaneOpen = pages.getCollapseContentPage().isContentPaneOpenFor("fourthElement");
        softAssertions.assertThat(isContentPaneOpen).as("Since we click on the secondElement its content should be open").isTrue();
    }
}
