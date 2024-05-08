Feature: Delete Product
  As a user
  I want to delete product
  So that I can remove the product

  Scenario: As a user I can delete product with a valid path
    Given I set API endpoint valid for delete product
    When I send request to delete product
    Then I received status code of 200 OK for a delete product
    And I received data message "null" delete product