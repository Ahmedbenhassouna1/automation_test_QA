@login2
Feature: Login with incorrect credntial
  I want to login using an incorrect credentials

  Background: 
    Given I visit the platform automationexercise
    Then Verify that home page is visible
    When I click on the button Signup Login

  @loginWithInCorrectId
  Scenario Outline: I want to login using an invalid account
    Then Verify Login to your account visible
    When I type an ivalid email "<email address>"
    And I type an ivalid password "<password>"
    And I click on button login signup
    Then Verify error Your email or password is incorrect! is visible
    

    Examples: 
      | email address   | password |
      | ahmed@gmail.com |  1123000 |
