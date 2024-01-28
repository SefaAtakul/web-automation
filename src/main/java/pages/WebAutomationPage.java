package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.progressBar.DownloadDialog_Page;

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
    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingKink;
    @FindBy(linkText = "Menu")
    private WebElement menuLink;
    @FindBy(linkText = "Icons")
    private WebElement iconsLink;

    @FindBy(linkText = "Progress Bar")
    private WebElement progressBarLink;

    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialogLink;

    @FindBy(linkText = "Datepicker")
    private WebElement datePickerLink;

    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonthsLink;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;

    @FindBy(linkText = "Control Group")
    private WebElement controlGroupLink;

    @FindBy(linkText = "Toolbar")
    private WebElement toolBarLink;

    @FindBy(linkText = "Dialog")
    private WebElement dialogLink;

    @FindBy(linkText = "Modal Form")
    private WebElement modalFormLink;

    @FindBy(linkText = "Slider")
    private WebElement sliderLink;

    @FindBy(linkText = "Snap to increments")
    private WebElement snapToIncrementLink;

    @FindBy(linkText = "Spinner")
    private WebElement spinnerLink;

    @FindBy(linkText = "Spinner Overflow")
    private WebElement spinnerOverflowLink;

    @FindBy(linkText = "Sortable")
    private WebElement sortableLink;

    @FindBy(linkText = "Display as Grid")
    private WebElement displayAsGridLink;

    @FindBy(linkText = "Include / exclude items")
    private WebElement includeExcludeItemsLink;


    @FindBy(linkText = "Accordion")
    private WebElement accordionLink;

    @FindBy(linkText = "Collapse Content")
    private WebElement collapseContentLink;

    @FindBy(linkText = "Button")
    private WebElement buttonLink;

    @FindBy(linkText = "With Icon")
    private WebElement withIconLink;

    @FindBy(linkText = "Checkbox Radio")
    private WebElement checkBoxRadioLink;

    @FindBy(linkText = "Product Selector")
    private WebElement productSelectorLink;


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

    public void clickOnResizableLink() {resizableLink.click();}

    public void clickOnResizableDefaultFuncLink() {defaultFunctionalityLink.click();}

    public void clickOnSelectableLink() {selectableLink.click();}

    public void clickOnSerialize() {serializeLink.click();}

    public void clickOnTextareaLink() {textArea.click();}

    public void clickOnDefaultFunctionality() {defaultFunctionalityLink.click();}

    public void clickOnIframeLink() {iframeLink.click();}

    public void clickOnNormalIframe() {normalIframeLink.click();}

    public void clickOnNestedIframe() {nestedIframeLink.click();}

    public void clickOnAlertsLink() {alertsLink.click();}

    public void clickOnAnimateLink() {animateLink.click();}

    public void clickOnAutoCompleteLink() {autoCompleteLink.click();}

    public void clickOnMultipleAndRemoteLink() {multipleAndRemoteLink.click();}

    public void clickOnAccentFoldingLink(){accentFoldingKink.click();}

    public void clickOnConstrainMovementLink() {constrainMovementLink.click();}

    public void clickOnHandlesLink() {handlesLink.click();}

    public void clickOnAcceptLink() {acceptLink.click();}

    public void clickOnRevertDraggablePositionLink() {revertDraggablePositionLink.click();}

    public void clickOnSynchronusResizeLink() {synchronusResizeLink.click();}

    public void clickOnMenuLink(){menuLink.click();}

    public void clickOnIconsLink(){iconsLink.click();}

    public void clickOnProgressBarLink(){progressBarLink.click();}

    public void clickOnDownloadDialogLink(){downloadDialogLink.click();}

    public void clickOnDatePickerLink(){datePickerLink.click();}

    public void clickOnDisplayMultipleMonthsLink(){displayMultipleMonthsLink.click();}

    public void clickOnSelectDateRangeLink(){selectDateRangeLink.click();}

    public void clickOnToolBarLink(){toolBarLink.click();}

    public void clickOnControlGroupLink(){controlGroupLink.click();}

    public void clickOnDialogLink(){dialogLink.click();}

    public void clickOnModalFormLink(){modalFormLink.click();}

    public void clickOnSliderLink(){sliderLink.click();}

    public void clickOnSnapToIncrementLink(){snapToIncrementLink.click();}

    public void clickOnSpinnerLink(){spinnerLink.click();}

    public void  clickOnSpinnerOverflowLink(){spinnerOverflowLink.click();}

    public void clickOnSortableLink(){sortableLink.click();}

    public void clickOnDisplayAsGridLink(){displayAsGridLink.click();}

    public void clickOnIcludeExcludeItemsLink(){includeExcludeItemsLink.click();}

    public void clickOnAccordionLink(){accordionLink.click();}

    public void clickOnCollapseContentLink(){collapseContentLink.click();}

    public void clickOnButtonLink(){buttonLink.click();}

    public void clickOnWithIconLink(){withIconLink.click();}

    public void clickOnCheckBoxRadioLink(){checkBoxRadioLink.click();}

    public void clickOnProductSelector(){productSelectorLink.click();}
}
