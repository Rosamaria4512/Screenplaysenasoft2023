Feature: Accommodation
  I need to perform actions in the Accommodation module
#En espera
  @Reservationbysearch
  Scenario: Book a successful accommodation
    Given the user Enter the website
    When he clicks on the Accommodations option
    And the search and select one of the results
    Then he will have reserved a place of accommodation

#Completed
  @Incompletereservation
 Scenario: Book a failed accommodation
    Given the user Enter the website
    When he clicks on the "Accommodations" option and writes the incomplete specifications
    Then he will see an incomplete field message

  @ReservationbyFiltres
  Scenario Outline: Search Accommodations Filters successful
    Given the user Enter the website
    When the is in the Results module and select several filters
      | email   | password   |
      | <email> | <password> |
    Then He will see the new results obtained by applying the filters
    Examples:
      | email                   | password   |
      | lenovo.esucre@gmail.com | 3Felipe180 |



