Feature: AberCrombie Login Functionality
  Background:
    Given User can browse to an application
    When Browse to the url
    Then abercrombie home page should show

  Scenario: 1. Invalid user valid password
    When User click login button
    Then Login page should show
    When Enter "aktar_NotValid@gmail.com" as email address
    And Enter "paxotech123" as password
    And Click login
    Then Invalid email message display "We didn't find an account with this email address."

  Scenario: 2. Valid user invalid password
    When User click login button
    Then Login page should show
    When Enter "aktar203@gmail.com" as email address
    And Enter "paxotechx" as password
    And Click login
    Then Invalid password message display "The password you entered does not match the email provided."

  Scenario: 3. Valid user valid Password
    When User click login button
    Then Login page should show
    When Enter "aktar203@gmail.com" as email address
    And Enter "paxotech123" as password
    And Click login
    And Welcome message shows "Welcome, m"

  Scenario Outline: 4. Valid user valid Password
    When User click login button
    Then Login page should show
    When Enter "<email>" as email address
    And Enter "<password>" as password
    And Click login
    Then Welcome message shows "<Welcome Message>"
    And User click on Logout button

    Examples:
      |email|                   password|      Welcome Message|
      |aktar203@gmail.com|      paxotech123|   Welcome, m|
      |addto1@gmail.com|        paxotech123|   Welcome, paxo|

