package Steps;

import Pages.marketCubeTestPage;
import Utilities.ConfigLoader;
import com.typesafe.config.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.marketCubeTestPage;
import Utilities.ConfigLoader;

public class marketCubeTestStep {

    public static Config conf= ConfigLoader.load();
    marketCubeTestPage pageTestObj;

    @Given("^User is at market cube site$")
    public void userIsAtMarketCubeSite() {
        pageTestObj.userIsOnMarketCubeLogin();

    }


    @When("^User enters the email and password$")
    public void userEntersTheEmailAndPassword() {
        pageTestObj.userEnterEmailPassword();
        pageTestObj.userClickOnLoginBtn();

    }


    @Then("^User redirects to Dashboard screen$")
    public void userRedirectsToDashboardScreen() {


    }

    @Given("^User is at Dashboard screen$")
    public void userIsAtDashboardScreen() {
        
    }

    @When("^User selects vendor from the menu and select creation of vendor using forms$")
    public void userSelectsVendorFromTheMenuAndSelectCreationOfVendorUsingForms() {
        pageTestObj.userSelectsVendorForm();
        
    }

    @And("^Fill the Vendor details$")
    public void fillTheVendorDetails() {
        pageTestObj.userFillstheVendorForm();
        
    }

    @Then("^User should be registered successfully$")
    public void userShouldBeRegisteredSuccessfully() {

        
    }

    @When("^User log out the seller$")
    public void userLogOutTheSeller() {
        pageTestObj.userClicksTheLogOutBtn();
        
    }

    @And("^copy the password from the mail and Login with the password$")
    public void copyThePasswordFromTheMailAndLoginWithThePassword() {
        pageTestObj.userOpensTheMail();
        pageTestObj.userVerifyTheUser();
        pageTestObj.userCopiesThePassword();
        
    }

    @Then("^Generate the password$")
    public void generateThePassword() {
        pageTestObj.userToChangeThePassword();
        
    }

    @When("^User login with new password$")
    public void userLoginWithNewPassword() {
        pageTestObj.userLoginWithNewPassword();
    }

    @Then("^Verify the user is on Dashboard screen$")
    public void verifyTheUserIsOnDashboardScreen() {
        pageTestObj.assertThatUserIsOnDashBoard();
    }

    @Then("^User verify the vendor$")
    public void userVerifyTheVendor() {

    }

    @And("^Fill the form with already registered email$")
    public void fillTheFormWithAlreadyRegisteredEmail() {
        pageTestObj.userCreateAUserWhichIsAlreadyRegistered();

    }

    @Then("^Verify the text that user is already registered$")
    public void verifyTheTextThatUserIsAlreadyRegistered() {
        pageTestObj.userVerifyThatUserIsAlredyRegistered();


    }

    @When("^User selects vendor from the menu and select creation of vendor with already registered email$")
    public void userSelectsVendorFromTheMenuAndSelectCreationOfVendorWithAlreadyRegisteredEmail() {


    }

//    @When("^User enters the  seller email and password$")
//    public void userEntersTheSellerEmailAndPassword() {
//
//
//        pageTestObj.userEnterSellerEmail();
//        pageTestObj.userClickOnLoginBtn();
//
//    }

    @Given("^User is at market cube login page$")
    public void userIsAtMarketCubeLoginPage() {
        pageTestObj.userIsOnMarketCubeLogin();

    }

    @When("^User enters the seller email and password$")
    public void userEntersTheSellerEmailAndPassword() {
        pageTestObj.userEnterSellerEmail();
        pageTestObj.userClickOnLoginBtn();
    }
}


