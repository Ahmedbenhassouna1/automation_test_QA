@logout
Feature: Logout
  I want to logout 
  
@logoutUser

 Scenario Outline: I want to logout

    Given I visit the platform automationexercise
    Then Verify that home page is visible
    When I click on the button Signup Login
    Then Verify New User Signup is visible
    When I type a valid email "<email address>"
    And I type a valid password "<password>"
    And I click on button login
    Then Verify that Logged in as username is visible
When I click on Logout
Then Verify that user is navigated to login page

    Examples: 
      | email address        | password |
      | ahmedbnh01@gmail.com |   123456 |
      

