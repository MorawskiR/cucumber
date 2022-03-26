Feature: Search tests for ebay.com

  Scenario Outline: Search for items
    Given User open "Search Page"
    When User searches for "<product>" on "Search Page"
    Then User sees items as search results with "<product>" in titles on "Search Page"
    Examples:
      | product |
      | iPod    |
      | iPad    |
      | iPhone  |
      | Apple   |
      | Galaxy  |
      | Samsung |

  Scenario : Search finds nothing
    Given User open "Search Page"
    When User searches for "~!@#$%^&*()_+{}|:”>?<Ё!”№;%:?*()_+/Ъ,/.,;’[]\|" on "Search Page"
    Then User sees message "No exact matches found" on "Search Page"


