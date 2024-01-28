package checkBoxRadioTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 * Navigate to the ProductSelector page
 * Select the brand as "Brand 2"
 * Select the shape as "Square"
 * Click all style options
 * Asset that the object reflects all the features that we select
 */


public class CheckBox_ProductSelector_Test extends Hooks {
    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testProductSelector(){

        //Navigate to the ProductSelector page
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnCheckBoxRadioLink();
        pages.getWebAutomationPage().clickOnProductSelector();

        //Select the brand as "Brand 2"
        pages.getProductSelectorPage().selectTheBrand("Brand 2");
        BrowserUtils.wait(1.0);

        //Select the shape as "Square"
        pages.getProductSelectorPage().selectTheShape("Square");
        BrowserUtils.wait(1.0);
        BrowserUtils.scrollDownWithPageDown();

        //Click all style options
        pages.getProductSelectorPage().selectTheStyle("Shadow");
        pages.getProductSelectorPage().selectTheStyle("border");
        pages.getProductSelectorPage().selectTheStyle("background color");

        //Asset that the object reflects all the features that we select
        Assertions.assertTrue(pages.getProductSelectorPage().isBrandCorrect("Brand 2"));
        Assertions.assertTrue(pages.getProductSelectorPage().isShapeCorrect("square"));
        Assertions.assertTrue(pages.getProductSelectorPage().isShadowSigned());
        Assertions.assertTrue(pages.getProductSelectorPage().isBorderSigned());
        Assertions.assertTrue(pages.getProductSelectorPage().isBackgroundSigned());
    }
}
