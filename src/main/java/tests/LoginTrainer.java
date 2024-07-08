package tests;

import Actions.Dashboard;
import Actions.Login;
import Actions.Register;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;
import org.openqa.selenium.By;
import utile.ConfigLoader;

import java.time.Duration;

public class LoginTrainer extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;
    private Register register = null;

    @Test
    public void loginTrainer(){

        initTest("Login trainer");
        login = new Login(driver);
        dashboard = new Dashboard(driver);
        register = new Register(driver);

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/propietati/dateUser1.properties");
        String email = configLoader.getProperty("email");
        String parola = configLoader.getProperty("parola");

        login.enterUserName(email);
        login.enterPassword(parola);
        login.clickSubmitButton();

        if (login.errorForbiddenAccessText()){
            login.clickRegisterButton();
            register.registerUser(true);
        }
   //     Assert.assertTrue(dashboard.getUserEmailFromDashBoard().equalsIgnoreCase(email));
    }
}