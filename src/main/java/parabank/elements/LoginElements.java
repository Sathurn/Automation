package parabank.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements {

    private WebDriver driver = null;

    public LoginElements(WebDriver driver){
        this.driver = driver;
    }


    public WebElement registerLink(){
        return driver.findElement(By.className("register"));
    }

    public WebElement username(){
        return driver.findElement(By.name("username"));
    }

    public WebElement userPassword(){
        return driver.findElement(By.name("password"));
    }

    public WebElement loginButton(){
        return driver.findElement(By.cssSelector("div.login input.button"));
    }

    public WebElement errorForbiddenAccess(){
        return driver.findElement(By.cssSelector(".error"));
    }
}