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
      | lenovo.esucre@gamil.com| Rosita4512* | Rosita4512*  |


    @incorrectregistration
    Scenario: incorrect registratio
      When he enters incorrect data
        | email         | password    | confirmation_password |
        | lenovo.esucregamil.com| Rosita4512* | Rosita4512*  |
      Then he cannot make a successful registration.
