package pages.progressBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

public class DownloadDialog_Page extends BasePage {
        @FindBy(id = "downloadButton-download-dialog")
        private WebElement startDownloadButton;

        @FindBy(id = "ui-id-82")
        private WebElement fileDownloadHeader;

        @FindBy(xpath = "//button[contains(text(),'Cancel Download')]")
        private WebElement cancelDownloadButton;

        @FindBy(xpath = "//div[@id='dialog-container-download-dialog']")
        private WebElement currentProgressBar;

        public boolean getTextOfHeaderDownload(){
            return fileDownloadHeader.isDisplayed();
        }


        public void clickOnCancelButton(){
           actions.moveToElement(cancelDownloadButton).click();
        }

        public void clickOnStartDownloadButton(){
            startDownloadButton.click();
        }

        public String getTheCancelText(){
            return cancelDownloadButton.getText();
        }

    public boolean isCurrentProgressBarFunctionsProperly() {
        BrowserUtils.wait(1);
        String initValue = currentProgressBar.getAttribute("style");
        BrowserUtils.wait(2);
        String finalValue = currentProgressBar.getAttribute("style");
        return !initValue.equals(finalValue);
    }

}
