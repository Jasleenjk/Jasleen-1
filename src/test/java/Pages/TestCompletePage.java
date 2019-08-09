package Pages;

import Utilities.ConfigLoader;
import com.typesafe.config.Config;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



public class TestCompletePage extends PageObject {

    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement SearchField;
    @FindBy(xpath = "//h3[text()='Web Orders Basic Sample | TestLeft Documentation']")
    public WebElement link;
    @FindBy(xpath = "//a[text()=\"http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx\"]")
    public WebElement descriptionLink;
    @FindBy(css = "input[id='ctl00_MainContent_username']")
    public WebElement userName;
    @FindBy(css = "input[id='ctl00_MainContent_password']")
    public WebElement userPass;
    @FindBy(xpath ="//input[@id='ctl00_MainContent_login_button']")
    public WebElement loginBtn;
//@FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td")
//public WebElement table;
    public static Config conf = ConfigLoader.load();

    public static void setEnvironMent(String environment) {
        System.setProperty("env", environment);
        conf = ConfigLoader.load();
    }

    public void userIsOnGooglePage(){
        setEnvironMent("test");
        getDriver().get(conf.getString("base_url"));
        getDriver().manage().window().maximize();
    }

    public void searchAtGoogle()
    {
        waitFor(SearchField).withTimeoutOf(50,TimeUnit.SECONDS).sendKeys("TestComplete Weborders");
    }
    public  void pressEnter()  {
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
        SearchField.sendKeys(Keys.ENTER);
    }
    public void clickLinkBrowser(){
        waitFor(link).withTimeoutOf(50, TimeUnit.SECONDS).click();
    }
    public void clickDescriptionLink(){

//        WebDriver driver= new ChromeDriver();
//
//        driver.g
        descriptionLink.click();
        Set<String> tabs= getDriver().getWindowHandles();
        //Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = tabs.iterator();
        String id1=it.next();
        String id2=it.next();
        getDriver().switchTo().window(id2);
    }

    public void enterUserNameAndPassword(){
        waitFor(userName).withTimeoutOf(50,TimeUnit.SECONDS).sendKeys("Tester");
        waitFor(userPass).withTimeoutOf(50,TimeUnit.SECONDS).sendKeys("test");

    }
    public void clickLoginBtn()
    {loginBtn.click();}

    public void printTable()
    {
        //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[2]/td[2]
        //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[3]/td[2]
        //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[9]/td[2]
        String beforexpath="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath="]/td[2]";
        String beforxpath2="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath2="]/td[3]";
        String beforexpath3="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath3="]/td[4]";
        String beforexpath4="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath4="]/td[5]";
        String beforexpath5="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxapath5="]/td[6]";
        String beforexpath6="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxapth6="]/td[7]";
        String beforexpath7="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath7="]/td[8]";
        String beforexpath8="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath8="]/td[9]";
        String beforexpath9="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath9="]/td[10]";
        String beforexpath10="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath10="]/td[11]";
        String beforexpath11="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";
        String afterxpath11="]/td[12]";
        for(int i=2;i<=9;i++) {
            String actualXpath = beforexpath + i + afterxpath;
            WebElement element = getDriver().findElement(By.xpath(actualXpath));
            String actualXpath2 = beforxpath2 + i + afterxpath2;
            WebElement element2 = getDriver().findElement(By.xpath(actualXpath2));
            String actualXpath3 = beforexpath3 + i + afterxpath3;
            WebElement element3 = getDriver().findElement(By.xpath(actualXpath3));
            String actualXpath4 = beforexpath4 + i + afterxpath4;
            WebElement element4 = getDriver().findElement(By.xpath(actualXpath4));
            String actualXpath5 = beforexpath5 + i + afterxapath5;
            WebElement element5 = getDriver().findElement(By.xpath(actualXpath5));
            String actualXpath6 = beforexpath6 + i + afterxapth6;
            WebElement element6 = getDriver().findElement(By.xpath(actualXpath6));
            String actualXpath7 = beforexpath7 + i + afterxpath7;
            WebElement element7 = getDriver().findElement(By.xpath(actualXpath7));
            String actualXpath8 = beforexpath8 + i + afterxpath8;
            WebElement element8 = getDriver().findElement(By.xpath(actualXpath8));
            String actualXpath9 = beforexpath9 + i + afterxpath9;
            WebElement element9 = getDriver().findElement(By.xpath(actualXpath9));
            String actualXpath10 = beforexpath10 + i + afterxpath10;
            WebElement element10 = getDriver().findElement(By.xpath(actualXpath10));
            String actualXpath11 = beforexpath11 + i + afterxpath11;
            WebElement element11 = getDriver().findElement(By.xpath(actualXpath11));

            System.out.println(element.getText() + "   " + element2.getText() + "   " + element3.getText() + "   " + element4.getText() + "   " + element5.getText() + "   " + element6.getText() + "   " + element7.getText() + "   " + element8.getText() + "   " + element9.getText() + "   " + element10.getText() + "   " + element11.getText());


        }
    }
    public void table(){
       // Dimension size = getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']")).getSize();

      //  System.out.println(size);
        int row=getDriver().findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr")).size();
    int coloumn=getDriver().findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[1]/*")).size();
        System.out.println("Number of Rows"+row);
        System.out.println("Number of coloumns"+coloumn);
    //method to print the data of rows and coloumn of our choice.
        for(int i=2;i<=row;i++)
    {
        for(int j=2;j<coloumn;j++)
        {
            System.out.println(getDriver().findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText()+" ");
        }
        System.out.println();


    }
}



}
