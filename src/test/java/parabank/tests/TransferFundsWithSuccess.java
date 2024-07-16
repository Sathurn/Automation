package parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.actions.AccountOverview;
import parabank.actions.Login;
import parabank.actions.Overview;
import parabank.actions.TransferFunds;

public class TransferFundsWithSuccess extends BaseParaBankTest{

    private Login login;

    @Test
    public void TransferFundsSuccessfully() {

        login = new Login(driver);

        initTest("Transfer Funds (with success)");

        login.enterUserName("q");
        login.enterPassword("q");
        Overview overviewPage = login.clickSubmitButton();

        TransferFunds transferFunds = overviewPage.transferFunds();

        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/transfer.htm");

        transferFunds.writeAmount("12");
        transferFunds.fromAccountFirst();
        transferFunds.toAccountLast();

        transferFunds.clickTransferFundsButton();

        Assert.assertEquals(transferFunds.successfulTransferFundsTitleText(),"Transfer Complete!");

        //Compose success message
//        String amount_value = transferFunds.successfulTransferFundsAmountText();
//        String text1 = transferFunds.successfulTransferFundsText1Text();
//        String fromAccount = transferFunds.successfulTransferFundsFromAccountText();
//        String text2 = transferFunds.successfulTransferFundsText2Text();
//        String toAccount = transferFunds.successfulTransferFundsToAccountText();
//        String text3 = transferFunds.successfulTransferFundsText3Text();
//
//        String transferMessageSuccessfully = "$" + amount_value + ".00" + text1 + " #" + fromAccount +  text2 + " #" + toAccount + text3;



        Assert.assertEquals(transferFunds.completeMessageText(),"$12.00 has been transferred from account #15120 to account #15120.");

        AccountOverview accountOverview = overviewPage.accountOverview();
//        if(accountOverview.footerNotePresence()) {
//            for (int i = 0; i < accountOverview.getAccountList().length; i++) {
//                System.out.println(accountOverview.getAccountList() + " ");
//            }
//        }
        System.out.println(accountOverview.getAccountList() + " ");

    }
}
