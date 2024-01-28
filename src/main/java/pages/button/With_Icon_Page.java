package pages.button;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class With_Icon_Page extends BasePage {
    @FindBy(xpath = "//div/button[contains(@class,'m-2 ')]")
    private List<WebElement> widgetElements;

    @FindBy(xpath = "//div/button[contains(@class,'ui-corner-all m-2')]")
    private List<WebElement> cssElements;

    public void clickAllWidgetElements() throws ElementClickInterceptedException {
        try {
            for (int i = 0; i < widgetElements.size(); i++) {
                wait.until(ExpectedConditions.elementToBeClickable(widgetElements.get(i)));
                actions.click(widgetElements.get(i)).perform();
                BrowserUtils.wait(0.5);
            }
        }catch (ElementClickInterceptedException e){
            System.out.println("We can not click the element");
        }

    }

    public void clickAllCssElements() throws ElementClickInterceptedException{
        try {
            for (int i = 0; i < cssElements.size(); i++) {
                wait.until(ExpectedConditions.elementToBeClickable(cssElements.get(i)));
                actions.click(cssElements.get(i)).perform();
                BrowserUtils.wait(0.5);
            }
        }catch (ElementClickInterceptedException e){
             System.out.println("We can not click the element");
        }

    }
}
