package parabank.tests;

import parabank.actions.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserWithSuccess extends BaseParaBankTest {

    private Login login;

    @Test
    public void loginUser() {

        login = new Login(driver);

        initTest("Login User (with success)");

        login.enterUserName("vpopescu");
        login.enterPassword("1234");
        login.clickSubmitButton();

        Assert.assertEquals(driver.getCurrentUrl(),"https://parabank.parasoft.com/parabank/overview.htm");
    }



}
