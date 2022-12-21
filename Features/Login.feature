Feature: Login with Valid Credentials
  @sanity
  Scenario: Pharmacy Business Admin Successfully logs in with Valid Credentials
    Given User navigates to the UrPharm Store Business Admin website
    When user enters username and password
    And The User clicks on the login button
    Then The User the user confirms the Page title is UrPharmStore.
