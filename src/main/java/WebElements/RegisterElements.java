package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterElements {

    private WebDriver driver = null;

    public RegisterElements(WebDriver driver){
        this.driver = driver;
    }

    public WebElement signUpText() {
        return driver.findElement(By.xpath("//h2"));
    }

    public WebElement firstname(){
        return driver.findElement(By.cssSelector("#firstName"));
    }

    public WebElement lastname(){
        return driver.findElement(By.cssSelector("#lastName"));
    }

    public WebElement phoneNumber(){
        return driver.findElement(By.cssSelector("#phoneNumber"));
    }

    public WebElement email(){
        return driver.findElement(By.cssSelector("#email"));
    }

    public WebElement password(){
        return driver.findElement(By.cssSelector("#password"));
    }

    public WebElement city(){
        return driver.findElement(By.cssSelector("#city"));
    }

    public WebElement customer(){
        return driver.findElement(By.cssSelector("#customer"));
    }

    public WebElement trainer(){
        return driver.findElement(By.cssSelector("#trainer"));
    }

    public WebElement clickSubmitButton(){
        return driver.findElement(By.cssSelector("#submit"));
    }
}
