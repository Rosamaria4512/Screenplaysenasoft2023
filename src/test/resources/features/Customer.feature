Feature: Customer Support
  I need to rate the application
  Scenario Outline: Message Send Successfult
    Given the user Enter the website
    When The user enters their rating on the website and presses the Submit button
    |Message|
    |<Message>|
    Then the user will have submitted a rating of the website
    Examples:
    |Message|
    |Esta pagianes lo mejor que hay de eso estoy seguro|
