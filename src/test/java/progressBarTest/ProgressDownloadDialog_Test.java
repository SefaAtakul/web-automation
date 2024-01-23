package progressBarTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 *1.Open the WebAutomationPage
 *2.Navigate to ProgressBar link
 * 3.Navigate to DownloadDialogBar
 * 4.Click to StartDownloadButton
 * 5.verify that the download bar opened
 * 6.click to the cancell bar

 */

public class ProgressDownloadDialog_Test extends Hooks {
Pages pages = new Pages();

@Test
    public void testDownloadDialog(){
    //1.Open the WebAutomationPage
    pages.getHomePage().clickOnWebAutomationLink();

    //2.Navigate to ProgressBar link
    BrowserUtils.scrollDownWithPageDown();
    pages.getWebAutomationPage().clickOnProgressBarLink();

    //3.Navigate to DownloadDialogBar
    BrowserUtils.scrollUpWithPageUp();
    pages.getWebAutomationPage().clickOnDownloadDialogLink();

    //4.Click to StartDownloadButton
    pages.getDownloadDialogPage().clickOnStartDownloadButton();

    //5.verify that the download bar opened
   boolean header =  pages.getDownloadDialogPage().getTextOfHeaderDownload();
    Assertions.assertTrue(header);

    //6.click to the cancell bar
    pages.getDownloadDialogPage().clickOnCancelButton();
    BrowserUtils.wait(2.0);
    String cancel = pages.getDownloadDialogPage().getTheCancelText();
    Assertions.assertEquals(cancel,"Cancel Download");
}
}
