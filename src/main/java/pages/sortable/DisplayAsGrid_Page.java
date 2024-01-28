package pages.sortable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DisplayAsGrid_Page extends BasePage {

    @FindBy(css = "#sortable-disp-as-grid > li")
    private List<WebElement> numbers;

    public DisplayAsGrid_Page() {
        super();
    }

    public void moveElementByNumberToAnotherNumber(String number , String destination){
        List<String> stringsOfNumbers = numbers.stream().map(WebElement::getText).toList();

        WebElement numberTomove = numbers.get(stringsOfNumbers.indexOf(number));

        WebElement destinationNumber = numbers.get(stringsOfNumbers.indexOf(destination));

        actions.clickAndHold(numberTomove).moveToElement(destinationNumber).build().perform();
    }

    public String getNumberElementLocation(String number){
        return DRIVER.findElement(By.cssSelector("#sortable-disp-as-grid > li:nth-child(" + number + ")")).getText();
    }

    public void moveToElementByOffset(String number ,int xOffset , int yOffset){
        List<String> stringOfNumber = numbers.stream().map(WebElement::getText).toList();
        WebElement numberToMove = numbers.get(stringOfNumber.indexOf(number));

        actions.clickAndHold(numberToMove).moveByOffset(xOffset, yOffset).release().build().perform();
    }
    public String lineageOfNumbers() {
        String lineage = "";
        for (int i = 1; i <= 12; i++) {
            if (i == 12) {
                lineage += DRIVER.findElement(By.cssSelector("#sortable-disp-as-grid > li:nth-child(" + i + ")")).getText();
            } else {
                lineage += DRIVER.findElement(By.cssSelector("#sortable-disp-as-grid > li:nth-child(" + i + ")")).getText() + "-";
            }
        }
        System.out.println("Arrangement of numbers --> " + lineage);
        return lineage;
    }
}
