@login3
Feature: Login with an existing email
  I want to login using an existing email

  Background: 
    Given I visit the platform automationexercise
    Then Verify that home page is visible
    When I click on the button Signup Login
    Then Verify New User Signup is visible

  @registerUserWithExistingEmail
  Scenario Outline: I want to login using an existing account
    When I type a name "<name>"
    And I type an existing email "<email>"
    And I click on button signup
    Then Verify error Email Address already exist! is visible

    Examples: 
      | name   | email |
      |  Ahmed Ben hassouna|  ahmedbnh01@gmail.com |
