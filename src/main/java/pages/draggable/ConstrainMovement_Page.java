package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement_Page extends BasePage {

@FindBy(id = "draggable5")
private WebElement fifthDraggableElement;
@FindBy(id = "draggable6")
private WebElement sixthDraggableElement;
@FindBy(id = "draggable7")
private WebElement seventhDraggableElement;
@FindBy(id = "containment-wrapper")
private WebElement containmentWrapperElement;
@FindBy(id = "draggable8")
private WebElement eigthDraggableElement;
@FindBy(xpath = "//div[@class='1']")
private WebElement eightElementsSurroundBox;

public void dragFifthDraggableElementByYOffset(int xOffset){
    actions.dragAndDropBy(fifthDraggableElement,xOffset,0).perform();
}
public void dragSixthDraggableElementByXOffset(int yOffset){
    actions.dragAndDropBy(sixthDraggableElement,0,yOffset).perform();
}
public void dragSeventhDraggableElemntByXAndYOffset(int xOffset,int yOffset){
    actions.dragAndDropBy(seventhDraggableElement,xOffset,yOffset).perform();
}
public void drageighthDraggableElemntByXAndYOffset(int xOffset,int yOffset){
    actions.dragAndDropBy(eigthDraggableElement,xOffset,yOffset).perform();
}

    public int getLocationOfFifththDraggableElement(){
        return fifthDraggableElement.getLocation().getX();
}
    public int getLocationOfSixthDraggableElement(){
    return sixthDraggableElement.getLocation().getY();
}
    public int getLocationOfSeventhDraggableElement(){
        return seventhDraggableElement.getLocation().getY();
}
    public int getLocationOfEigthDraggableElement(){
        return eigthDraggableElement.getLocation().getY();
    }


    public int getXOfBigBoxElement(){
        return containmentWrapperElement.getLocation().getX();
    }
    public int getXOfSmallBoxElement(){
        return eightElementsSurroundBox.getLocation().getX();
    }



}
