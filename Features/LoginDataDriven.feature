Feature: Data Driven Login Test

  @sanity

  Scenario Outline: Supermarket Business Admin Successfully logs in with Valid Credentials
    Given User navigates to the UrPharmStore Supermarket Business Portal
    When User enters Email as "<email>" and Password as "<password>"
    And The User clicks on the login button
    Then User navigates to the UrPharmStore Supermaket Landing Page
    Examples:
      | email                 | password |
      | ambasaateba@gmail.com | Test123@ |
