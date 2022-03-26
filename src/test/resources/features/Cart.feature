Feature: Test cart functionality

  Scenario: Add item to Cart
    Given User open "Search Page"
    When User searches for "shirt" on "Search Page"
    Then User adds first product from search results on "Search Page" to Cart