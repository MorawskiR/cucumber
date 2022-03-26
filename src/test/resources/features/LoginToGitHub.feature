Feature: Test scenario for Git

  Scenario: Login to GitHub
    Given User is on "Login Page"
    When User enters username as "gavura@duck.com" and password as "cuooC6qmIc5mGR" on "Login Page"
    Then User is successfully navigated to the "https://github.com/"
    And User info "gavura256" on "Home Page" is present on navigation panel

  Scenario Outline: Login to GitHub (negative)

    Given User is on "Login Page"
    When User enters incorrect data username as "<username>" and password as "<password>" on "Login Page"
    Then User gets error message "Incorrect username or password." on "Login Page"

    Examples:
      | username         | password       |
      | gavura@duck.com  | qweqweqwe      |
      | gavura1@duck.com | asdasdasd      |
      | gavura1@duck.com | cuooC6qmIc5mGR |