package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Droppable_Revert_Draggable_Position_Page extends BasePage {
@FindBy(xpath = "//div[@id='draggable-revert-draggable']")
private WebElement firstDraggableElement;
@FindBy(xpath = "//div[@id='draggable2-revert-draggable']")
private WebElement secondDraggableElement;
@FindBy(id = "droppable-revert-draggable")
private WebElement droppableElement;
    public void dragAndDropFirstElement(){
        actions.clickAndHold(firstDraggableElement).moveToElement(droppableElement).release().build().perform();
    }
    public void  dragAndDropSecondElement(){
        actions.clickAndHold(secondDraggableElement).moveToElement(droppableElement).release().build().perform();
    }
    public String getTextOfDroppableElement(){
        return droppableElement.getText();
    }
    public void setOffFirstDraggable(int xOffset , int yOffset){
        actions.dragAndDropBy(firstDraggableElement,xOffset,yOffset);
    }
    public void setOffSecondDraggable(int xOffset, int yOffset){
        actions.dragAndDropBy(secondDraggableElement,xOffset,yOffset);
    }
    public int getTheLocacionOfFirstDraggablesX(){
        return firstDraggableElement.getLocation().getX();
    }
    public int getTheLocacionOfFirstDraggablesY(){
        return firstDraggableElement.getLocation().getY();
    }
    public int getTheLocationOfSecondDraggablesX(){
        return secondDraggableElement.getLocation().getX();
    }
    public int getTheLocationOfSecondDraggablesY(){
        return secondDraggableElement.getLocation().getY();
    }




}
