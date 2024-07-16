package parabank.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class AccountOverviewElements {

    WebDriver driver = null;
    private Wait<WebDriver> wait;

    public AccountOverviewElements(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public List<WebElement> getAccountNumbers(){
        //WebElement dropdownElement = driver.findElement(By.cssSelector("td:nth-child(1) > a"));
        //WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("#accountTable")));


        //WebElement table = driver.findElement(By.xpath("//*[@id=\"accountTable\"]"));
        //List<WebElement> rows = table.findElements(By.cssSelector("tr"));
        //        List<WebElement> accountNumbers = rows.stream()
//                .map(row -> row.findElement(By.tagName("td:nth-child(1) > a")))
//                .collect(Collectors.toList());
        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"accountTable\"]")));

        List<WebElement> rows = table.findElements(By.cssSelector("tr"));

        List<WebElement> accountNumbers = rows.stream()
                .map(row -> {
                    try {
                        return row.findElement(By.cssSelector("td:nth-child(1) > a"));
                    } catch (Exception e) {
                        // If no anchor is found, return null (or handle appropriately)
                        return null;
                    }
                })
                .filter(account -> account != null) // Filter out any nulls
                .collect(Collectors.toList());
        return accountNumbers;
    }

    public WebElement footerNoteText(){
        //cssSelector = #accountTable > tfoot > tr > td
        return driver.findElement(By.cssSelector("#accountTable > tfoot > tr > td"));
    }



}
