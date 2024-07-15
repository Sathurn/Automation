package apptest.tests;

import Actions.Login;
import Actions.Register;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUser extends BaseAppTest {

    private Login login = null;
    private Register register = null;

    @Test
    public void registerUser(boolean b) {

        initTest("Register User");

        login = new Login(driver);
        register = new Register(driver);

        login.clickRegisterButton();

        Assert.assertTrue(register.getSingUpText().equalsIgnoreCase("Sign Up"));

        register.registerUser(true);

    }
}