package parabank.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Overview {

    private AccountServices accountServices;
    private Wait<WebDriver> wait;

    public Overview(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.accountServices = new AccountServices(driver);
    }

    public UpdateProfile updateProfile(){
        return accountServices.clickUpdateContactInfo();
    }

    public void logOut(){
        accountServices.clickLogOut();
    }

}
