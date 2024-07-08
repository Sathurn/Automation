package Actions;

import WebElements.RegisterElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utile.ConfigLoader;

import java.time.Duration;

public class Register {


    private RegisterElements elements = null;
    private Wait<WebDriver> wait;

    public Register(WebDriver driver){
        elements = new RegisterElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getSingUpText(){
        return elements.signUpText().getText();
    }

    public void setFirstname(String firstname){
        wait.until(d -> elements.firstname().isDisplayed());
        elements.firstname().sendKeys(firstname);
    }

    public void setPhoneNumber(String phoneNumber){
        elements.phoneNumber().sendKeys(phoneNumber);
    }

    public void setLastname(String lastname){
        elements.lastname().sendKeys(lastname);
    }

    public void setEmail(String email){
        elements.email().sendKeys(email);
    }

    public void password(String password){
        elements.password().sendKeys(password);
    }

    public void city(String city){
        elements.city().sendKeys(city);
    }

    public void customer(){
        elements.customer().click();
    }

    public void trainer(){
        elements.trainer().click();
    }

    public void clickSubmitButton(){
        elements.clickSubmitButton().click();
    }


    public void registerUser(boolean isTrainer) {

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/propietati/dateUser1.properties");
        String firstName = configLoader.getProperty("firstName");
        String lastName = configLoader.getProperty("lastName");
        String numarTelefon = configLoader.getProperty("numarTelefon");
        String email = configLoader.getProperty("email");
        String city = configLoader.getProperty("city");
        String parola = configLoader.getProperty("parola");


        setFirstname(firstName);
        setLastname(lastName);
        setPhoneNumber(numarTelefon);
        setEmail(email);
        city(city);
        password(parola);
        if (isTrainer) {
            trainer();
        } else {
            customer();
        }
        clickSubmitButton();
    }
}