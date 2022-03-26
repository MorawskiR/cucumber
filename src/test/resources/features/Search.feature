Feature: Search tests for ebay.com

  Scenario Outline: Search for item
    Given User open "Search Page"
    When User searches for "<product>" on "Search Page"
    Then User sees items as search results with "<product>" in titles on "Search Page"
    Examples:
      | product |
      | iPod    |
      | iPad    |
      | Nokia   |
      | shirt   |
      | iPhone  |
