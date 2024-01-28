package buttonTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

public class Button_WithIcon_Test extends Hooks {
    Pages pages = new Pages();
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testWithIcon(){
        //Navigate to the withIconPage
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnButtonLink();
        pages.getWebAutomationPage().clickOnWithIconLink();

        //Try to click the Elements in widgetPart and take Exception ıf there is a nonclickableElement
        pages.getWithIconPage().clickAllWidgetElements();

        //Try to click the Elements in cssPart and take Exception ıf there is a nonclickableElement
        pages.getWithIconPage().clickAllCssElements();
    }
}
