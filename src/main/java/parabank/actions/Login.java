package parabank.actions;

import parabank.elements.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Login {

    private WebDriver driver;
    private LoginElements element;
    private Wait<WebDriver> wait;


    public Login(WebDriver driver) {
        this.driver = driver;
        this.element = new LoginElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickRegisterButton() {
        element.registerLink().click();
    }

    public void enterUserName(String userEmail) {
        element.username().sendKeys(userEmail);
    }

    public void enterPassword(String password) {
        element.userPassword().sendKeys(password);
    }

    public Overview clickSubmitButton() {
        element.loginButton().click();
//        wait.until();
        return new Overview(driver);
    }

    public boolean logInButtonPresent(){
        wait.until(d -> element.loginButton().isDisplayed());
        return element.loginButton().isDisplayed();
    }

    public boolean errorForbiddenAccessTextExists() {
        try {
            wait.until(d -> element.errorForbiddenAccess().isDisplayed());
            return element.errorForbiddenAccess().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String errorForbiddenText(){

        wait.until(d -> element.errorForbiddenAccess().isDisplayed());
        return element.errorForbiddenAccess().getText();

    }

    public void clickRegisterLink(){
        element.registerLink().click();
    }


}