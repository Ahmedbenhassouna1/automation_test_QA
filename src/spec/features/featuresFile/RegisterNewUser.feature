@registerUser
Feature: Authentification
  I want to register a new user

  @registerNewUser
  Scenario: I want to create a new user
    Given I visit the platform automationexercise
    Then Verify that home page is visible
    When I click on the button Signup Login
    Then Verify New User Signup is visible
    When I enter name "name"
    And I enter email  "email address"
    And I click on Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    When I fill in all the necessary information
      | Title         | Mr.                  |
      | Name          | Ahmed Ben Hassouna   |
      | Email         | ahmedbnh01@gmail.com |
      | Password      |            123456789 |
      | Date of birth | 14/06/1993           |
      And I select checkbox Sign up for our newsletter
      And I select checkbox Receive special offers from our partners!
      | First name |   Ahmed                 |
      | Last name          | Ben Hassouna   |
      | Company        | Zied |
      | Address      |          Hedi Noura, Kaser el Ennaser App42 Blok2 |
      | Address2 | Menzel de Bourguiba, Bizerte          |
      | Country        | Singapore   |
      | State       | Tunisia |
      | City      |            Ariana |
      | Zipcode | 7050          |
      | Mobile Number | 23972604          |
      And I click on Create Account button
      Then  Verify that ACCOUNT CREATED! is visible
      When I click on Continue button

      When I click Delete Account button
      Then Verify that ACCOUNT DELETED! is visible 
      And I click Continue button