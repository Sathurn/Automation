package tests;

import Actions.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;
import java.lang.Thread;

import static java.lang.Thread.sleep;

public class LoginUserWithSuccess extends BaseTest {

    private Login login = null;

    @Test
    public void loginUser() throws InterruptedException {

        login = new Login(driver);

        initTest("Login User (with success)");

        driver.get("http://apptest.go.ro:9999/login");

        login.setEmail("tb@tb.com");
        login.setPassword("1234");
        login.clickLoginButton();

        Thread.sleep(6000);

        Assert.assertEquals(driver.getCurrentUrl(),"http://apptest.go.ro:9999/dashboard");

    }



}
