Feature: User Login
  As a user
  I want to login
  So that I can access my account and other services

  Scenario: User can successfully login with registered email and correct password
    Given I set the login endpoint
    When I enter registered email
    And I enter the correct password
    Then I should receive status code 200

  Scenario: User cannot login with registered email and wrong password
    Given I set the login endpoint
    When I enter registered email
    And I enter the wrong password
    Then I should receive status code 400

  Scenario: User cannot login with unregistered email
    Given I set the login endpoint
    When I enter unregistered email
    And I enter any password
    Then I should receive status code 400

  Scenario: User cannot login with empty email
    Given I set the login endpoint
    When I leave the email field empty
    And I enter any password
    Then I should receive status code 400

  Scenario: User cannot login with empty password
    Given I set the login endpoint
    When I enter a valid email
    And I leave the password field empty
    Then I should receive status code 400

