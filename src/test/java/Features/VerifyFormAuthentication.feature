@TestFour
Feature: Verify Form Authentication on Herokuapp App



  Scenario Outline: Verify Form Authentication using valid credentials
    Given User opens URL "https://the-internet.herokuapp.com"
    When User click on "Form Authentication" link

    Then User should arrive on Login Page
    Then User enter valid "<username>" and "<password>"
    And User click on the Login button
    Then User should be logged in successfully
Examples:
    | username | password |
    | tomsmith | SuperSecretPassword!|

  Scenario Outline: Verify Form Authentication using invalid credentials
    Given User opens URL "https://the-internet.herokuapp.com"
    When User click on "Form Authentication" link

    Then User should arrive on Login Page
    Then User enter invalid "<username>" and "<password>"
    And User click on the Login button
    Then User should be logged in successfully
    Examples:
      | username | password |
      | johnspencer | johncer|

