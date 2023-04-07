package stepdefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.*;
import pages.TestPage;

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



}
