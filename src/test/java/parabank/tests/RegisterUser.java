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

        register.writeFirstName("Cristi");
        register.writeLastName("Doi");
        register.writeStreet("Plopilor 2");
        register.writeCity("Cluj");
        register.writeState("Romania");
        register.writeZipCode("123456");
        register.writePhoneNumber("0987654321");
        register.writeSSN("3456");
        register.writeUsername("cristi2");
        register.writePassword("1234");
        register.writeConfirmPassword("1234");

        register.clickRegisterButton();

        Assert.assertEquals(register.succesfulRegistrationMessage(),"Your account was created successfully. You are now logged in.");

    }

}
