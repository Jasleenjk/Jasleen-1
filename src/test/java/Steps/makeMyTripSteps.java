package Steps;

import Pages.makeMyTripPage;
import Utilities.ConfigLoader;
import com.typesafe.config.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class makeMyTripSteps
{
    Config conf= ConfigLoader.load();
    makeMyTripPage pageobject;

    @Given("^User is on Make My Trip site$")
    public void userIsOnMakeMyTripSite() {
        pageobject.userIsOnMakeMyTripPage();
    }

    @When("^user select  from dropdown Bombay$")
    public void userSelectFromDropdownBombay() {
        pageobject.userSelectFrom();

    }

    @And("^select To dropdown Bangalore$")
    public void selectToDropdownBangalore() {

    }

    @And("^select Departure and Return Date$")
    public void selectDepartureAndReturnDate() {
pageobject.userSelectDate();
pageobject.userSelectTraveller();
    }


    @When("^Click on search button$")
    public void clickOnSearchButton() {
        pageobject.userClickOnSearchButton();

    }

    @Then("^user gets the price list of flights on the console$")
    public void userGetsThePriceListOfFlightsOnTheConsole() {
        pageobject.priceList();
    }

    @And("^select Traveller&Class dropdown  adult  children  infant and business class$")
    public void selectTravellerClassDropdownAdultChildrenInfantAndBusinessClass() {
    }
}
