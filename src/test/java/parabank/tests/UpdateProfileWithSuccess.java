package parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.actions.Login;
import parabank.actions.Overview;
import parabank.actions.UpdateProfile;

public class UpdateProfileWithSuccess extends BaseParaBankTest {

    private Login login;

    @Test
    public void updateProfileSuccessfully() {

        login = new Login(driver);

        initTest("Update Profile (with success)");

        login.enterUserName("vpopescu");
        login.enterPassword("1234");
        Overview overviewPage = login.clickSubmitButton();

        UpdateProfile updateProfilePage = overviewPage.updateProfile();

        Assert.assertEquals(driver.getCurrentUrl(),"https://parabank.parasoft.com/parabank/updateprofile.htm");



    }

}
