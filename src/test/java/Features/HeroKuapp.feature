Feature: HeroKuapp

@TestOne
  Scenario: Successful Navigate to HeroKuapp home page

    When User opens URL "https://the-internet.herokuapp.com"
    Then User click on the Checkboxes
    And Checkboxes page should be open
