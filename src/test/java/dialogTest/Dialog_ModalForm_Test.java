package dialogTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 * navigate to the ModelFormPage
 * ClickOn CreateAcount
 * Click and Send Keys to name surname and email buttons
 * click the submit button
 * verify that the Basic Dialog closed
 * Verify that the datas added to list
 */
public class Dialog_ModalForm_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    public void testModalForm(){

        //navigate to the ModelFormPage
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnDialogLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnModalFormLink();

        //ClickOn CreateAcount
        pages.getModalFormPage().cliclOnCreateAccountButton();

        //Click and Send Keys to name surname and email buttons
        pages.getModalFormPage().sendName("Kingo");
        pages.getModalFormPage().sendSurname("Martin");
        pages.getModalFormPage().senEmail("KingMartin@gmail.com");

        //click the submit button
        pages.getModalFormPage().clickOnSubmitButton();

        //verify that the Basic Dialog closed
        boolean actual = pages.getModalFormPage().isBasicDialogNotDisplaying();
        Assertions.assertFalse(actual);

        //Verify that the datas added to list
        boolean datas = pages.getModalFormPage().areUsersDataSubmittedCorrectly();
        Assertions.assertTrue(datas);
    }
}
