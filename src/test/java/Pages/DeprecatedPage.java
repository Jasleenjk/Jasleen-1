package Pages;

import Utilities.ConfigLoader;
import com.typesafe.config.Config;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class DeprecatedPage extends PageObject {

    @FindBy(xpath = "(//a[contains(text(), 'Deprecated')]/@href)[1]")

    public WebElement linkDeprecated;

    @FindBy(xpath = "//table[@summary='Deprecated Interfaces table, listing deprecated interfaces, and an explanation']//span")
    public WebElement data;


    public static Config conf = ConfigLoader.load();

    public static void setEnvironMent(String environment) {
        System.setProperty("env", environment);
        conf = ConfigLoader.load();
    }

    public void userIsOnOverViewPage() {
        setEnvironMent("test");
        getDriver().get(conf.getString("base_url"));
        getDriver().manage().window().maximize();
    }

    public void userClicksOnDeprecatedTab() throws Exception {
        // getDriver().switchTo().parentFrame();
        // WebElement frame1 = getDriver().findElement(By.name("classFrame"));
//        getDriver().switchTo().frame(getDriver().findElement(By.xpath("//frameset[@title=\"Documentation frame\"]")));
        WebElement frame = getDriver().findElement(By.name("classFrame"));
        getDriver().switchTo().frame(frame);
        Actions act = new Actions(getDriver());
        act.click(linkDeprecated);
    }

    public void getTheDataOnConsole() {
        System.out.println(data);
    }
}