@file_upload
Feature: file upload
  Scenario: TC01_file upload
    Given I navigate to "https://the-internet.herokuapp.com/upload"
    And I upload the file on this path "/Desktop/logo.jpeg"
    And I wait for 3 seconds
    And I verify the file is uploaded
    And I capture the screenshot of the page
    And I hold the browser open