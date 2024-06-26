package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements {

    private WebDriver driver = null;

    public LoginElements(WebDriver driver){
        this.driver = driver;
    }

    public WebElement registerButton() {
        return driver.findElement(By.className("register"));
    }

    public WebElement loginEmail(){
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement loginPassword(){
        return driver.findElement(By.id("userPassword"));
    }

    public WebElement loginButton() {
        return driver.findElement(By.id("submitButton"));
    }

    public WebElement accessForbidden(){
        return driver.findElement(By.id("errorForbiddenAccess"));
    }
}
