@TaskProvided
Feature:  Market cube
  Scenario:  Create vendor using form
    Given User is at market cube site
    When User enters the email and password
    Then User redirects to Dashboard screen
     When User selects vendor from the menu and select creation of vendor using forms
   And Fill the Vendor details
   Then User should be registered successfully
    When User log out the seller
    Then User verify the vendor
   And copy the password from the mail and Login with the password
    Then Generate the password
     When User login with new password
  Then Verify the user is on Dashboard screen

    Scenario: Create a vendor with already registered email
      Given User is at market cube login page
      When User enters the seller email and password
      Then User redirects to Dashboard screen
      When User selects vendor from the menu and select creation of vendor using forms
      And Fill the form with already registered email
      Then Verify the text that user is already registered



