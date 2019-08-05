package Pages;

import Utilities.ConfigLoader;
import com.typesafe.config.Config;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class makeMyTripPage extends PageObject {
    @FindBy(xpath = "//span[text()='From']")
    WebElement from;
    @FindBy(xpath = "//input[@aria-expanded=\"true\"]")
    WebElement fromSearch;
    @FindBy(xpath = "//p[text()=\"Mumbai, India\"]")
    WebElement fromText;
    @FindBy(xpath = "//label[@for=\"departure\"]")
WebElement startDate;
    @FindBy(xpath = "(//div[@class=\"dateInnerCell\"]/p[text()='8'])[1]")
    WebElement selectStartDate;
    @FindBy(xpath = "//span[@class=\"lbl_input latoBold appendBottom10\"][text()=\"RETURN\"]")
    WebElement returnDate;
    @FindBy(xpath = "(//div[@class=\"dateInnerCell\"]//p[text()=\"1\"])[2]")
    WebElement selectReturenDate;
    @FindBy(xpath = "//label[@for=\"travellers\"]")
    WebElement selectTraveller;
    @FindBy(xpath = "(//div[@class='travellers']//li[text()='2'])[1]")
    WebElement selectAdult;
    @FindBy(xpath = "(//div[@class='travellers']//li[text()='2'])[2]")
    WebElement selectChildren;
    @FindBy(xpath = "(//div[@class='travellers']//li[text()='1'])[3]")
    WebElement selectInfant;
    @FindBy(xpath = "//li[text()=\"Business\"]")
    WebElement travellerClass;
@FindBy(xpath = "//button[text()=\"APPLY\"]")
WebElement applyButton;
@FindBy(xpath = "//a[text()=\"Search\"]")
WebElement searchButton;
@FindBy(xpath = "//div[@class=\"pull-right marL5 text-right split-price-sctn\"]")
WebElement listOfPrice;

    public static Config conf = ConfigLoader.load();

    public static void setEnvironMent(String environment) {
        System.setProperty("env", environment);
        conf = ConfigLoader.load();
    }

    public void userIsOnMakeMyTripPage() {
        setEnvironMent("test");
        getDriver().get(conf.getString("base_url"));
        getDriver().manage().window().maximize();
    }
    public void userSelectFrom(){
        from.click();
        fromSearch.sendKeys("Bombay");
        fromText.click();

    }
    public void userSelectDate(){
        waitABit(20);
        startDate.click();
        selectStartDate.click();

//        WebElement cross=getDriver().findElement(By.xpath("webklipper-publisher-widget-container-notification-close-div"));
//
//        if(cross.isDisplayed()){
//cross.click();
//        }

waitABit(20);
        returnDate.click();
        selectReturenDate.click();

    }
    public void userSelectTraveller(){
        waitABit(20);
        selectTraveller.click();
        selectAdult.click();
        selectChildren.click();
        selectInfant.click();
        travellerClass.click();
        applyButton.click();

    }
    public void userClickOnSearchButton()
    {
        waitABit(50);
        searchButton.click();
    }
    public void priceList(){
    listOfPrice.getText();
    }

}