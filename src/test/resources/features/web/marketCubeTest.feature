@TaskProvided
Feature:  Market cube
  Background:
    Given User is at market cube site
    When User enters the email and password
    Then User selects vendor from the menu and select creation of vendor using forms

  Scenario:  Create vendor using form
    When Fill the Vendor details
    And User log out the seller
    Then copy the password from the mail and Login with the password
    When Generate the password
    And User login with new password
    Then Verify the user is on Dashboard screen

     Scenario: Create a vendor with already registered email
      When Fill the form with already registered email
      Then Verify the text that user is already registered



