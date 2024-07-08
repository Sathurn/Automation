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

    public void clickLogOut(){
        elements.logOutLink().click();
    }
}
