package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DisplayMultipleMonths_Page extends BasePage {
    @FindBy(xpath = "//input[@id='datepicker-multiple-months']")
    private WebElement dateField;

    @FindBy(id = "ui-datepicker-div")
    private WebElement dateTablo;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    private WebElement nextButton;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']")
    private List<WebElement> displayingMonths;

    @FindBy(xpath = "//button[contains(text(),'Today')]")
    private WebElement todayButton;

    @FindBy(xpath = "//button[contains(text(),'Done')]")
    private WebElement doneButton;

    @FindBy(xpath = "//a[@class='ui-datepicker-prev ui-corner-all']")
    private WebElement prevButton;

    @FindBy(xpath = "//table/tbody/tr/td/a[@data-date='14']")
    private List<WebElement> listOfSelectedDayForEachMonth;

    @FindBy(xpath = "//div[@class='ui-datepicker-title']")
    private List<WebElement> listOfThreeDateTitle;



    public DisplayMultipleMonths_Page() {
        super();
    }

    public void clickOnDateField(){
        dateField.click();
    }

    public void clickOnPrevButton(){
        prevButton.click();
    }

    public void clickOnNextButton(){
        nextButton.click();
    }

    public void clickOnTodayButton() {
        dateField.clear();
        actions.click(todayButton).perform();
    }

    public void clickOnPrevButtonToSeePassingMonths(int times) {
        for (int i = 0; i < times; i++) {
            actions.click(prevButton).perform();
            BrowserUtils.wait(1);
        }
    }

    public void clickOnNextButtonToSeePassingMonths(int times) {
        for (int i = 0; i < times; i++) {
            actions.click(nextButton).perform();
            BrowserUtils.wait(1);
        }
    }


    public String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    public void clickOnDateDisplayField() {
        actions.click(dateField).perform();
    }

    public void clickOnNextButtonToSeeUpcomingMonths(int times) {
        for (int i = 0; i < times; i++) {
            actions.click(nextButton).perform();
            BrowserUtils.wait(1);
        }
    }

    public String getDateShownOnDateField() {
        return dateField.getAttribute("value");
    }

    public void clickOnDOneButton(){
        doneButton.click();
    }

    private WebElement selectADayForMiddleMonth(int day) {
        return DRIVER.findElement(By.xpath("(//table/tbody/tr/td/a[@data-date='" + day + "'])[1]"));
    }

    public void selectASpecificDateForFirstMonth(int day) {
        WebElement chosenDay = selectADayForMiddleMonth(day);
        actions.moveToElement(chosenDay).click().build().perform();
        chosenDay.getAttribute("data-date");
    }
}
