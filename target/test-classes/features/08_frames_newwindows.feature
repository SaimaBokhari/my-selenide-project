@iframe
Feature: iframe
  Scenario: TC01_iframe
  Given I navigate to "https://testcenter.techproeducation.com/index.php?page=iframe"
    And I verify the page header contains "iframe" keyword
    And I switch to the frame 1
    And I click on Back to TechProEducation.com
    And I hold the browser open
    When I switch to window 2
    And I wait for 5 seconds
    Then I get the URL of the page and verify it contains "techproeducation"

