Feature: Verify Dropdown link on Herokuapp

  @TestFive
  Scenario: Verify Dropdown
    Given User opens URL "https://the-internet.herokuapp.com"
    When User click on "Dropdown" link
    Then User should arrive on Dropdown page
    And User should see "Dropdown List" text on the page
    Then User select Option 1 from Dropdown List
    