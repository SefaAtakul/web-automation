package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Synchronus_Resize_Page extends BasePage {
    @FindBy(id = "resizable-synchr-resize")
    private WebElement firstResizeableElement;
    @FindBy(css = "#resizable-synchr-resize > .ui-icon-gripsmall-diagonal-se")
    private WebElement handleOfFirsElement;
    @FindBy(id = "also-synchr-resize")
    private WebElement secondResizableElement;

    public void resizeTheFirstElement(int xOffset,int yOffset){
        actions.clickAndHold(handleOfFirsElement).moveByOffset(xOffset,yOffset).release().build().perform();
    }
    public int getWidthOfSecondElement(){
        return secondResizableElement.getSize().getWidth();
    }
    public int getHeightOfSecondElement(){
        return secondResizableElement.getSize().getHeight();
    }
}
