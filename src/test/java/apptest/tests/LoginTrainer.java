package apptest.tests;

import Actions.Dashboard;
import Actions.Login;
import Actions.Register;
import org.testng.annotations.Test;
import utile.ConfigLoader;

public class LoginTrainer extends BaseAppTest {

    private Login login = null;
    private Dashboard dashboard = null;
    private Register register = null;

    @Test
    public void loginTrainer(){

        initTest("Login trainer");
        login = new Login(driver);
        dashboard = new Dashboard(driver);
        register = new Register(driver);

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");
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