package stepdefinitions;

import io.cucumber.java.en.Given;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefs {
    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
      //  open("https://www.google.com");
        open(url);
    }

}
