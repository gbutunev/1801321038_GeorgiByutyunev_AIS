
Feature: Adding new restaurant

  Scenario Outline: Add a new restaurant
    Given User opens restaurant creation tab
    When Current user "<username>" is verified
    And User enters restaurant name "<name>"
    And User selects restaurant city "<city>"
    And User enters restaurant address "<address>"
    And User enters restaurant table count "<tables>"
    And Clicks on 'Add Restaurant'
    Then Message to user appears: "<message>"

    Examples: 
      | username  | name      | city    | address      | tables | message                                  |
      | owner123  | Raffy     | Plovdiv | asdfasdfasdf | 47     | OK                                       |
      | owner123  | Affreddo  | Sofia   | aewaf        | 25     | City not in database                     |
      | user1234  | testRest  | Plovdiv | asdfasdf     | 16     | User does not have access to these tools |
