package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

/**
 * 1. Land on home page and Click on webautomation link
 * 2. ScrollDown and Click on IFrame button
 * 3.Click on normal Iframe Page
 * 4.Verify that the header text "Inar academy" in iframe
 */

public class NormalIframe_Test extends Hooks {
    @Test
    void testNormalIframe() {
        //1. Land on home page and Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        //2.ScrollDown and Click on IFrame button and ScrollUp
        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1000);
        pages.getWebAutomationPage().clickOnIframeLink();
        BrowserUtils.scrollUpWithPageUp();

        //3.Click on normal Iframe Page
        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1000);
        pages.getWebAutomationPage().clickOnNormalIframe();

        //4.Verify that the header text "Inar academy" in iframe
        String expectedHeader = "Inar academy";
        String actualHeader = pages.getNormalIframePage().getHeaderOfIFrame();
        Assertions.assertEquals(expectedHeader,actualHeader,"The header is different from Inar academy");
    }
}
