package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
    static WebDriver driver;
    public static WebDriver setUp(String name){
        String option=name;
        option=name.toLowerCase();
        switch (option){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                break;
        }
        driver.navigate().to("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb&fbclid=IwZXh0bgNhZW0CMTAAAR26tOhwKOFB-_6ReAoW07WPTHifKasfrA6PYFLyjoV464e0WSUSsdx15DM_aem_AXLnlRSkvzZ7y2tRI4SxzJ_M_kok5kQGlFLU1lkDEe9TaouJuO_HS5r95vS0k4Jtr-laIDApehlijCs1z6SN296E");


        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.manage().deleteAllCookies();
        return driver;

    }
}
