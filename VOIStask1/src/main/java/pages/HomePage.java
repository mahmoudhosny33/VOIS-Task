package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utilities.BrowserActions;

public class HomePage extends BasePage {

    /*********** Elements Locators ***********/

    String nameOfTheSelectedItem;

    By amazonLogo=By.cssSelector("img#c");
     By searchTextBox= By.xpath("//input[@id='twotabsearchtextbox']");

     By searchButton= By.xpath("//input[@value='Go']");

     //first Item In Home Page And Last Item Added In The Cart
     By firstItem=By.xpath("(//img[@class='s-image'])[1]");
     By lastItemAddedToCart=By.xpath("(//img[@class='sc-product-image'])[1]");
    By addToCartBtn=By.xpath("//input[@id='add-to-cart-button']");


    By theCartIcon=By.xpath("//a[@id='nav-cart']");
    ///////////////////////////////////////////////////////////

    By todayDealsButton=By.xpath("//div[@id='nav-xshop']//a[1]");
    By groceryOption=By.xpath("(//span[contains(text(),'Grocery')])[3]");
    By headphonesOption=By.xpath("//span[contains(text(),'Headphones')]");
    By discountOption=By.xpath("(//span[contains(text(),'10% off')])");

    By secondPageButton=By.xpath("//ul[@class='a-pagination']//a[contains(text(),'2')]");
    By thirdPageButton=By.xpath("//ul[@class='a-pagination']//a[contains(text(),'3')]");

    By selectItemFromFourthPage=By.xpath("(//div[contains(@class,'Deal')])[1]//img");


    By dismissAdress=By.xpath("//span[contains(text(),'Dismiss')]//..//input");






    /*********** page Constructor**************/
    public HomePage(WebDriver driver){
        super(driver);
    }

    /************** Page Functions ****************/

    public void enterTextInSearchBox(String text){ BrowserActions.sendKey(driver,searchTextBox,text);}

    public void clickOnSearchButton(){ BrowserActions.clickButton(driver,searchButton);}
    public void clickAmazonLogo(){BrowserActions.clickButton(driver,amazonLogo);}

    public void selectFirstItem(){
        BrowserActions.executeWait( driver, firstItem);
        nameOfTheSelectedItem=driver.findElement(firstItem).getAttribute("alt");
        BrowserActions.clickButton(driver,firstItem);
    }
    public void clickOnAddToCartBtn(){
        BrowserActions.clickButton(driver,addToCartBtn);
    }
    public void goToTheCart(){
        BrowserActions.clickButton(driver,theCartIcon);
    }
    public Boolean check_that_item_is_added_successfully(){

        BrowserActions.executeWait( driver, lastItemAddedToCart);
        String item=driver.findElement(lastItemAddedToCart).getAttribute("alt");
        if(nameOfTheSelectedItem.equals(item))
            return true;
        else
            return false;

    }
    //////////////////////////////////////////////////

     public void clickOnTodayDealsButton(){
        BrowserActions.clickButton(driver,dismissAdress);
        BrowserActions.clickButton(driver,todayDealsButton);
    }

    public void selectHeadphonesAndGroceryOption(){
        BrowserActions.clickButton(driver,headphonesOption);
        BrowserActions.clickButton(driver,groceryOption);
    }
    public void clickOnDiscountOption(){
        BrowserActions.clickButton(driver,discountOption);
    }
    public void addItemFromFourthPageToTheCart(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            BrowserActions.clickButton(driver,thirdPageButton);
            BrowserActions.clickButton(driver,selectItemFromFourthPage);
            clickOnAddToCartBtn();

    }




}
