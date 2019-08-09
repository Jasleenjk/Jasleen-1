package Pages;

import Utilities.ConfigLoader;
import Utilities.LoadProperties;
import com.typesafe.config.Config;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import Utilities.ConfigLoader;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static Utilities.LoadProperties.getValueFromPropertyFile;

public class marketCubeTestPage extends PageObject {




    @FindBy(xpath = "//input[@id='email']")
     public WebElement emailLoginField;
    @FindBy(xpath = "//input[@id='password']")
   public WebElement passwordLoginField;
    @FindBy(id = "submitButton")
    public WebElement loginBtn;
    @FindBy(css = "div>[class='Polaris-Header-Action']")
    public WebElement menuDropDown;
    @FindBy(xpath = "//div[text()='Vendors']")
    public WebElement selectVendor;
    @FindBy(xpath = "//div[@class='Polaris-Page-Header__MainContent']/div[@class='Polaris-Page-Header__PrimaryAction']//span[text()='Add Vendors']")
    public WebElement addVendorBtn;
    @FindBy(id = "createVendorType")
    public WebElement createVendorForm;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailField;
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phnoneNumber;
    @FindBy(xpath = "//input[@id='brandName']")
    public WebElement brandName;
    @FindBy(xpath = "//input[@id='address']")
    public WebElement streetAddress;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityName;
    @FindBy(xpath = "//input[@id='country']")
    public WebElement countryName;
    @FindBy(xpath = "//input[@id='pinCode']")
    public WebElement pinCode;
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement autoVerifyUnclick;
    @FindBy(xpath = "//button[@id='createSubmitButton']")
    public WebElement submitBtn;
    @FindBy(xpath = "//p[text()='Seller']")
WebElement seller;
@FindBy(xpath = "//div[text()='Log Out']")
WebElement logoutBtn;
@FindBy(xpath = "//input[@id='inboxfield']")
WebElement inboxField;
@FindBy(xpath = "//button[@id='go_inbox1']")
WebElement goBtn;
@FindBy(xpath = "(//body//td//a[contains(text(),'Welcome to mc-testautomationstore')])[1]")
        WebElement loginMail;
@FindBy(xpath = "(//body//td//a[contains(text(),'Complete your mc-testautomationstore registration')])[1]")
WebElement registrationMail;
@FindBy(xpath = "//a[text()='Verify Email']")
        WebElement verifyEmail;

@FindBy(xpath = "//div[@id='password']")
        WebElement passwordCopy;
//@FindBy(xpath = "//a[text()='Login']")
        //WebElement loginBtnForNewPassword;
    @FindBy(xpath = "//input[@id='newPassword']")
        WebElement newPassword;
    @FindBy(xpath = "//input[@id='confirmNewPassword']")
            WebElement confirmNewPassword;
    @FindBy(xpath = "//span[text()='Submit']")
            WebElement submitBtnforNewPassword;
    @FindBy(xpath = "//h1[text()='Dashboard']")
            WebElement dashboard;
    @FindBy(xpath = "//p[text()='Already registered email.']")
            WebElement alreadyRegistered;
@FindBy(xpath = "//p[text()='Vendor']")
        WebElement vendorLogout;

    String emailId=getSaltString()+"@mailinator.com";




    public static Config conf = ConfigLoader.load();

    public static void setEnvironMent(String environment) {
        System.setProperty("env", environment);
        conf = ConfigLoader.load();
    }

    public void userIsOnMarketCubeLogin() {
        setEnvironMent("test");
        getDriver().get(conf.getString("base_url"));
        getDriver().manage().window().maximize();
    }
    public void userEnterEmailPassword()
    {

        waitFor(emailLoginField).withTimeoutOf(20, TimeUnit.SECONDS);
        String emailLoginFieldValue=getValueFromPropertyFile("testData","emailLoginField");
        emailLoginField.sendKeys(emailLoginFieldValue);


        waitFor(passwordLoginField).withTimeoutOf(20,TimeUnit.SECONDS);
        String passwordLoginFieldValue=getValueFromPropertyFile("testData","passwordLoginField");
        passwordLoginField.sendKeys(passwordLoginFieldValue);


    }

    public void userEnterSellerEmail()
    {


        waitFor(emailLoginField).withTimeoutOf(20, TimeUnit.SECONDS);
        String emailLoginFieldValue=getValueFromPropertyFile("testData","emailLoginField");
        emailLoginField.sendKeys(emailLoginFieldValue);


        waitFor(passwordLoginField).withTimeoutOf(20,TimeUnit.SECONDS);
        String passwordLoginFieldValue=getValueFromPropertyFile("testData","passwordLoginField");
        passwordLoginField.sendKeys(passwordLoginFieldValue);


    }
    public  void userClickOnLoginBtn()
    {
        waitFor(loginBtn).waitUntilClickable().click();

    }
    public void userSelectsVendorForm()
    {

        withTimeoutOf(100,TimeUnit.SECONDS).waitFor(menuDropDown).waitUntilClickable();
        menuDropDown.click();
        waitFor(selectVendor).withTimeoutOf(10,TimeUnit.SECONDS);
        selectVendor.click();


       waitFor(addVendorBtn).withTimeoutOf(20,TimeUnit.SECONDS);
       addVendorBtn.click();
       waitFor(createVendorForm).withTimeoutOf(20,TimeUnit.SECONDS);
        Select vendorForm=new Select(createVendorForm);
        vendorForm.selectByVisibleText("Create vendors yourself using our form");
    }
    public void userFillstheVendorForm()
    {
        waitABit(60);
        String firstNameValue = getValueFromPropertyFile("testData", "firstName");
        firstName.sendKeys( firstNameValue);
        String lastNameValue =getValueFromPropertyFile("testData","lastName");
        lastName.sendKeys(lastNameValue);
        emailField.sendKeys(emailId);
        String PhoneNumberValue=getValueFromPropertyFile("testData","PhoneNumber");
        phnoneNumber.sendKeys(PhoneNumberValue );
        String brandNameValue=getValueFromPropertyFile("testData","brandName");
        brandName.sendKeys(brandNameValue);
        String streetAddressValue=getValueFromPropertyFile("testData","streetAddress");
        streetAddress.sendKeys(streetAddressValue);
        String cityNameValue=getValueFromPropertyFile("testData","cityName");
        cityName.sendKeys(cityNameValue);
        String countryNameValue=getValueFromPropertyFile("testData","countryName");
        countryName.sendKeys(countryNameValue);
        String pinCodeValue=getValueFromPropertyFile("testData","pinCode");
        pinCode.sendKeys(pinCodeValue);
        autoVerifyUnclick.click();
        submitBtn.click();

    }
    public void userClicksTheLogOutBtn()
    {
        waitFor(seller).withTimeoutOf(20,TimeUnit.SECONDS).click();
        waitFor(logoutBtn).withTimeoutOf(20,TimeUnit.SECONDS).click();
    }

    public void userOpensTheMail() {

        getDriver().get("https://www.mailinator.com/");
        inboxField.sendKeys(emailId);
        goBtn.click();

    }
    public void userVerifyTheUser() {

        waitFor(registrationMail).withTimeoutOf(50, TimeUnit.SECONDS).click();

        WebElement frame = getDriver().findElement(By.name("msg_body"));
        getDriver().switchTo().frame(frame);
        verifyEmail.click();
        Set<String> tabs = getDriver().getWindowHandles();
        Iterator<String> it = tabs.iterator();
        String id1 = it.next();
        String id2 = it.next();
        getDriver().switchTo().window(id2);

        waitABit(1000);

        getDriver().switchTo().window(id1);

    }

    public void userCopiesThePassword(){
        //Actions action= new Actions(getDriver());
        //action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();

        waitABit(30);

      getDriver().navigate().back();

      waitFor(loginMail).withTimeoutOf(50,TimeUnit.SECONDS).click();
        WebElement frame = getDriver().findElement(By.name("msg_body"));
        getDriver().switchTo().frame(frame);

       String passwordText=passwordCopy.getText().substring(10);

        System.out.println(passwordText);


      getDriver().get("https://test.marketcube.io/");


      waitFor(emailLoginField).withTimeoutOf(20,TimeUnit.SECONDS).sendKeys(emailId);
      waitFor(passwordLoginField).withTimeoutOf(20,TimeUnit.SECONDS).sendKeys(passwordText);
      loginBtn.click();

    }
    public void userToChangeThePassword()
    {
        waitFor(newPassword).withTimeoutOf(50,TimeUnit.SECONDS);
        String newPasswordValue=getValueFromPropertyFile("testData","newPassword");
       newPassword.sendKeys(newPasswordValue);
String confirmPasswordValue=getValueFromPropertyFile("testData","confirmPassword");
confirmNewPassword.sendKeys(confirmPasswordValue);
    submitBtnforNewPassword.click();}
    public void userLoginWithNewPassword()
    {

        waitFor(emailLoginField).withTimeoutOf(20,TimeUnit.SECONDS).sendKeys(emailId);
        String confirmPasswordValue=getValueFromPropertyFile("testData","confirmPassword");

        passwordLoginField.sendKeys(confirmPasswordValue);
        loginBtn.click();
    }
    public void assertThatUserIsOnDashBoard()
    {
        waitFor(dashboard).withTimeoutOf(20,TimeUnit.SECONDS );
        String dasboardtext=dashboard.getText();
        Assert.assertEquals("Dashboard",dasboardtext);
        waitFor(vendorLogout).withTimeoutOf(10,TimeUnit.SECONDS).click();

        waitFor(logoutBtn).withTimeoutOf(20,TimeUnit.SECONDS).click();



    }

    public void userCreateAUserWhichIsAlreadyRegistered()
    {
        waitABit(60);
        String firstNameValue = getValueFromPropertyFile("testData", "firstName");
        firstName.sendKeys( firstNameValue);
        String lastNameValue =getValueFromPropertyFile("testData","lastName");
        lastName.sendKeys(lastNameValue);

        emailField.sendKeys("ty@mailinator.com");
        String PhoneNumberValue=getValueFromPropertyFile("testData","PhoneNumber");
        phnoneNumber.sendKeys(PhoneNumberValue );
        String brandNameValue=getValueFromPropertyFile("testData","brandName");
        brandName.sendKeys(brandNameValue);
        String streetAddressValue=getValueFromPropertyFile("testData","streetAddress");
        streetAddress.sendKeys(streetAddressValue);
        String cityNameValue=getValueFromPropertyFile("testData","cityName");
        cityName.sendKeys(cityNameValue);
        String countryNameValue=getValueFromPropertyFile("testData","countryName");
        countryName.sendKeys(countryNameValue);
        String pinCodeValue=getValueFromPropertyFile("testData","pinCode");
        pinCode.sendKeys(pinCodeValue);
        autoVerifyUnclick.click();
        submitBtn.click();

    }
public void userVerifyThatUserIsAlredyRegistered()
{
    waitFor(alreadyRegistered);
    String emailAlreadyRegistered=alreadyRegistered.getText();
            Assert.assertEquals("Already registered email.",emailAlreadyRegistered);
}

//public void userEnterSellerEmail()
//{
//
//    waitFor(emailLoginField).withTimeoutOf(20, TimeUnit.SECONDS);
//    String emailLoginFieldValue=getValueFromPropertyFile("testData","emailLoginField");
//    emailLoginField.sendKeys(emailLoginFieldValue);
//
//
//    waitFor(passwordLoginField).withTimeoutOf(20,TimeUnit.SECONDS);
//    String passwordLoginFieldValue=getValueFromPropertyFile("testData","passwordLoginField");
//    passwordLoginField.sendKeys(passwordLoginFieldValue);
//
//
//}


    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }


}
