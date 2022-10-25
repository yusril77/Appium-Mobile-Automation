@list @android
Feature: List User

  @tugas @positive
    Scenario: user long press while in list menu
    Given user already login
    When user go to list menu
    And user long press in list menu
    Then user should see the pop up message


  @tugas @positive
  Scenario: user tap multiple times while in list menu
    Given user already login
    When user go to list menu
    And user tap multiple times in list menu
    Then user should see the pop up message