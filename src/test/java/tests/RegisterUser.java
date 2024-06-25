package tests;

import Actions.Login;
import Actions.Register;
import lombok.extern.java.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class RegisterUser extends BaseTest {

    private Login login = null;
    private Register register = null;


    @Test
    public void registerUser(){

        initTest("Register User");

        driver. get("http://apptest.go.ro:9999/register");
        login = new Login(driver);
        register = new Register(driver);
        login.clickRegisterButton();

        Assert.assertEquals(register.getSignUpText(),"SIGN UP");

        register.setFirstname("TB");
        register.setLastname("Chis");
        register.setPhoneNumber("123456");
        register.setEmail("tb@tb.com");
        register.setCity("Cluj");
        register.setPassword("1234");
        register.setTrainer();
        register.setSubmit();

    }

}
