package parabank.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountServicesElements {

    WebDriver driver = null;

    public AccountServicesElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement logOutLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a"));
    }
}
