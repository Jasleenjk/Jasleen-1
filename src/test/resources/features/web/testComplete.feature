
Feature: Explore through Google

  Scenario: Search for "Test Complete Web orders"
    Given User is on google
    When User types
    And press Enter from keyboard
    Then User lands on the page with links
    When User clicks on the first link
    Then The page loads
    When User Clicks on another link in description para
    Then Another page loads
    When User enters username and password
    And Click on login button
    Then List of web orders appear
    Then TableList





