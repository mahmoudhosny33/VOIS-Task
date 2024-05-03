import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import utilities.DriverSetup;

public class BaseTest {
    WebDriver driver;
    SoftAssert softAssert;




    @BeforeMethod
    public void beforeTest(){
        softAssert=new SoftAssert();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver=DriverSetup.setUp("chrome");
    }
    @AfterMethod
    public void afterTest(){
       //driver.close();
    }
}
