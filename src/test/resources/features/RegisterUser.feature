@holymoly

Feature: Register User
  Scenario: User should be able to create and delete account.

    Given User is on the home page and verify it
    When User should click Signup / Login
    And User should see New User Signup!
    When User should enter Name and Email
    And User should click Signup button
    When User should see Enter Account Information
    And User should fill details: Title, Name, Email, Password, Date of birth
    And User should select checkbox Sign up for our newsletter!
    And User should select checkbox Receive special offers from our partners!
    And User should fill details: firstName, lastName, Company, address, address2, country, State, city, zipcode, mobileNumber
    And User should click Create account button
    Then User should see ACCOUNT CREATED! message
    When User clicks Continue button
    Then User should click cancel for the pop-up add
    And User should see logged in as username
    When user clicks Delete Account button
    Then User should see ACCOUNT DELETED! message
    Then User should be able to click continue button
