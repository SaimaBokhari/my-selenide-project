package stepdefinitions;

import io.cucumber.java.en.Given;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertTrue;


public class TechproStepDefs {
    @Given("I get the title of the current page and verify if it contains {string}")
    public void i_get_the_title_of_the_current_page_and_verify_if_it_contains(String string) {
        // getting the title of the page
//        boolean isTrue = title().contains(url);
//        assertTrue(isTrue);

        // OR directly assert
        assertTrue(title().contains(string));
    }

}
