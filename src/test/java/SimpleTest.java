import Actions.SimpleActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    public void firstTest(){

        initTest("Sample Test");

        driver. get("http://apptest.go.ro:9999/login");

        String expectedText = "Loin";
        SimpleActions simpleActions = new SimpleActions(driver);
        String loginText = simpleActions.getLoginText();

        Assert.assertEquals(loginText.toLowerCase(), expectedText.toLowerCase());
        Assert.assertTrue(loginText.equalsIgnoreCase(expectedText));

        System.out.println(loginText);
        System.out.println(expectedText);
    }
}
