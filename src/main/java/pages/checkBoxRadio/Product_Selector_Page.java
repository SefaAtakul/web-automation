package pages.checkBoxRadio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class Product_Selector_Page extends BasePage {

    @FindBy(css = ".brand-options > label")
    private List<WebElement> brandOptionsList;

    @FindBy(css = ".shape-options > label")
    private List<WebElement> shapeOptionsList;

    @FindBy(css = ".toggle-options >label")
    private List<WebElement> toggleOptionsList;

    @FindBy(xpath = "//div[contains(@class,'shape ')]")
    private WebElement previewObject;

    @FindBy(xpath = "//div[contains(@class,'shape ')]/p")
    private WebElement textOfObject;


    public void selectTheBrand(String brand) {
        if (brand.equalsIgnoreCase(brandOptionsList.get(0).getText())) {
            brandOptionsList.get(0).click();
        } else if (brand.equalsIgnoreCase(brandOptionsList.get(1).getText())) {
            brandOptionsList.get(1).click();
        } else if (brand.equalsIgnoreCase(brandOptionsList.get(2).getText())) {
            brandOptionsList.get(2).click();
        } else if (brand.equalsIgnoreCase(brandOptionsList.get(3).getText())) {
            brandOptionsList.get(3).click();
        }
    }

    public void selectTheShape(String shape) {
        if (shape.equalsIgnoreCase(shapeOptionsList.get(0).getText())) {
            shapeOptionsList.get(0).click();
        } else if (shape.equalsIgnoreCase(shapeOptionsList.get(1).getText())) {
            shapeOptionsList.get(1).click();
        } else if (shape.equalsIgnoreCase(shapeOptionsList.get(2).getText())) {
            shapeOptionsList.get(2).click();
        } else if (shape.equalsIgnoreCase(shapeOptionsList.get(3).getText())) {
            shapeOptionsList.get(3).click();
        }
    }

    public void selectTheStyle(String styl) {
        if (styl.equalsIgnoreCase("shadow")) {
            BrowserUtils.wait(0.5);
            toggleOptionsList.get(0).click();
        } else if (styl.equalsIgnoreCase("border")) {
            toggleOptionsList.get(1).click();
            BrowserUtils.wait(0.5);
        } else if (styl.equalsIgnoreCase("background color")) {
            toggleOptionsList.get(2).click();
            BrowserUtils.wait(0.5);
        }
    }

    public boolean isBrandCorrect(String brand){
        if (textOfObject.getText().equalsIgnoreCase(brand)){
            return true;
        }
        return false;
    }

    public boolean isShapeCorrect(String shape){
        BrowserUtils.wait(1.0);
       return previewObject.getAttribute("class").contains(shape);
    }

    public boolean isShadowSigned(){
        BrowserUtils.wait(1.0);
        return !previewObject.getAttribute("class").contains("shadow");
    }

    public boolean isBorderSigned(){
        BrowserUtils.wait(1.0);
        return previewObject.getAttribute("class").contains("border");
    }
    public boolean isBackgroundSigned(){
        BrowserUtils.wait(1.0);
        return previewObject.getAttribute("class").contains("background-color");
    }
}