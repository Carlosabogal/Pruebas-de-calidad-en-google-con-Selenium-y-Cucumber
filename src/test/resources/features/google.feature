Feature: Test Google Search functionality

  Scenario: As a user I enter a search criteria in google
    Given I am on the google search page
    When I enter a search criteria
    |criteria|
    Then the results match the criteria
