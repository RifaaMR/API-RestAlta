Feature: Assign Product Rating
  As a user
  I want to assign product rating
  So that I can be assign product rating

  Scenario: As a user I can assign product rating data with a valid path and body request
    Given I set API endpoint valid for assign product rating
    When I make a request with the POST method on the endpoint
    Then I received status code of 200 OK for a product rating
    And I received product rating data that was successfully added
