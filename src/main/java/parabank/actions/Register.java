package parabank.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import parabank.elements.RegisterElements;

import java.time.Duration;

public class Register {

    private Wait<WebDriver> wait;
    private RegisterElements elements;

    public Register(WebDriver driver) {
        this.elements = new RegisterElements(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void writeFirstName(String firstName){
        elements.firstName().sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        elements.lastName().sendKeys(lastName);
    }

    public void writeStreet(String street){
        elements.address().sendKeys(street);
    }

    public void writeCity(String city){
        elements.city().sendKeys(city);
    }

    public void writeState(String state){
        elements.state().sendKeys(state);
    }

    public void writeZipCode(String zipCode){
        elements.zipCode().sendKeys(zipCode);
    }

    public void writePhoneNumber(String phoneNumber){
        elements.phoneNumber().sendKeys(phoneNumber);
    }

    public void writeSSN(String sSN){
        elements.sSN().sendKeys(sSN);
    }

    public void writeUsername(String userName){
        elements.userName().sendKeys(userName);
    }

    public void writePassword(String passWord){
        elements.passWord().sendKeys(passWord);
    }

    public void writeConfirmPassword(String confirmPassword){
        elements.confirmPassword().sendKeys(confirmPassword);
    }

    public void clickRegisterButton(){
        elements.registerButton().click();
    }

    public boolean successfulRegistrationTextExists(){
        try {
            wait.until(d -> elements.succesfulRegisterElement().isDisplayed());
            return elements.succesfulRegisterElement().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String successfulRegistrationText(){

        wait.until(d -> elements.succesfulRegisterElement().isDisplayed());
        return elements.succesfulRegisterElement().getText();
    }

    public String checkSignUpMessage(){
        //wait.until(d -> elements.signUpMessage().isDisplayed());
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"rightPanel\"]/p")));
        return elements.signUpMessage().getText();
    }

    public boolean successfulRegistrationTitleExists(){
        try {
            wait.until(d -> elements.succesfulRegisterElement().isDisplayed());
            return elements.succesfulRegisterElement().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String succesfulOpenRegisterPageTitle(){

        wait.until(d -> elements.signUpEasyTitle().isDisplayed());
        return elements.signUpEasyTitle().getText();
    }

    public String succesfulRegistrationMessage(){
        wait.until(d -> elements.welcomeMessage().isDisplayed());
        return elements.welcomeMessage().getText();
    }
}
