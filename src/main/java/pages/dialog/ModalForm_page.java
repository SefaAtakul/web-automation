package pages.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ModalForm_page extends BasePage {

    @FindBy(xpath = "//button[@class='ui-button ui-widget ui-corner-all']")
    private WebElement createAccountButton;

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "surname")
    private WebElement surnameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "(//button/span[@class='ui-button-icon ui-icon ui-icon-closethick'])[3]")
    private WebElement basicDialogCloseButton;

    @FindBy(xpath = "//table[@class='ui-widget ui-widget-content mb-4']/tbody/tr/child::td")
    private List<WebElement> userData;

    private List<String> userDatas = new ArrayList<>();

    public ModalForm_page(){
        super();
    }

    public void cliclOnCreateAccountButton(){
        createAccountButton.click();
    }
    public void sendName(String name){
        nameField.clear();
        nameField.sendKeys(name);
        userDatas.add(name);
    }
    public void sendSurname(String surname){
        surnameField.clear();
        surnameField.sendKeys(surname);
        userDatas.add(surname);
    }
    public void senEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
        userDatas.add(email);
    }
    public void clickOnBasicDialogCloseButton() {
        basicDialogCloseButton.click();
    }
    public void clickOnSubmitButton() {
        actions.moveToElement(submitButton).click(submitButton);
    }
    public boolean isInputFieldEmpty() {
        String name = nameField.getText();
        return name.isEmpty();
    }
    public boolean isBasicDialogNotDisplaying() {
        return !submitButton.isDisplayed();
    }
    public boolean areUsersDataSubmittedCorrectly() {
        for (int i = 3; i < userDatas.size(); i++) {
            if(!userDatas.get(i).equalsIgnoreCase(String.valueOf(userData.get(i-3)))){
                return false;
            }
        }
        return true;
    }
}
