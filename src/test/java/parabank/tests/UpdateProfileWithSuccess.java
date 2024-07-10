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

        login.enterUserName("ioanpopa");
        login.enterPassword("1234");
        Overview overviewPage = login.clickSubmitButton();

        UpdateProfile updateProfilePage = overviewPage.updateProfile();

        Assert.assertEquals(driver.getCurrentUrl(),"https://parabank.parasoft.com/parabank/updateprofile.htm");

        updateProfilePage.writeFirstName("Ioan");
        updateProfilePage.writeLastName("Popa");
        updateProfilePage.writeStreet("Ploiesti 21");
        updateProfilePage.writeCity("Cluj");
        updateProfilePage.writeState("Romania");
        updateProfilePage.writeZipCode("400380");
        updateProfilePage.writePhoneNumber("456789");



        updateProfilePage.writeFirstName("Ion");
        updateProfilePage.writeLastName("Pop");
        updateProfilePage.writeStreet("Constanta 21");
        updateProfilePage.writeCity("Cluj-Napoca");
        updateProfilePage.writeState("RO");
        updateProfilePage.writeZipCode("123456");
        updateProfilePage.writePhoneNumber("0234567");
        updateProfilePage.clickUpdateProfile();

        Assert.assertTrue(updateProfilePage.successfulUpdateProfileTextExists());

        Assert.assertEquals(updateProfilePage.successfulUpdateProfileText(),"Your updated address and phone number have been added to the system.");

    }

}
