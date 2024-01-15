package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;
    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;
    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;
    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;
    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;
    @FindBy(linkText = "Accept")
    private WebElement acceptLink;
    @FindBy(linkText = "Handles")
    private WebElement handlesLink;
    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;
    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;
    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;
    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;
    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;
    @FindBy(linkText = "Textarea")
    private WebElement textArea;
    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;
    @FindBy(linkText = "Iframe")
    private WebElement normalIframeLink;
    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;
    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;
    @FindBy(linkText = "Animate")
    private WebElement animateLink;
    @FindBy(linkText = "Autocomplete")
    private WebElement autoCompleteLink;
    @FindBy(linkText = "Multiple & Remote")
    private WebElement multipleAndRemoteLink;


    public void clickOnDraggableLink() {
        draggableLink.click();
    }
    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }
    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }
    public void clickOnDroppableLink() {
        droppableLink.click();
    }
    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }
    public void clickOnResizableLink(){
        resizableLink.click();
    }
    public void clickOnResizableDefaultFuncLink(){
        defaultFunctionalityLink.click();
    }
    public void clickOnSelectableLink(){
        selectableLink.click();
    }
    public void clickOnSerialize(){serializeLink.click();}
    public void clickOnTextareaLink(){textArea.click();}
    public void clickOnDefaultFunctionality(){
        defaultFunctionalityLink.click();
    }
    public void clickOnIframeLink(){
        iframeLink.click();
    }
    public void clickOnNormalIframe(){normalIframeLink.click();}
    public void clickOnNestedIframe(){
        nestedIframeLink.click();
    }
    public void clickOnAlertsLink(){
        alertsLink.click();
    }
    public void clickOnAnimateLink(){
        animateLink.click();
    }
    public void clickOnAutoCompleteLink(){
        autoCompleteLink.click();
    }
    public void clickOnMultipleAndRemoteLink(){
        multipleAndRemoteLink.click();
    }
    public void clickOnConstrainMovementLink(){constrainMovementLink.click();}
    public void clickOnHandlesLink(){handlesLink.click();}
    public void clickOnAcceptLink(){acceptLink.click();}
    public void clickOnRevertDraggablePositionLink(){revertDraggablePositionLink.click();}
    public void clickOnSynchronusResizeLink(){synchronusResizeLink.click();}
}
