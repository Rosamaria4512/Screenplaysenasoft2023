Feature: Customer Support
  I need to rate the application

  #HECHO
  Background:
    Given the user Enter the website
  @SendMessage
  Scenario Outline: Message Send Successfult
    When The user enters their rating on the website and presses the Submit button
      | Message   |
      | <Message> |
    Then the user will have submitted a rating of the website
    Examples:
      | Message                                              |
      | Esta paginas es lo mejor que hay de eso estoy seguro |
