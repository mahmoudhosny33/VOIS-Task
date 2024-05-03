import org.testng.annotations.Test;
import pages.HomePage;

public class DataProviderTest extends BaseTest{
    @Test
    public void makePayment() throws InterruptedException {

        HomePage homePage=new HomePage(driver);
        homePage.selectPopularRoutes();
        homePage.chooseArrivalDate();
        homePage.clickOnSearchForBusButton();
        homePage.selectSeat();
        homePage.fillBoardingPointsDetails();
        homePage.fillDroppingPointsDetails();
        homePage.fillCustomerDetails("6789125987","ma@gmail.com");
        homePage.fillPassengerDetails("memo","MALE","20","Egypt","123","New Delhi","01/05/2004");
        homePage.clickTermsCheckBox();
        homePage.clickMakePaymentButton();
    }

}
