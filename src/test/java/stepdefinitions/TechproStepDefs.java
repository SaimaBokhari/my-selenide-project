package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.TestPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertTrue;


public class TechproStepDefs {
    TestPage testPage = new TestPage();
    @Given("I get the title of the current page and verify if it contains {string}")
    public void i_get_the_title_of_the_current_page_and_verify_if_it_contains(String string) {
        // getting the title of the page
//        boolean isTrue = title().contains(url);
//        assertTrue(isTrue);

        // OR directly assert
        assertTrue(title().contains(string));
    }

    //    Screenshot of programs elements
    @Given("I capture the screenshot of the programs pop up")
    public void i_capture_the_screenshot_of_the_programs_pop_up() {
        try {
            testPage.upcomingPrograms.screenshot();
        }catch (Exception e){

        }

    }

}
