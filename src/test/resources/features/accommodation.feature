Feature: Accommodation
  I need to perform actions in the Accommodation module


  Background:
    Given the user Enter the website
  @Reservationbysearch
  Scenario: Book a successful accommodation
    When he clicks on the Accommodations option
    And the search and select one of the results
    Then he will have reserved a place of accommodation


  @Incompletereservation
  Scenario: Book a failed accommodation
    When he clicks on the "Accommodations" option and writes the incomplete specifications
    Then he will see an incomplete field message

  @ReservationbyFiltres
  Scenario Outline: Search Accommodations Filters successful
    When the is in the Results module and select several filters
      | city   |
      | <city> |
    Then He will see the new results obtained by applying the filters
    Examples:
      | city    |
      | Popayan |



