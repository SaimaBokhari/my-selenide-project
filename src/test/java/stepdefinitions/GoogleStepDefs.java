package stepdefinitions;

import io.cucumber.java.en.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefs {
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
    }


}
