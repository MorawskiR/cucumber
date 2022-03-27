Feature: Test cart functionality

  Scenario: Add item to Cart
    Given User is on the "Deals Page"
    When User click on spotlight deal on "Deals Page"
    And User adds product to cart on "Product Page"
    Then "Cart Confirmation Pop-up" should contain text "1 item added to cart"

  Scenario: Remove item from Cart
    Given User is on the "Deals Page"
    When User click on spotlight deal on "Deals Page"
    And User adds product to cart on "Product Page"
    And User navigate to "Cart Page"
    And User remove product from "Cart Page"
    Then "Cart Page" should contain message "You don't have any items in your cart."