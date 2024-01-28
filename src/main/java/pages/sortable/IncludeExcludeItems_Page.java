package pages.sortable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class IncludeExcludeItems_Page extends BasePage {
    @FindBy(css = "#sortable-inc-exc-1 > li")
    private List<WebElement> soratableItemsList1;

    @FindBy(css = "#sortable-inc-exc-2 > li")
    private List<WebElement> sortableItemsList2;

    @FindBy(id = "hel-sortable")
    private WebElement frame;

    @FindBy(xpath = "(//li[text()='Item 1'])[10]")
    private WebElement item1InFirstPackage;

    @FindBy(xpath = "(//li[text()='Item 1'])[11]")
    private WebElement item1InSecondPackage;

    @FindBy(xpath = "(//li[text()='Item 1'])[8]")
    private WebElement item4InFirstPackage;

    @FindBy(xpath = "(//li[text()='Item 1'])[9]")
    private WebElement item4InSecondPackage;

    @FindBy(xpath = "(//li[contains(text(),'drop')])[1]")
    private WebElement firstNonSortableElement;

    @FindBy(xpath = "(//li[contains(text(),'drop')])[2]")
    private WebElement secondNonSortableElement;

    @FindBy(xpath = "(//li[contains(text(),'drop')])[3]")
    private WebElement thirdNonSortableElement;

    @FindBy(xpath = "(//li[contains(text(),'drop')])[4]")
    private WebElement fourthNonSortableElement;

    public IncludeExcludeItems_Page() {
        super();
    }
    public String getWebElementsNameByItsOrder(String blockName,String order){
        return switch (blockName) {
            case "below" ->
                    DRIVER.findElement(By.cssSelector("#sortable-inc-exc-2 > li:nth-child(" + order + ")")).getText();
            default -> DRIVER.findElement(By.cssSelector("#sortable-inc-exc-1 > li:nth-child(" + order + ")")).getText();
        };
    }
    public void moveUpperBoxElementByOffsets(String firstElementName,String secondElementName){

        List<String> stringsOfElements = soratableItemsList1.stream().map(WebElement::getText).toList();
        WebElement first = soratableItemsList1.get(stringsOfElements.indexOf(firstElementName));
        WebElement second = soratableItemsList1.get(stringsOfElements.indexOf(secondElementName));
        int xOffset = second.getLocation().getX() + second.getSize().getWidth()/2 - first.getLocation().getX();
        int yOffset = second.getLocation().getY() + second.getSize().getHeight()/2 - first.getLocation().getY();


        actions.clickAndHold(first).moveByOffset(xOffset,yOffset).release().build().perform();
    }
    public void moveBelowBoxElementByOffsets(String firstElementName,String secondElementName){

        List<String> stringsOfElements = sortableItemsList2.stream().map(WebElement::getText).toList();
        WebElement first = sortableItemsList2.get(stringsOfElements.indexOf(firstElementName));
        WebElement second = sortableItemsList2.get(stringsOfElements.indexOf(secondElementName));
        int xOffset = second.getLocation().getX()+ second.getSize().getWidth()/2 - first.getLocation().getX();
        int yOffset = second.getLocation().getY() + second.getSize().getHeight()/2 - first.getLocation().getY();

        actions.clickAndHold(first).moveByOffset(xOffset,yOffset).release().build().perform();
    }
    public void moveElementByOffset(String blockName,String element,int xOffset,int yOffset){
        List<String> stringsOfElements ;
        WebElement elementToMove = null;
        switch (blockName) {
            case "upper" -> {
                stringsOfElements = soratableItemsList1.stream().map(WebElement::getText).toList();
                elementToMove = soratableItemsList1.get(stringsOfElements.indexOf(element));
            }
            case "below" -> {
                stringsOfElements = sortableItemsList2.stream().map(WebElement::getText).toList();
                elementToMove = sortableItemsList2.get(stringsOfElements.indexOf(element));
            }
            default -> System.out.println("Wrong Block Name!");
        }
        actions.clickAndHold(elementToMove).moveByOffset(xOffset,yOffset).release().build().perform();
    }
}
