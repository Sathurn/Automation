package apptest.tests;

import Actions.SimpleActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest extends BaseAppTest {

    @Test
    public void firstTest(){

        initTest("Sample Test");

        String expectedText = "Loin";
        SimpleActions simpleActions = new SimpleActions(driver);
        String loginText = simpleActions.getLoginText();

        Assert.assertEquals(loginText.toLowerCase(), expectedText.toLowerCase());
        Assert.assertTrue(loginText.equalsIgnoreCase(expectedText));

        System.out.println(loginText);
        System.out.println(expectedText);
    }
}
