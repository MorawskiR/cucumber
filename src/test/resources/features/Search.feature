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

  Scenario Outline: Search finds nothing (negative)
    Given User open "Search Page"
    When User searches for "<incorrect data>" on "Search Page"
    Then User sees message "No exact matches found" on "Search Page"
    Examples:
      | incorrect data                      |
      | afasasfjhfiwefiwu4vitn8unw4vi3tvun8 |
      | йцукенгшщзхъфывпарлржылавльмт       |