@calculator @android
Feature: Calculator


  @tugas @positive
  Scenario: User add two numbers
    Given user already login
    When user input angka1 field 50
    And user input angka2 field 60
    And user click drop down button
    And user click add button
    And user click equal button
    Then the add total should be 110


  @tugas @positive
  Scenario: User subtract two numbers
    Given user already login
    When user input angka1 field 50
    And user input angka2 field 60
    And user click drop down button
    And user click substract button
    And user click equal button
    Then the substraction total should be -10


  @tugas @positive
  Scenario: User multiply two numbers
    Given user already login
    When user input angka1 field 50
    And user input angka2 field 60
    And user click drop down button
    And user click multiplication button
    And user click equal button
    Then the multiply total should be 3000


  @tugas @positive
  Scenario: User distribution two numbers
    Given user already login
    When user input angka1 field 10
    And user input angka2 field 2
    And user click drop down button
    And user click distribution button
    And user click equal button
    Then the distribution total should be 5


  @tugas @negative
  Scenario: User input only one field
    Given user already login
    When user input angka1 field 10
    And user click drop down button
    And user click add button
    Then user click equal button
    And the total should be NaN


  @tugas @positive
  Scenario: User input one decimal number
    Given user already login
    When user input decimal angka1 field 3,14
    And user input angka2 field 7
    And user click drop down button
    And user click add button
    Then user click equal button
    And the total should be NaN


  @tugas @positive
  Scenario: User input two decimal number
    Given user already login
    When user input decimal angka1 field 3,14
    And user input decimal angka2 field 19,89
    And user click drop down button
    And user click multiplication button
    Then user click equal button
    And the total should be NaN

  @tugas @positive
  Scenario: User divide number with zero
    Given user already login
    When user input angka1 field 99
    And user input angka2 field 0
    And user click drop down button
    And user click distribution button
    Then user click equal button
    And the total should be NaN