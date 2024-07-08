package Actions;

import WebElements.DashboardElements;
import WebElements.TrainingElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Training {
    private TrainingElements elements = null;
    private Wait<WebDriver> wait;

    public Training(WebDriver driver){
        elements = new TrainingElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickGenerateProgramButton(){
        wait.until(d -> elements.generatedProgram().isDisplayed());
        elements.generatedProgram().click();
    }

}