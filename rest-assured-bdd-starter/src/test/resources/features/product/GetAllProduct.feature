Feature: Get All Products
  As a user
  I want to get all products
  So that I can read all products

  Scenario: As a user I can get all product with valid path
    Given I set API endpoint valid for get all product
    When I send request to get all product
    Then I received status code 200 OK get all products
    And I received list valid data for all product response

