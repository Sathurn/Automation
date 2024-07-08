package tests;

import Actions.Login;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;
import java.lang.Thread;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class LoginUserWithSuccess extends BaseTest {

    private Login login = null;

    @Test
    public void loginUser() throws InterruptedException {

        login = new Login(driver);

        initTest("Login User (with success)");

        driver.get("http://apptest.go.ro:9999/login");

        login.enterUserName("tb@tb.com");
        login.enterPassword("1234");
        login.clickSubmitButton();

        //Thread.sleep(6000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     //   wait.until(ExpectedConditions.visibilityOfElementLocated());

        Assert.assertEquals(driver.getCurrentUrl(),"http://apptest.go.ro:9999/dashboard");

    }



}
