Feature: Register
  As a user
  I want to register
  So that I can be login

  Scenario: As a user I can Register with valid data
    Given I am on the register page endpoint
    When I request the valid register endpoint
    Then I receive success register status code response 200 ok

  Scenario: As a user I cannot register with empty value
    Given I am on the register page endpoint
    When I blank the password and email
    Then I receive bad request HTTP response code "400"

  Scenario: As a user I cannot register with  already registered account
    Given I am on the register page endpoint
    When I registered with already registered account
    Then I receive bad request HTTP response code "400"