package pages;

import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserActions;

public class HomePage extends BasePage {

    /*********** Elements Locators ***********/


    By popularRoutesOption=By.xpath("(//div[@class='carousel-caption']//li//a)[17]");

    By arrivalDate=By.xpath("(//a[contains(@class,'state')])[29]");

    By searchByBusButton=By.xpath("//button[contains(text(),'Bus')]");


    By selectSeatButton=By.xpath("(//input[@id='SrvcSelectBtnForward0'])[2]");

    By numberOfAvailableSeat=By.xpath("(//li[@class='availSeatClassS'])[1]");

    By boardingPointsDropDown=By.xpath("(//span[@id='BpFid'])");
    By boardingPointsDropDownOption1=By.xpath("(//input[@id='BoardingPoint886'])");
    //By boardingPointsDropDownOption2=By.xpath("(//input[@id='BoardingPoint887'])");
    By closeBoardingPointsDropDown=By.xpath("(//span[@class='p2'])[2]");

    By droppingPointsDropDown=By.xpath("(//span[@id='DpFid'])");

    By droppingPointsDropDownOption1=By.xpath("(//input[@id='DroppingPoint2498'])");
    By closeDroppingPointsDropDown=By.xpath("(//span[@class='p2'])[3]");

    By customerDetailsButton=By.xpath("(//a[@id='Forwardprofile-tab'])");
    By mobileNumberTextBox=By.xpath("(//input[@id='mobileNo'])");
    By emailIdTextBox=By.xpath("(//input[@id='email'])");

    By passengerNameTextBox=By.xpath("(//input[@id='passengerNameForward0'])");
    By passengerGender=By.xpath("(//select[@name='genderCodeId'])");
    By passengerAgeTextBox=By.xpath("(//input[@id='passengerAgeForward0'])");
    By passengerConcession=By.xpath("(//select[@name='concessionIds'])");
    By passengerCountry=By.xpath("(//select[@name='nationality'])");
    By passengerPassport=By.xpath("//input[@id='passportNoForward0']");
    By passengerIndiaAddress=By.xpath("//textarea[@name='foreignerAddress']");
    By passengerDOB=By.xpath("(//input[@name='dob'])");


    By termsCheckBox=By.xpath("(//input[@id='termsChk'])");
    By makePaymentButton=By.xpath("(//input[@id='PgBtn'])");



    /*********** page Constructor**************/
    public HomePage(WebDriver driver){
        super(driver);
    }

    /************** Page Functions ****************/

    public void selectPopularRoutes(){ BrowserActions.clickButton(driver,popularRoutesOption);}
    public void chooseArrivalDate(){ BrowserActions.clickButton(driver,arrivalDate);}
    public void clickOnSearchForBusButton(){ BrowserActions.clickButton(driver,searchByBusButton);}
    public void selectSeat(){ BrowserActions.clickButton(driver,selectSeatButton);
        BrowserActions.clickButton(driver,numberOfAvailableSeat);
    }
    public void fillBoardingPointsDetails(){
        BrowserActions.clickButton(driver,boardingPointsDropDown);
        BrowserActions.clickButton(driver,boardingPointsDropDownOption1);
      //  BrowserActions.clickButton(driver,boardingPointsDropDownOption2);
      //  BrowserActions.clickButton(driver,closeBoardingPointsDropDown);
        BrowserActions.clickButton(driver,boardingPointsDropDown);
    }
    public void fillDroppingPointsDetails(){
        BrowserActions.clickButton(driver,droppingPointsDropDown);
        BrowserActions.clickButton(driver,droppingPointsDropDownOption1);
       // BrowserActions.clickButton(driver,droppingPointsDropDownOption2);
       // BrowserActions.clickButton(driver,droppingPointsDropDownOption3);
        BrowserActions.clickButton(driver,droppingPointsDropDown);
       // BrowserActions.clickButton(driver,closeDroppingPointsDropDown);
    }
    public void fillCustomerDetails(String mobileNo,String email){
        BrowserActions.clickButton(driver,customerDetailsButton);
        BrowserActions.sendKey(driver,mobileNumberTextBox,mobileNo);
        BrowserActions.sendKey(driver,emailIdTextBox,email);
    }
    public void fillPassengerDetails(String name, String gender, String age, String country,String passport,String address,String DOB){
        BrowserActions.sendKey(driver,passengerNameTextBox,name);
        BrowserActions.sendKey(driver,passengerAgeTextBox,age);
        Select se = new Select(driver.findElement(passengerGender));
        se.selectByVisibleText(gender);
        se=new Select(driver.findElement(passengerConcession));
        se.selectByVisibleText("GENERAL PUBLIC");
        se=new Select(driver.findElement(passengerCountry));
        se.selectByVisibleText(country);
        BrowserActions.sendKey(driver,passengerPassport,passport);
        BrowserActions.sendKey(driver,passengerIndiaAddress,address);
        BrowserActions.sendKey(driver,passengerDOB,DOB);
    }
    public void clickTermsCheckBox(){
        BrowserActions.clickButton(driver,termsCheckBox);
    }
    public void clickMakePaymentButton(){
        BrowserActions.clickButton(driver,makePaymentButton);
    }


}
