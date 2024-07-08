package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TrainingElements {

    private WebDriver driver = null;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public TrainingElements(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement generatedProgram(){
        return driver.findElement(By.cssSelector(".generate-program"));
    }


}