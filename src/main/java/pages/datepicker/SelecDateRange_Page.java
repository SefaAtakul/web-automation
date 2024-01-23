package pages.datepicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class SelecDateRange_Page extends BasePage {

    @FindBy(id = "from-selectDateRange")
    private WebElement fromDateBox;

    @FindBy(id = "to-selectDateRange")
    private WebElement toDateBox;

    @FindBy(id = "ui-datepicker-div")
    private WebElement fromDateList;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
    private WebElement prevButtons;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    private WebElement nextButtons;

   @FindBy(id = "ui-datepicker-div")
    private WebElement toDateList;
    @FindBy(xpath = "//div[@class='ui-datepicker-title']/child::select")
    private WebElement dropDownOfMonths;

    @FindBy(css = ".ui-datepicker-header .ui-datepicker-title")
    private List<WebElement> threeTitlesOfSelectedMonths;


    public SelecDateRange_Page(){
        super();
    }

    public void clickFromDateBox(){
        fromDateBox.clear();
        fromDateBox.click();
    }

    public void clickToDateBox(){
        toDateBox.clear();
        toDateBox.click();
    }

    public boolean isDisplayedFromfromDateList(){
        if (fromDateList.isDisplayed()){
            return true;
        }
        return false;
    }

    public boolean isDisplayedToDateList(){
        if (toDateList.isDisplayed()){
            return true;
        }
        return false;
    }

    public void clickPrevButtons(int number){
        for (int i = 0; i < number-1; i++) {
            prevButtons.click();
            BrowserUtils.wait(1.0);
        }
    }

    public void clickNextButtons(int number){
        for (int i = 0; i < number-1; i++) {
            nextButtons.click();
            BrowserUtils.wait(1.0);
        }
    }

    public void selectTheMonth(String month){
        Select monthIS = new Select(dropDownOfMonths);
        monthIS.selectByValue(month);

    }

    public boolean isSelectedMonthShownCorrectly(String firstUpcoming){
         char[] ch1 = threeTitlesOfSelectedMonths.get(1).getText().toCharArray();
         String month1 = eliminateTheYear(ch1);
        return firstUpcoming.equalsIgnoreCase(month1);
    }

    public String eliminateTheYear(char[] ch1){
        String str = "";
        for (int i = 0; i < ch1.length-5; i++) {
            str += ch1[i];
        }
        return str;
    }

    private String defineUpcomingMonthsAccordingTheSelectedMonth(String month) throws NullPointerException {
        String upcomingMonths = "";
        switch (month) {
            case "Jan":
                upcomingMonths= "February ";
                break;
            case "Feb":
                upcomingMonths = "March ";
                break;
            case "Mar":
                upcomingMonths = "April ";
                break;
            case "Apr":
                upcomingMonths = "May ";
                break;
            case "May":
                upcomingMonths = "June ";
                break;
            case "Jun":
                upcomingMonths = "July ";
                break;
            case "Jul":
                upcomingMonths = "August ";
                break;
            case "Aug":
                upcomingMonths = "September ";
                break;
            case "Sep":
                upcomingMonths = "October ";
                break;
            case "Oct":
                upcomingMonths = "November ";
                break;
            case "Nov":
                upcomingMonths= "December ";
                break;
            case "Dec":
                upcomingMonths = "January ";
                break;
        }
        return upcomingMonths;
    }
}
