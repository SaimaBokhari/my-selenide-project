@assertions2
Feature: assertions2
  Scenario: TC01_search for tesla
    Given I navigate to "https://www.google.com/"
    # if a pop up appears on google page, locate the "accept all" option, handle it first
    When I search for "Tesla"
    Then verify if page source contains "Tesla"
    Then verify the result should contain "About" keyword
    Then the first result on the page sections should contains "Tesla"

    # Created test case in feature folder
    # Create page objects in the page folder
    # Create step definitions in stepdefinitions folder