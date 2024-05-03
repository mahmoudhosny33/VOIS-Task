import org.testng.annotations.Test;
import pages.HomePage;

public class DataProviderTest extends BaseTest{
    @Test
    public void check_that_item_is_added_successfully() throws InterruptedException {

        HomePage homePage=new HomePage(driver);
        //homePage.clickAmazonLogo();
        //Thread.sleep(4000);
        homePage.enterTextInSearchBox("car accessories");
        homePage.clickOnSearchButton();
        homePage.selectFirstItem();
        homePage.clickOnAddToCartBtn();
        homePage.goToTheCart();
        softAssert.assertTrue(homePage.check_that_item_is_added_successfully());
        //////////////////////////////////////
    }
    @Test
    public void check_that_Added_item_from_FourthPage() throws InterruptedException {
        HomePage homePage=new HomePage(driver);
        Thread.sleep(4000);
        homePage.clickOnTodayDealsButton();
        homePage.selectHeadphonesAndGroceryOption();
        homePage.clickOnDiscountOption();
        homePage.addItemFromFourthPageToTheCart();
    }
}
