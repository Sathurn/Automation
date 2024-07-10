package parabank.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfileElements {

    WebDriver driver = null;

    public UpdateProfileElements(WebDriver driver) {
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

    public WebElement updateProfileButton(){
        return driver.findElement(By.xpath("//*[@id=\"updateProfileForm\"]/form/table/tbody/tr[8]/td[2]/input"));
    }

    public WebElement successfulUpdateProfileElement(){
        return driver.findElement(By.xpath("//*[@id=\"updateProfileResult\"]/p"));
    }
}
