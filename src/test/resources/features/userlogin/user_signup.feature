@run
Feature: New user sign up
  As a new customer of the shopping website
  I should be able to sign up with my email id
  So that I can login to the application

  Scenario: User should be able to create a new account for the application
    Given Matt, a new customer navigates to application sign in page
    When Matt registers as a new user of the application
    Then Matt should get logged into the application
#    And view his account page
#    And view the sign out option