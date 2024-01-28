package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collapse_Content_Page extends BasePage {

    @FindBy(css = "#accordion-2-cc > h3")
    private List<WebElement> allElements;


    @FindBy(id = "ui-id-10")
    private WebElement firstAccordionElementContentPane;

    @FindBy(id = "ui-id-12")
    private WebElement secondAccordionElementContentPane;

    @FindBy(id = "ui-id-14")
    private WebElement thirdAccordionElementContentPane;

    @FindBy(id = "ui-id-16")
    private WebElement fourthAccordionElementContentPane;


    public Collapse_Content_Page() {
        super();
    }

  public void clickOnElement(int elementNumber){
      switch (elementNumber) {
          case 1 -> {
              allElements.get(0).click();
              BrowserUtils.wait(1.0);
          }
          case 2 -> {
              allElements.get(1).click();
              BrowserUtils.wait(1.0);
          }
          case 3 -> {
              allElements.get(2).click();
              BrowserUtils.wait(1.0);
          }
          case 4 -> {
              BrowserUtils.scrollDownWithPageDown();
              allElements.get(3).click();
              BrowserUtils.wait(1.0);
          }
      }
  }

    public boolean isContentPaneOpenFor(String numberOfElement) {
        return webElementProvider().get(numberOfElement).isDisplayed();
    }

    private Map<String,WebElement> webElementProvider(){
        Map<String,WebElement> provider = new HashMap<>();
        provider.put("firstElement",firstAccordionElementContentPane);
        provider.put("secondElement",secondAccordionElementContentPane);
        provider.put("thirdElement",thirdAccordionElementContentPane);
        provider.put("fourthElement",fourthAccordionElementContentPane);
        return provider;
    }
}
