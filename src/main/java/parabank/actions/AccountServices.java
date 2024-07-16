package parabank.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import parabank.elements.AccountServicesElements;

import java.time.Duration;

public class AccountServices {

    private WebDriverWait wait;
    private WebDriver driver = null;

    private AccountServicesElements elements = null;


    public AccountServices(WebDriver driver) {
        this.driver = driver;
        this.elements = new AccountServicesElements(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOpenNewAccount(){
        elements.openNewAccountLink().click();
    }

    public AccountOverview clickAccountOverview(){
        elements.accountOverviewLink().click();
        return new AccountOverview(driver);
    }

    public TransferFunds clickTransferFunds(){
        elements.transferFundsLink().click();
        return new TransferFunds(driver);
    }

    public void clickBillPay(){
        elements.billPayLink().click();
    }

    public void clickFindTransactions(){
        elements.findTransactionsLink().click();
    }

    public UpdateProfile clickUpdateContactInfo(){
        elements.updateContactInfoLink().click();
        return new UpdateProfile(driver);
    }

    public void clickRequestLoan(){
        elements.requestLoanLink().click();
    }

    public void clickLogOut(){
        elements.logOutLink().click();
    }
}
