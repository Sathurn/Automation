package parabank.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import parabank.elements.TransferFundsElements;

import java.time.Duration;

public class TransferFunds {

    private WebDriver driver;
    private TransferFundsElements elements;
    private Wait<WebDriver> wait;

    public TransferFunds(WebDriver driver) {
        this.driver = driver;
        this.elements = new TransferFundsElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void writeAmount(String amount){
        elements.amount().clear();
        elements.amount().sendKeys(amount);
    }

    public void fromAccountFirst(){
        wait.until(d -> elements.fromAccount().isDisplayed());
        elements.fromAccount().getText();
    }

    public void toAccountLast(){
        wait.until(d -> elements.toAccount().isDisplayed());
        elements.toAccount().getText();
    }

    public void clickTransferFundsButton(){
        elements.transferButton().click();
    }

    public String successfulTransferFundsTitleText() {
        try {
            wait.until(d -> elements.transferCompleteTitleElement().isDisplayed());
            return elements.transferCompleteTitleElement().getText();
        } catch (Exception e) {
            return String.valueOf(e);
        }
    }

    public String successfulTransferFundsAmountText(){

        wait.until(d -> elements.transferCompleteMessageAmountResultElement());
        return elements.transferCompleteMessageAmountResultElement().getText();
    }

    public String successfulTransferFundsText1Text(){
        return elements.transferCompleteMessageText1Element().getText();
    }

    public String successfulTransferFundsFromAccountText(){
        return elements.transferCompleteMessageFromAccountElement().getText();
    }

    public String successfulTransferFundsText2Text(){
        return elements.transferCompleteMessageText2Element().getText();
    }

    public String successfulTransferFundsToAccountText(){
        return elements.transferCompleteMessageToAccountElement().getText();
    }

    public String successfulTransferFundsText3Text(){
        return elements.transferCompleteMessageText3Element().getText();
    }

    public String completeMessageText(){
        return elements.transferCompleteEntireText().getText();
    }

}
