package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles_Page extends BasePage {
@FindBy(id = "draggable13")
private WebElement firstDraggableElement;

@FindBy(xpath = "//p[@class='ui-widget-header fs-5 p-3 ui-draggable-handle']")
private WebElement insiderOfFirstDraggable;

@FindBy(xpath = "//p[contains(text(),'You can drag me around…')]")
private WebElement secondDraggableElement;

@FindBy(id = "//p[@class='ui-widget-header']")
private WebElement insiderOfSecondDraggable;

public void dragTheFirstDraggableElementByOutSideBox(int xOffset,int  yOffset){
  actions.dragAndDropBy(firstDraggableElement,xOffset,yOffset);
}
public void dragTheFirstDraggableElementByInsiderBox(int xOffset,int yOffset){
    actions.dragAndDropBy(insiderOfFirstDraggable,xOffset,yOffset).perform();
}
public void dragTheSecondDraggableElementByOutSideBox(int xOffset,int yOffset){
    actions.dragAndDropBy(secondDraggableElement,xOffset,yOffset).perform();
}
public void dragTheSecondDraggableElementByInsiderBox(int xOffset,int yOffset){
    actions.dragAndDropBy(insiderOfSecondDraggable,xOffset,yOffset).perform();
}
public int getXLocationOfFirstDraggableElement(){
    return firstDraggableElement.getLocation().getX();
}
public int getYLocationOfFirstDraggableElement(){
    return firstDraggableElement.getLocation().getY();
}
public int getXLocationOfSecondDraggableElement(){
    return secondDraggableElement.getLocation().getX();
}
public int getYLocationOfSecondDraggableElement(){
        return secondDraggableElement.getLocation().getY();
    }

}
