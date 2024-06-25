package tests;

import Actions.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class LoginUserWithoutSuccess extends BaseTest {

    private Login login = null;

    @Test
    public void loginUser() throws InterruptedException {

        login = new Login(driver);

        initTest("Login User (without success)");

        driver.get("http://apptest.go.ro:9999/login");

        login.setEmail("tib@tb.com");
        login.setPassword("1234");
        login.clickLoginButton();

        Thread.sleep(6000);

     //   Assert.assertEquals(login.getAccessForbidden(),"Access forbidden!");

        Assert.assertNotNull(login.getAccessForbidden());

    }

}
