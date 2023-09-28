Feature: Favorites snd saved
  i need add and eliminate some

  @AddItems
  Scenario: Add Items
    Given the user Enter the website
    When the user selects items for favorites
    Then he will see these elements in his profile

    @EliminateItems
    Scenario: Eliminate Items
    Given  the user Enter the website
    When the User selects the My account_Favorites module and selects the "Delete from favorites" option
    Then the element would have been removed