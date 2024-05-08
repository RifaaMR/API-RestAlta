Feature: Get Product By ID
  As a user
  I want to get product data
  So that I can be get product data

  Scenario: As a user I can get a single product data with a valid ID
    Given I set API endpoint valid for get a single product data
    When I send request to get a single product data
    Then I received status code 200 OK get product by ID
    And I received detail single product data response