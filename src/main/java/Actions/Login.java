package Actions;


import WebElements.LoginElements;
import org.openqa.selenium.WebDriver;

public class Login {

    private LoginElements element;

    public Login(WebDriver driver) {
        this.element = new LoginElements(driver);
    }

    public void clickRegisterButton(){
        element.registerButton();
    }

    public void setEmail(String email){
        element.loginEmail().sendKeys(email);
    }

    public void setPassword(String password){
        element.loginPassword().sendKeys(password);
    }

    public void clickLoginButton(){
        element.loginButton().click();
    }

    public String getAccessForbidden(){
        return String.valueOf(element.accessForbidden());
    }

}
