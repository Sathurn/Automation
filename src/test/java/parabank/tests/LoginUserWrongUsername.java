package parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.actions.Login;

public class LoginUserWrongUsername extends BaseParaBankTest{

    private Login loginPage = null;

    @Test
    public void loginUserWithWrongUsername(){

        loginPage = new Login(driver);

        initTest("Login User (without success - wrong username)");

        loginPage.enterUserName("vasilep");
        loginPage.enterPassword("1234");
        loginPage.clickSubmitButton();

        Assert.assertTrue(loginPage.errorForbiddenAccessTextExists());

        Assert.assertEquals(loginPage.errorForbiddenText(),"The username and password could not be verified.");
    }

}
