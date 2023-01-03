Feature: UrPharm Admin Creates Pharmacy & Supermarket/Franchise Accounts
  @pharmacy
  Scenario: UrPharm Admin Creates A Pharmacy Business Portal With MTN MOMO & Weekly Payment As Preferred Method
    Given User navigates to UrPharmStore Admin website
    When user enters a valid username and password
    And click on the login button
    And The Admin clicks on the Create Business button
    And Enters all the details for the Pharmacy
    Then A UrPharm Businees Portal is successfully created for the New Pharmacy With MTN MOMO as their preferred method of payment
#@pharmacy
#  Scenario: UrPharm Admin Creates A Pharmacy Business Portal With Orange Money & Bi-Monthly Payment As Preferred Method
#    Given User navigates to UrPharmStore Admin website to create A Bi-monthly & Orange Money Pharmacy Account
#    When The UrPharm Admin successfully signs in
#    And  Clicks on the Create Business button to create a new Pharmacy
#    And Enters all the details for the Potential Pharmacy
#    Then A UrPharm Business Portal is successfully created for the New Pharmacy With Orange Money as their preferred method of payment
#@pharmacy
#  Scenario: UrPharm Admin Creates A Pharmacy Business Portal With Bank Transfer & Monthly Payment As Preferred Method
#    Given User navigates to UrPharmStore Admin website A website A monthly & Bank Transfer Pharmacy Account
#    When The Admin successfully logs in and is redirected to the Landing Page
#    And  Clicks on the Create Business button to create another Pharmacy account
#    And Enters all the details for the Pharmacy for the future business
#    Then A UrPharm Business Portal is successfully created for the New Pharmacy With Bank Transfer as their preferred method of payment
