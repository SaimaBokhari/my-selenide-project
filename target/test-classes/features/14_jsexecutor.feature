@jsexecutor
Feature: js executor
  Scenario: TC01_js executor
    Given I navigate to "https://www.amazon.com"
    And I wait for 2 seconds
    And I click on Amazon logo
    And I scroll down to footer section
    And I wait for 2 seconds
    And I capture the screenshot of the page
    And I wait for 2 seconds
    And I click on "Goodreads" by JS on amazon table
    And I hold the browser open
