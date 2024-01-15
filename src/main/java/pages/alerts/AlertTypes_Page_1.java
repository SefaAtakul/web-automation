package pages.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AlertTypes_Page_1 extends BasePage {
    Alert alert;
    @FindBy(xpath = "//button[text()='Show Alert']")
    private WebElement showAlertElement;
    @FindBy(xpath = "//button[text()='Show Confirm']")
    private WebElement showConfirmElement;
    @FindBy(xpath = "//button[contains(text(),'Show Prompt')]")
    private WebElement showPromptElement;

    public void clickOnConfirmButton(){
        showConfirmElement.click();
    }
    public void clickOnPromptButton(){
        showPromptElement.click();
    }
    public void switchToAlert(){
        alert = DRIVER.switchTo().alert();
    }
    public void confirmTheAlert(){
        switchToAlert();
        alert.accept();
    }
    public void rejectTheAlert(){
        switchToAlert();
        alert.dismiss();
    }
    public void sendMessageTheAlert(String name){
        switchToAlert();
        alert.sendKeys(name);
    }
    public String getTextOfAlert(){
        switchToAlert();
       return alert.getText();
    }

}
