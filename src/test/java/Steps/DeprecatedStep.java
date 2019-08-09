package Steps;

import Pages.DeprecatedPage;
import Pages.TestCompletePage;
import Utilities.ConfigLoader;
import com.typesafe.config.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeprecatedStep {

    Config conf= ConfigLoader.load();

    DeprecatedPage pageobject;



    @Given("^User is on Overview page$")
    public void userIsOnOverviewPage() {
       pageobject.userIsOnOverViewPage();

    }

    @When("^User clicks on the Deprecated tab$")
    public void userClicksOnTheDeprecatedTab() throws Exception{
        pageobject.userClicksOnDeprecatedTab();

    }

    @Then("^It redirects user to another page of Deprecated List$")
    public void itRedirectsUserToAnotherPageOfDeprecatedList() {
    }

    @And("^User gets the Data which lies under Depricated interfaces on console$")
    public void userGetsTheDataWhichLiesUnderDepricatedInterfacesOnConsole() {
pageobject.getTheDataOnConsole();
    }


}
