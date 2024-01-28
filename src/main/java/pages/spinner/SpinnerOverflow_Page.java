package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.nio.file.Watchable;

public class SpinnerOverflow_Page extends BasePage {
    @FindBy(id = "spinner-overflow")
    private WebElement spinnerOverflowBox;


    @FindBy(xpath = "(//a[@tabindex='-1']/child::span)[21]")
    private WebElement incrementButton;

    @FindBy(xpath = "(//a[@tabindex='-1']/child::span)[23]")
    private WebElement decrementButton;

    public SpinnerOverflow_Page(){
        super();
    }


    public void clickOnIncrementButton(int number){
        for (int i = 0; i < number; i++) {
            incrementButton.click();
        }
    }
    public void clickOnDecrementButton(int number){
        for (int i = 0; i < number; i++) {
            decrementButton.click();
        }
    }

    public String getSelectedValue(){
        return spinnerOverflowBox.getAttribute("aria-valuenow");
    }

    public void sendNumberToSelectionBox(String number){
        spinnerOverflowBox.clear();
        spinnerOverflowBox.sendKeys(number);
    }

}
