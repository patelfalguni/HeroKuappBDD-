Feature: Verify Forgot Password on Herokuapp

  @TestSix
  Scenario: Verify Forgot Password
    Given User opens URL "https://the-internet.herokuapp.com/"
    When User click on "Forgot Password" link
    Then User should arrive on Forgot Password page
    And User should see "Forgot Password" text on the page
    And User click on Retrieve password button
    Then User should see "Internal Server Error" text on the page