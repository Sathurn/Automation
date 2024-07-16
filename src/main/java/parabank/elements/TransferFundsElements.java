package parabank.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TransferFundsElements {

    WebDriver driver = null;


    public TransferFundsElements(WebDriver driver){

        this.driver = driver;

    }

    public WebElement amount(){
        //xpath = //*[@id="amount"]
        return driver.findElement(By.id("amount"));
    }

    public WebElement fromAccount(){
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]"));
        Select dropdown = new Select(dropdownElement);
        //dropdown.selectByVisibleText("13899");
        //List<WebElement> dropdownList = dropdown.getOptions();
        //int size = dropdownList.size();
        //return dropdownList.getFirst();

        dropdown.selectByVisibleText("15120");
        return dropdownElement;
    }

    public WebElement toAccount(){
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"toAccountId\"]"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("15120");
        return dropdownElement;
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"toAccountId\"]"));
//        Select dropdown = new Select(dropdownElement);
//        List<WebElement> dropdownList = dropdown.getOptions();
//        //int size = dropdownList.size();
//        return dropdownList.getLast();
    }

    public WebElement transferButton(){
        return driver.findElement(By.xpath("//*[@id=\"transferForm\"]/div[2]/input"));
    }

    public WebElement transferCompleteTitleElement(){
        return driver.findElement(By.xpath("//*[@id=\"showResult\"]/h1"));
    }

    public WebElement transferCompleteMessageAmountResultElement() {
        return driver.findElement(By.xpath("//*[@id=\"amountResult\"]"));
    }

    public WebElement transferCompleteMessageText1Element(){
        //xpath = //*[@id="showResult"]/p[1]/text()[1] //*[@id="showResult"]/p[1]/text()[1]
        return driver.findElement(By.xpath("//*[@id=\"showResult\"]/p[1]/text()[1]"));
    }

    public WebElement transferCompleteMessageFromAccountElement() {
        return driver.findElement(By.xpath("//*[@id=\"fromAccountIdResult\"]"));
    }

    public WebElement transferCompleteMessageText2Element() {
        return driver.findElement(By.xpath("//*[@id=\"showResult\"]/p[1]/text()[2]"));
    }

    public WebElement transferCompleteMessageToAccountElement() {
        return driver.findElement(By.xpath("//*[@id=\"toAccountIdResult\"]"));
    }

    public WebElement transferCompleteMessageText3Element(){
        return driver.findElement(By.xpath("//*[@id=\"showResult\"]/p[1]/text()[3]"));
    }

    public WebElement transferCompleteEntireText(){
        return driver.findElement(By.cssSelector("#showResult > p:nth-child(2)"));
    }

}
