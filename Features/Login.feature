Feature: LogIn Action Test

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on facebook Page
    When User enters "<userName>","<password>" and click the login  button
    Then Message displayed Login Successfully

    Examples: 
      | userName | password |
      | ganesh   | Java65   |
