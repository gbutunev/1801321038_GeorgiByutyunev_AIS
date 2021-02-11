
Feature: Create a reservation

  Scenario: Create a valid reservation
    Given User opens reservation creation tab
    When User selects restaurant "Happy"
    And Enters date and time "02/03/2021 20:00"
    And Enters number of people "6"
    And Clicks on 'create reservation'
    Then Message to user "OK"
    
   Scenario: Create a reservation with non-existent restaurant
		Given User opens reservation creation tab
    When User selects restaurant "Afreddo"
    And Enters date and time "02/03/2021 20:00"
    And Enters number of people "6"
    And Clicks on 'create reservation'
    Then Message to user "Restaurant does not exist"
    
   Scenario: Create a reservation without selecting a restaurant
		Given User opens reservation creation tab
    And Enters date and time "02/03/2021 20:00"
    And Enters number of people "6"
    And Clicks on 'create reservation'
    Then Message to user "Please select a restaurant"
    
   Scenario: Create a reservation without entering time and date
		Given User opens reservation creation tab
    When User selects restaurant "Happy"
    And Enters number of people "6"
    And Clicks on 'create reservation'
    Then Message to user "Please enter time and date"
    
   Scenario: Create a reservation with invalid date
		Given User opens reservation creation tab
    When User selects restaurant "Happy"
    And Enters date and time "02/03/2018 20:00"
    And Enters number of people "6"
    And Clicks on 'create reservation'
    Then Message to user "Cannot enter date and time before today"
    
   Scenario: Create a reservation without selecting people count
		Given User opens reservation creation tab
    When User selects restaurant "Happy"
    And Enters date and time "02/03/2021 20:00"
    And Clicks on 'create reservation'
    Then Message to user "Please enter correct number of people"
