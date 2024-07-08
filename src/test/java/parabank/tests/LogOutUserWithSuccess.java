package parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.actions.Login;
import parabank.actions.Overview;

public class LogOutUserWithSuccess extends BaseParaBankTest {

    private Login loginPage = null;

    @Test
    public void logOutWithSuccess(){

        loginPage = new Login(driver);
        initTest("Log Out user successfully");

        loginPage.enterUserName("vpopescu");
        loginPage.enterPassword("1234");
        Overview overviewPage = loginPage.clickSubmitButton();
        Assert.assertFalse(loginPage.errorForbiddenAccessTextExists());

        overviewPage.logOut();
        Assert.assertTrue(loginPage.logInButtonPresent());

    }


}
