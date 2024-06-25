package Actions;

import WebElements.RegisterElements;
import org.openqa.selenium.WebDriver;

public class Register {

    private RegisterElements elements = null;

    public Register(WebDriver driver){
        elements = new RegisterElements(driver);
    }

    public String getSignUpText(){
        return elements.signUpText().getText();
    }

    public void setFirstname(String firstname){
        elements.firstname().sendKeys(firstname);
    }

    public void setLastname(String lastname){
        elements.lastname().sendKeys(lastname);
    }

    public void setPhoneNumber(String phoneNumber){
        elements.phoneNumber().sendKeys(phoneNumber);
    }

    public void setEmail(String email){
        elements.email().sendKeys(email);
    }

    public void setPassword(String password){
        elements.password().sendKeys(password);
    }

    public void setCity(String city){
        elements.city().sendKeys(city);
    }

    public void setCustomer(){
        elements.customer().click();
    }

    public void setTrainer(){
        elements.trainer().click();
    }

    public void setSubmit(){
        elements.submit().click();
    }
}
