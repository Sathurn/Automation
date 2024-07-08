package parabank.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountServicesElements {

    WebDriver driver = null;

    public AccountServicesElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement openNewAccountLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a"));
    }

    public WebElement accountOverviewLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a"));
    }

    public WebElement transferFundsLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a"));
    }

    public WebElement billPayLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a"));
    }

    public WebElement findTransactionsLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[5]/a"));
    }

    public WebElement updateContactInfoLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a"));
    }

    public WebElement requestLoanLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a"));
    }

    public WebElement logOutLink(){
        return driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a"));
    }

}
