@login @android
Feature: Login

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    And user click button login
    Then user successfully login
#    When user go to list menu
#    And user do scroll

  @negative
  Scenario: Verify user failed to login when input invalid email and password
    Given user is on login page
    When user input username "invalid"
    And user input password "invalid"
    Then user click button login

  @tugas @negative
  Scenario: Login with blank in one of the field
    Given user is on login page
    When user input username "admin"
    And user click button login
    Then user should stay in login page

  @tugas @negative
  Scenario: Login with numeric
    Given user is on login page
    When user input username "1989"
    And user input password "1990"
    Then user should stay in login page