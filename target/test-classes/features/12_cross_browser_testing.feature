@headless
Feature: cross browser
  Scenario: TC01_Running of headless
    # For cross browser testing, we should assign the browser type before opening the browser
    #othersie selenide will open the borwser on chrome
    Given I open the "headless" browser
    And I navigate to "https://www.techproeducation.com"
    And I capture the screenshot of the page

    @firefox
  Scenario: TC01_Running of headless
    Given I open the "firefox" browser
    And I navigate to "https://www.amazon.com"
    And I capture the screenshot of the page

  @safari
  Scenario: TC01_Running of headless
    Given I open the "safari" browser
    And I navigate to "https://www.amazon.com"
    And I capture the screenshot of the page
    # we need to allow safari in Mac settings othewise it won't work

  @chrome  # chrome is the default browser in Selenide but we are running it explicitly just to make sure
  Scenario: TC01_Running of headless
    Given I open the "chrome" browser
    And I navigate to "https://www.apple.com"
    And I capture the screenshot of the page

