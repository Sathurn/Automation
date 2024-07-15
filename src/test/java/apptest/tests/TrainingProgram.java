package apptest.tests;

import Actions.Dashboard;
import Actions.Login;
import Actions.Training;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utile.ConfigLoader;

public class TrainingProgram extends BaseAppTest {

    private Login login = null;
    private Dashboard dashboard = null;

    private RegisterUser registerUser = null;
    private Training training;



    @BeforeTest
    public void setup(){


    }

    @Test
    public void openTrainingTab(){

        initTest("Training program");
        login = new Login(driver);
        dashboard = new Dashboard(driver);
        registerUser = new RegisterUser();
        training = new Training(driver);

        login();
        dashboard.clickTrainingButton();
        training.clickGenerateProgramButton();


    }

    private void login() {

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");
        String email = configLoader.getProperty("email");
        String parola = configLoader.getProperty("parola");

        loginActions(email, parola);

        if(login.errorForbiddenAccessText()){
            login.clickRegisterButton();
            registerUser.registerUser(true);

            loginActions(email,parola);
        }

        Assert.assertTrue((dashboard.getUserEmailFromDashboard().equalsIgnoreCase(email)));

    }

    private void loginActions(String email, String parola) {
        login.enterUserName(email);
        login.enterPassword(parola);
        login.clickSubmitButton();
    }
}