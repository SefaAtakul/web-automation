package pages.controlGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.lang.Integer.parseInt;

public class ToolBar_Page extends BasePage {
    @FindBy(xpath = "//select[@class='form-select me-2 bg-primary text-fifth fs-4']")
    private List<WebElement> firstThreeButton;

    @FindBy(xpath = "//button[text()='B']")
    private WebElement buttonB;

    @FindBy(xpath = "//button[text()='I']")
    private WebElement buttonI;

    @FindBy(xpath = "//button[text()='U']")
    private WebElement buttonU;

    @FindBy(xpath = "//button[text()='Print']")
    private WebElement buttonPrint;

    @FindBy(id = "page") // //div/h1[text()='Yazdır']
    private WebElement textArea;

    @FindBy(id = "page")
    private WebElement textField;

    public ToolBar_Page() {
        super();
    }

    public void clickOnBButton(){
        buttonB.click();
        BrowserUtils.wait(1.0);
    }
    public void clickOnIButton(){
        buttonI.click();
        BrowserUtils.wait(1.0);
    }
    public void clickOnUButton(){
        buttonU.click();
        BrowserUtils.wait(1.0);
    }
    public void clickOnPrintButton(){
        buttonPrint.click();
        BrowserUtils.wait(1.0);
    }

public void sendText(String message){
        textField.clear();
        textField.sendKeys(message);
}

    public void selectColour(String colourOption) {
        Select colour = new Select(firstThreeButton.get(2));
        firstThreeButton.get(2).click();
        switch (colourOption) {
            case "Black" -> colour.getOptions().get(1).click();
            case "White" -> colour.getOptions().get(2).click();
            case "Red" -> colour.getOptions().get(3).click();
            case "Yellow" -> colour.getOptions().get(4).click();
            case "Green" -> colour.getOptions().get(5).click();
            case "Blue" -> colour.getOptions().get(6).click();
            case "Gray" -> colour.getOptions().get(7).click();
            case "Purple" -> colour.getOptions().get(8).click();
            case "Orange" -> colour.getOptions().get(9).click();

        }
    }


    public void selectHeigleight(String colourOption){
        Select heiglight =new Select(firstThreeButton.get(1));
        firstThreeButton.get(1).click();
        switch (colourOption) {
            case "None" -> heiglight.getOptions().get(1).click();
            case "Red" -> heiglight.getOptions().get(2).click();
            case "Yellow" -> heiglight.getOptions().get(3).click();
            case "Green" -> heiglight.getOptions().get(4).click();
            case "Blue" -> heiglight.getOptions().get(5).click();
            case "Gray" -> heiglight.getOptions().get(6).click();
            case "Purple" -> heiglight.getOptions().get(7).click();
            case "Orange" -> heiglight.getOptions().get(8).click();
        }

    }



    public void selectZoom(String zoomOption){
        Select zoom =new Select(firstThreeButton.get(0));
        firstThreeButton.get(0).click();
        switch (zoomOption) {
            case "50" -> zoom.getOptions().get(1).click();
            case "75" -> zoom.getOptions().get(2).click();
            case "90" -> zoom.getOptions().get(3).click();
            case "100" -> zoom.getOptions().get(4).click();
            case "125" -> zoom.getOptions().get(5).click();
            case "150" -> zoom.getOptions().get(6).click();
            case "200" -> zoom.getOptions().get(7).click();
        }
    }

    private Map<String, String> storeCssValueForColor() {
        Map<String, String> colorCss = new HashMap<>();
        colorCss.put("Black", "rgba(33, 37, 41, 1)");
        colorCss.put("White", "rgba(255, 255, 255, 1)");
        colorCss.put("Red", "rgba(255, 0, 0, 1)");
        colorCss.put("Yellow", "rgba(255, 255, 0, 1)");
        colorCss.put("Green", "rgba(0, 128, 0, 1)");
        colorCss.put("Blue", "rgba(0, 0, 255, 1)");
        colorCss.put("Grey", "rgba(128, 128, 128, 1)");
        colorCss.put("Purple", "rgba(128, 0, 128, 1)");
        colorCss.put("Orange", "rgba(255, 165, 0, 1)");
        return colorCss;
    }
    public boolean isZoomOptionMatch(int zoom) { // if zoom option is selected as 200%, css value equals to 2
        String zoomOption = textArea.getCssValue("zoom");
        return parseInt(zoomOption) == (zoom / 100);
    }

    public boolean isColorOptionMatch(String color) { // each color has a value in that manner rgba(128, 128, 37, 1)
        Map<String, String> colorCssValue = storeCssValueForColor();
        String colorOption = textArea.getCssValue("color");
        return colorOption.equalsIgnoreCase(colorCssValue.get(color));
    }

    public boolean isHighLightOptionMatch(String color) {
        Map<String, String> colorCssValue = storeCssValueForColor();
        String highlightOption = textArea.getCssValue("background-color");
        return highlightOption.equalsIgnoreCase(colorCssValue.get(color));
    }

    public boolean isBOptionActive() { // bold option = 700 ; normal option = 400
        String boldOption = textArea.getCssValue("font-weight");
        return parseInt(boldOption) == 700;
    }

    public boolean isIOptionActive() { // italic option = italic ; normal option = normal
        String italicOption = textArea.getCssValue("font-style");
        return italicOption.equalsIgnoreCase("italic");
    }

    public boolean isUOptionActive() { // underline option = underline solid ... ; normal option = none solid ...
        String underlineOption = textArea.getCssValue("text-decoration");
        return underlineOption.startsWith("underline");
    }

    public boolean isPrintOptionActive() {
        Set<String> openTabs = DRIVER.getWindowHandles();
        for (String handle : openTabs) {
            DRIVER.switchTo().window(handle).getTitle();
        }
        DRIVER.quit();
        return openTabs.size() == 2;
    }

}
