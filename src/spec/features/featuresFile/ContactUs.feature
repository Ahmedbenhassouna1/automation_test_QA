@contact
Feature: fill contact us
  I want to fill all the necessary information in contact us

  Background: 
    Given I visit the platform automationexercise
    Then Verify that home page is visible

  @contactus
  Scenario Outline: fill in contact us form
    When I click on Contact Us button
    Then Verify GET IN TOUCH is visible
    When I enter the name "<name>"
    And I enter the email "<email>"
    And I enter the subject "<subject>"
    And I enter the message "<message>"
    And I upload a file "<path>"
    And I click on Submit button
    And I click on OK
    Then Verify success message Success! Your details have been submitted successfully. is visible
    When I click Home
    Then Verify that landed to home page successfully

    Examples: 
      | name               | email                | subject | message                 |path              |
      | Ahmed Ben hassouna | ahmedbnh01@gmail.com | a bug   | can you please fix this |F:\\Auto avec Zied\\7e7.jpg |
