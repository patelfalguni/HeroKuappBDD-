Feature: Verify Basic Auth on Herokuapp App

  @TestThree
  Scenario: Verify Basic Auth

    Given User opens URL "https://the-internet.herokuapp.com/"
    When User click on "Basic Auth" link
    And User opens URL "https://admin:admin@the-internet.herokuapp.com/basic_auth"


    Then User should see "Basic Auth" text on the page
    Then User should see "Congratulations! You must have the proper credentials." text on the page



  Scenario: Verify Basic Auth with invalid credentials

    Given User opens URL "https://the-internet.herokuapp.com/"
    When User click on "Basic Auth" link
    And User opens URL "https://admin:admin1@the-internet.herokuapp.com/basic_auth"


    Then User should see "Basic Auth" text on the page
    Then User should see "Congratulations! You must have the proper credentials." text on the page