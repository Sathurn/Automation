package parabank.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterElements {

    WebDriver driver = null;

    public RegisterElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstName(){
        return driver.findElement(By.id("customer.firstName"));
    }

    public WebElement lastName(){
        return driver.findElement(By.id("customer.lastName"));
    }

    public WebElement address(){
        return driver.findElement(By.id("customer.address.street"));
    }

    public WebElement city(){
        return driver.findElement(By.id("customer.address.city"));
    }

    public WebElement state(){
        return driver.findElement(By.id("customer.address.state"));
    }

    public WebElement zipCode(){
        return driver.findElement(By.id("customer.address.zipCode"));
    }

    public WebElement phoneNumber(){
        return driver.findElement(By.id("customer.phoneNumber"));
    }

    public WebElement sSN(){
        return driver.findElement(By.id("customer.ssn"));
    }

    public WebElement userName(){
        return driver.findElement(By.id("customer.username"));
    }

    public WebElement passWord(){
        return driver.findElement(By.id("customer.password"));
    }

    public WebElement confirmPassword(){
        return driver.findElement(By.id("repeatedPassword"));
    }

    public WebElement registerButton(){
        return driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
    }

    public WebElement succesfulRegisterElement(){
        return driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
    }

    public WebElement signUpMessage(){
        return driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p/text()"));
    }

    public WebElement signUpEasyTitle(){
        //"Signing up is easy!"
        return driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1"));
    }

    public WebElement signUpMassageBefore(){
        //"If you have an account with us you can sign-up for free instant online access. You will have to provide some personal information."
        return driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
    }
}
