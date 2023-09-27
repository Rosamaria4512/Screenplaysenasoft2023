Feature: Accommodation
  I need to perform actions in the Accommodation module
  Scenario: Book an accommodation
    Given the user Enter the website
    When he clicks on the "Accommodations" option
    And the search and select one of the results
    Then he will have reserved a place of accommodation
