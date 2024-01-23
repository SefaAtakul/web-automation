package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AccentFolding_Page extends BasePage {

    @FindBy(xpath = "//input[@id='developer-accentFolding']")
    private WebElement developerInputElement;

    @FindBy(css = "#ui-id-40 > li >div")
    private List<WebElement> suggestionMenu;

    @FindBy(xpath = "//div[@id='ui-id-165']")
    private List<WebElement> firstDeveloper;

    @FindBy(xpath = "//div[@id='ui-id-166']")
    private List<WebElement> secondDeveloper;

    public void enterDeveloperInput(String key){
        developerInputElement.sendKeys(key);
    }

    public List<String> getSuggestionMenu(){
        return suggestionMenu.stream().map(WebElement::getText).toList();
    }

    public boolean getSuggestionMenuDisplayed(){
        return suggestionMenu.size()>0;
    }

    public String getFirstDeveloper(){
        return firstDeveloper.toString();
    }

    public void clearDeveloperInput(){ developerInputElement.clear();}

}