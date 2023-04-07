package stepdefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.*;
import pages.GooglePage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertTrue;

public class GoogleStepDefs {

    GooglePage googlePage = new GooglePage();
    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
      //  open("https://www.google.com");
        open(url);
    }

    @Given("I wait for {int} seconds")
    public void i_wait_for_seconds(Integer int1) {
        sleep(int1*1000);
        //5 seconds = 5000 milliseconds
    }
    @Given("I navigate back")
    public void i_navigate_back() {
        back();
    }
    @Given("I navigate forward")
    public void i_navigate_forward() {
        forward();
    }
    @Given("I refresh the page")
    public void i_refresh_the_page() {
        refresh();
    }
    @Then("I hold the browser open")
    public void i_hold_the_browser_open() {
        Configuration.holdBrowserOpen=true;
    }

    // ********* 04_assertions2 stepdefs ************
    @When("I search for {string}")
    public void i_search_for(String string) {
        googlePage.googleSearchBox.setValue(string).pressEnter();
    }
    @Then("verify if page source contains {string}")
    public void verify_if_page_source_contains(String string) {
       //  WebDriverRunner.url(); // Returns current url of the page
        String pageSource = WebDriverRunner.source();  // returns the page source
        //System.out.println(pageSource);

        // verification
        assertTrue(pageSource.contains(string));
    }
    @Then("verify the result should contain {string} keyword")
    public void verify_the_result_should_contain_keyword(String string) {
     // traditional selenium assertion =>    assertTrue(googlePage.resultSection.toString().contains(string)); // About 679,000,000 results (0.54 seconds)

      // selenide assertions
        googlePage.resultSection.shouldHave(text(string));  // About 679,000,000 results (0.54 seconds)
        googlePage.resultSection.shouldNotHave(text("Mercedes Truck"));  // Negative test case
        googlePage.resultSection.shouldBe(visible);  // checks if the element is visible on the page
//        googlePage.resultSection.shouldHave(exactText("About 679,000,000 results"));  // Not recommended as the exact text keep changing in the search engines
    }

    @Then("the first result on the page sections should contains {string}")
    public void the_first_result_on_the_page_sections_should_contains(String string) {
        googlePage.getAllSections.get(0).shouldHave(text(string));  // checks if the first of all the links that appear on
                                                                    // the result section has the given keyword

    }


}
