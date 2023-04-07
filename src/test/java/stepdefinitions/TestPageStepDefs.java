package stepdefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.*;
import pages.TestPage;

import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.Assert.assertTrue;

public class TestPageStepDefs {

    TestPage testPage = new TestPage();

    @Given("I enter username")
    public void i_enter_username() {
        testPage.username.setValue("techproed");
    }
    @Given("I enter password")
    public void i_enter_password() {
        testPage.password.setValue("SuperSecretPassword");
    }
    @Given("I click on submit button")
    public void i_click_on_submit_button() {
        testPage.submitButton.click();

    }
    @Given("I click on logout link")
    public void i_click_on_logout_link() {
        testPage.logoutLink.click();
    }

    // Radio Button and Checkbox steps

    // Try your best to make the code as dynamic as possible so it can cover many steps from feature file
    @Given("I click on {string} if not already selected")
    public void i_click_on_if_not_already_selected(String string) throws InterruptedException {

        if(string.equals("Checkbox 1")&&!testPage.checkbox1.isSelected()){
            testPage.checkbox1.shouldNot(Condition.checked);
            testPage.checkbox1.click();
            testPage.checkbox1.shouldBe(Condition.checked);
            Thread.sleep(2000);
        }else if(string.equals("Checkbox 2")&&!testPage.checkbox2.isSelected()) {
            testPage.checkbox2.shouldNot(Condition.checked);
            testPage.checkbox2.click();
            testPage.checkbox2.shouldBe(Condition.checked);
            Thread.sleep(2000);
        } else if(string.equals("Red")&&!testPage.red.isSelected()) {
            testPage.red.shouldNot(Condition.checked);
            testPage.red.click();
            testPage.red.shouldBe(Condition.checked);
            Thread.sleep(2000);
        }else if(string.equals("Yellow")&&!testPage.yellow.isSelected()){
            testPage.yellow.shouldNot(Condition.checked);
            testPage.yellow.click();
            testPage.yellow.shouldBe(Condition.checked);
            Thread.sleep(2000);
        }else if (string.equals("Football")&&!testPage.football.isSelected()){
            testPage.football.shouldNot(Condition.checked);
            testPage.football.click();
            testPage.football.shouldBe(Condition.checked);
            Thread.sleep(2000);
        }

    }

    // DROPDOWN
    @Given("I select the year as {int}")
    public void i_select_the_year_as(Integer int1) {
        testPage.year.selectOptionByValue(String.valueOf(int1));  // selecting by value
    }
    @Given("I select the month as {string}")
    public void i_select_the_month_as(String string) {
        testPage.month.selectOption(string);  // selecting by visible text
    }
    @Given("I select the day as {int}")
    public void i_select_the_day_as(Integer int1) throws InterruptedException {
        testPage.day.selectOption(int1-1);  // coz index starts at 0
        Thread.sleep(2000);
    }

    @Given("I get the list of US states and click on {string}")
    public void i_get_the_list_of_us_states_and_click_on(String string) {
        for(SelenideElement myState : testPage.allStates){
           // System.out.println(myState.getText());
            if(myState.getText().equals(string)){
                myState.click();
                break;
            }
        }
    }

    // Handling ALERTS
    @Given("I click on alert prompt")
    public void i_click_on_alert_prompt() {
        testPage.jsPromptButton.click();
    }
    @Given("I enter {string} and click OK")
    public void i_enter_and_click_ok(String string) {
        WebDriverRunner.getWebDriver().switchTo().alert().sendKeys(string); // sending text
        WebDriverRunner.getWebDriver().switchTo().alert().accept();  // OK

    }
    @Then("verify the result contains {string}")
    public void verify_the_result_contains(String string) {
        testPage.result.shouldHave(Condition.text(string));
    }

    // IFRAME step defs
    @Given("I verify the page header contains {string} keyword")
    public void i_verify_the_page_header_contains_keyword(String string) {
        // This element is OUTSIDE the iframe
        testPage.pageHeader.shouldHave(Condition.text(string));
    }
    @Given("I switch to the frame {int}")
    public void i_switch_to_the_frame(Integer int1) {
       // WebDriverRunner.getWebDriver().switchTo().frame(int1-1); // 1-1=0 => index 0
         WebDriverRunner.getWebDriver().switchTo().frame(testPage.iframe);
    }
    @Given("I click on Back to TechProEducation.com")
    public void i_click_on_back_to_tech_pro_education_com() {
        // This element is INSIDE the iframe
        testPage.backToTechPro.click();
    }

    // NEW WINDOW

    @When("I switch to window {int}")
    public void i_switch_to_window(Integer int1) {
        switchTo().window(int1-1);  //
    }
    @Then("I get the URL of the page and verify it contains {string}")
    public void i_get_the_url_of_the_page_and_verify_it_contains(String string) {
        System.out.println(WebDriverRunner.url());
        assertTrue(WebDriverRunner.url().contains(string));
    }


}
