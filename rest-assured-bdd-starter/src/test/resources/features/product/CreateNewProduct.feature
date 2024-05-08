Feature: Create New Product
  As a user
  I want to create new product
  So that I can be added new product

  Scenario: As a user I can create new product data with a valid path and body request
    Given I set API endpoint valid for create new product
    When I make a request with the POST method on the endpoint with post data
    Then I received responds with the status code 200
    And I received new product that was just created