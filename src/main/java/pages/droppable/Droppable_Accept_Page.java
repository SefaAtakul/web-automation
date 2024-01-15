package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Droppable_Accept_Page extends BasePage {
    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement firstDraggableElement;
    @FindBy(id = "draggable-accept")
    private WebElement secondDraggableElement;
    @FindBy(id = "droppable-accept")
    private WebElement droppableElement;

    public void dragAndDropFirstElement(){
      actions.clickAndHold(firstDraggableElement).moveToElement(droppableElement).release().build().perform();
    }
    public void  dragAndDropSecondElement(){
        actions.clickAndHold(secondDraggableElement).moveToElement(droppableElement).release().build().perform();
    }
    public String getDroppableElementText(){
        return droppableElement.getText();
    }
    public int getLocationOfFirstDraggableX(){
        return firstDraggableElement.getLocation().getX();
    }
    public int getLocationOfFirstDraggableY(){
        return firstDraggableElement.getLocation().getY();
    }
    public int getLocationOfSecondDraggableX(){
        return secondDraggableElement.getLocation().getX();
    }
    public int getLocationOfSecondDraggableY(){
        return secondDraggableElement.getLocation().getY();
    }
    public int getLocationOfDroppableX(){
        return droppableElement.getLocation().getX();
    }
    public int getLocationOfDroppableY(){
        return droppableElement.getLocation().getY();
    }


}
