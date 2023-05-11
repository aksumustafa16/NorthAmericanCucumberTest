Feature: Wrong credential negative login test

  @login @db
  Scenario: Login as a costumer
    Given the user in on the main page
    When the user click the login button
    And the user enter wrong credentials
    Then the user should not be able to login



