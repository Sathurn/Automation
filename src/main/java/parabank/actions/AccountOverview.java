package parabank.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import parabank.elements.AccountOverviewElements;
import parabank.elements.AccountServicesElements;
import parabank.elements.TransferFundsElements;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class AccountOverview {
    private WebDriver driver;
    private AccountOverviewElements elements;
    private Wait<WebDriver> wait;

    public AccountOverview(WebDriver driver) {
        this.driver = driver;
        this.elements = new AccountOverviewElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getAccountList(){

//        //wait.until(d -> elements.footerNoteText());
//        String[] accounts = null;
//        List<WebElement> accountNumbers = elements.getAccountNumbers();
//        for(WebElement account: accountNumbers){
//            accounts = new String[]{account.getText()};
//        }
//        return accounts;
        return String.valueOf(elements.getAccountNumbers().getFirst());

    }

    public boolean footerNotePresence(){
        wait.until(d -> elements.footerNoteText());
        return elements.footerNoteText().isDisplayed();
    }

}
