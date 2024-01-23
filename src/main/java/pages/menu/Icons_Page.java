package pages.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class Icons_Page extends BasePage {

    @FindBy(xpath = "//ul[@id='menu-w-icons']//li")
    private List<WebElement> menuIconsList;

    @FindBy(id = "ui-id-77")
    private WebElement prevIcon;

    @FindBy(id = "ui-id-78")
    private WebElement stopIcon;

    @FindBy(id = "ui-id-79")
    private WebElement playIcon;

    @FindBy(id = "ui-id-80")
    private WebElement nextIcon;

    public Icons_Page() {
        super();
    }

    public boolean hoverOnIcon(String str){
        int index = switch (str) {
            case "Save" -> 0;
            case "Zoom In" -> 1;
            case "Zoom Out" -> 2;
            case "Print" -> 3;
            case "Playback" -> 4;
            case "Learn more about this menu" -> 5;
            default -> -1;
        };
        actions.moveToElement(menuIconsList.get(index)).perform();
        BrowserUtils.wait(0.5);
        return menuIconsList.get(index).getAttribute("class").equalsIgnoreCase("ui-menu-item");
    }

    public boolean isSelectable(String element) {
        actions.moveToElement(menuIconsList.get(4)).click().build().perform();
        BrowserUtils.wait(2);

        if (element.equalsIgnoreCase("Play")) {
            actions.moveToElement(playIcon).perform();
            return playIcon.getAttribute("class").equalsIgnoreCase("ui-menu-item-wrapper ui-state-active");

        } else if (element.equalsIgnoreCase("Prev")) {
            actions.moveToElement(prevIcon).perform();
            return prevIcon.getAttribute("class").equalsIgnoreCase("ui-menu-item-wrapper ui-state-active");

        } else if (element.equalsIgnoreCase("Stop")) {
            actions.moveToElement(stopIcon).perform();
            return stopIcon.getAttribute("class").equalsIgnoreCase("ui-menu-item-wrapper ui-state-active");

        } else if (element.equalsIgnoreCase("Next")) {
            actions.moveToElement(nextIcon).perform();
            return nextIcon.getAttribute("class").equalsIgnoreCase("ui-menu-item-wrapper ui-state-active");
        }
        return false;
    }

}