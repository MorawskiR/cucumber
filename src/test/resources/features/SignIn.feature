Feature: Sign-in test for ebay.com

  Scenario: Sign-in to eBay
    Given User is on "Home Page"
    When User navigates to "Sign-in Page"
    And User enters username as "is5gf058@duck.com" and password as "3T9#Kxn9U!c3v*" on "Sign-in Page"
    Then User is successfully navigated to the "https://www.ebay.com/"
    And User info "Epam Test" on "Home Page" is present on navigation panel
