package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardElements {
    private WebDriver driver = null;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public DashboardElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement userNameDisplay() {
        return driver.findElement(By.cssSelector("#userNameDisplay"));
    }

    public WebElement trainingButton(){
        return driver.findElement(By.cssSelector(".trainings"));
    }


}