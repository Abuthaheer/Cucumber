Feature: LogIn Action Test

  Scenario: Successful Login with Valid Credentials
    Given User is on facebook Page
    When User enters credentials and clicks the button
      | userName         | Password  |
      | ARamesh@gmail.com | 9828jbkjb |
      | VGanesrrh@gmail.com | 9828jbkjb |
    Then Message displayed Login Successfully
