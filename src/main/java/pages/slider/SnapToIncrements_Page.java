package pages.slider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SnapToIncrements_Page extends BasePage {
    @FindBy(id = "amount-snap-to-increments")
    private WebElement amountOfIncrement;

    @FindBy(xpath = "(//div/span[@tabindex='0'])[11]")
    private WebElement sliderHandle;

    public SnapToIncrements_Page() {
        super();
    }

    public void holdOnSlidingHandleAndDragToTheRightOrLeft(int xOffset) throws MoveTargetOutOfBoundsException {
        try{
            actions.dragAndDropBy(sliderHandle, xOffset, 0).perform();
        }catch(MoveTargetOutOfBoundsException ex){
            System.out.println(ex + "\nThe chosen amount exceeds the permitted limits.");
        }
    }

    public boolean isDonationAmountMachWithIncrementAmount(int xOffset) {
        int incrementAmount = getValueOfIncrementAmount();
        int donationAmount = getValueOfDonationAmount();
        return (incrementAmount * 5) == donationAmount;
    }

    // PRIVATE METHODS

    private int getValueOfDonationAmount() {
        String value = amountOfIncrement.getAttribute("value");
        return Integer.parseInt(value.replace("$", "").trim());
    }

    private int getValueOfIncrementAmount() {
        String value = sliderHandle.getAttribute("style");
        return Integer.parseInt(value.substring(5, (value.length() - 2)).trim());
    }
}
