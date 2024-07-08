package parabank.tests;

import utile.BaseTest;
import utile.ConfigLoader;

public class BaseParaBankTest extends BaseTest {
    public BaseParaBankTest() {
        super(
            new ConfigLoader("src/test/resources/proprietati/parabank/testConfig.properties")
                    .getProperty("parabankUrl")
        );
    }
}
