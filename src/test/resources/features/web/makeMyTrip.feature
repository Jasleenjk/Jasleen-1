@smoke
  Feature: Book a Flight on Make my trip and pint price on console
    Scenario: Print price on console
    Given User is on Make My Trip site
  When user select  from dropdown Bombay
      And select To dropdown Bangalore
      And select Departure and Return Date
      And select Traveller&Class dropdown  adult  children  infant and business class
      When Click on search button
      Then user gets the price list of flights on the console

