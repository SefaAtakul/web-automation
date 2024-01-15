package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Textarea_Page extends BasePage {
    @FindBy(xpath = "//div[@class='ui-wrapper']")
    private WebElement textBoxElement;

    @FindBy(css = ".ui-wrapper > .ui-resizable-handle:nth-child(4)")
    private WebElement handleOfTextAreaForResizing;

   public void resizeTheTextarea(){
       actions.clickAndHold(handleOfTextAreaForResizing).moveByOffset(100,100).release().build().perform();
   }
    public int getWidthOfTextArea(){
      return  textBoxElement.getSize().getWidth();
    }
    public int getHeightOfTexArea(){
       return textBoxElement.getSize().getHeight();
    }
}
