package Steps;

import Pages.TestCompletePage;
import Utilities.ConfigLoader;
import com.typesafe.config.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;

public class TestCompleteSteps {


    Config conf= ConfigLoader.load();

    TestCompletePage page;

    @And("^Click on login button$")
    public void clickOnLoginButton() {
        page.clickLoginBtn();


    }

    @Given("^User is on google$")
    public void userIsOnGoogle() {
        page.userIsOnGooglePage();
    }

    @When("^User types$")
    public void userTypes() {
        page.searchAtGoogle();
    }

    @And("^press Enter from keyboard$")
    public void pressEnterFromKeyboard() throws AWTException {
        page.pressEnter();
        
    }

    @Then("^User lands on the page with links$")
    public void userLandsOnThePageWithLinks() {

    }

    @When("^User clicks on the first link$")
    public void userClicksOnTheFirstLink() {
        page.clickLinkBrowser();
        
    }

    @Then("^The page loads$")
    public void thePageLoads() {
        
    }

    @When("^User Clicks on another link in description para$")
    public void userClicksOnAnotherLinkInDescriptionPara() {
        page.clickDescriptionLink();
        
    }

    @Then("^Another page loads$")
    public void anotherPageLoads() {

        
    }

    @When("^User enters username and password$")
    public void userEntersUsernameAndPassword() {
        page.enterUserNameAndPassword();
        
    }

    @Then("^List of web orders appear$")
    public void listOfWebOrdersAppear() {
        page.printTable();


    }


    @Then("^TableList$")
    public void tablelist() {
        page.table();

    }

}
