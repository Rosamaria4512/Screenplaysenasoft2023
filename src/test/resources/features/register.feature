Feature:Register
  that he user can register correctly
  Background:
    Given he user enters the website

  @registersuccesfully
  Scenario Outline: Register Succesfully
    When he enters correct data
      | email   | password   | confirmation_password   |
      | <email> | <password> | <confirmation_password> |
    Then he makes a successful record.

    Examples:
      | email         | password    | confirmation_password |
      | milton@gmail.com | Rosita4512* | Rosita4512*           |