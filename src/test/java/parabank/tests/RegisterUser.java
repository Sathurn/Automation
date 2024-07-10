package parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.actions.Login;
import parabank.actions.Register;

public class RegisterUser extends BaseParaBankTest{

    private Login loginPage;
    private Register register;

    @Test
    public void registerUser(){
        loginPage = new Login(driver);

        initTest("Register User (with success)");

        loginPage.clickRegisterLink();

        //Assert.assertEquals(driver.getCurrentUrl(),"https://parabank.parasoft.com/parabank/register.htm");

        register = new Register(driver);
        Assert.assertEquals(register.succesfulOpenRegisterPageTitle(),"Signing up is easy!");



    }

}
