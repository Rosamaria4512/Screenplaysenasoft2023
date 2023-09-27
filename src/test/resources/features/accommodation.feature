Feature: Accommodation
  I need to perform actions in the Accommodation module
#En espera
  @Reservationbysearch
  Scenario: Book a successful accommodation
    Given the user Enter the website
    When he clicks on the Accommodations option
    And the search and select one of the results
    Then he will have reserved a place of accommodation

<<<<<<< HEAD

   Scenario: Book a failed accommodation
=======
#Completed
  @Incompletereservation
 Scenario: Book a failed accommodation
>>>>>>> e73995abbc9561e3b288185fd5db4453192ff88b
    Given the user Enter the website
    When he clicks on the "Accommodations" option and writes the incomplete specifications
    Then he will see an incomplete field message

@ReservationbyFiltres
  Scenario: Search Accommodations Filters successful
    Given the user Enter the website
    When the is in the Results module and select several filters
    Then He will see the new results obtained by applying the filters




