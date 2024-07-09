package parabank.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import parabank.elements.UpdateProfileElements;

import java.time.Duration;

public class UpdateProfile {

    private UpdateProfileElements elements;
    private Wait<WebDriver> wait;

    public UpdateProfile(WebDriver driver) {
        this.elements = new UpdateProfileElements(driver);
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

    public void clickUpdateProfile(){
        elements.updateProfileButton().click();
    }

    public boolean successfulUpdateProfileTextExists() {
        try {
            wait.until(d -> elements.successfulUpdateProfileElement().isDisplayed());
            return elements.successfulUpdateProfileElement().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String successfulUpdateProfileText(){

        wait.until(d -> elements.successfulUpdateProfileElement().isDisplayed());
        return elements.successfulUpdateProfileElement().getText();
    }
}
