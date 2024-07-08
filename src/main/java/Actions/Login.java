package Actions;

import WebElements.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    private LoginElements element;
    private Wait<WebDriver> wait;


    public Login(WebDriver driver) {
        this.element = new LoginElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickRegisterButton() {
        element.registerButton().click();
    }

    public void enterUserName(String userEmail) {
        element.userEmail().sendKeys(userEmail);
    }

    public void enterPassword(String password) {
        element.userPassword().sendKeys(password);
    }

    public void clickSubmitButton() {
        element.submitButton().click();
    }

    public boolean errorForbiddenAccessText() {
        try {
            wait.until(d -> element.errorForbiddenAccess().isDisplayed());
            return element.errorForbiddenAccess().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}