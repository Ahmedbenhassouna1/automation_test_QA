@login
Feature: Login with correct credntial
  I want to login using a correct credentials

  Background: 
    Given I visit the platform automationexercise
    Then Verify that home page is visible
    When I click on the button Signup Login
    Then Verify New User Signup is visible

  @loginWithCorrectId
  Scenario Outline: I want to login using a valid account
    When I type a valid email "<email address>"
    And I type a valid password "<password>"
    And I click on button login
    Then Verify that Logged in as username is visible

    Examples: 
      | email address        | password |
      | ahmedbnh01@gmail.com |   123456 |
