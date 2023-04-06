package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TestPage {
    // This is my TestCentre page class
    // All objects in TestCentre page will go here

    // 1st way: Locating the elements using FUNCTION
//    public SelenideElement username(){
//        return $(By.id("exampleInputEmail1"));
//    }

    // 2nd way: Locating the elements using
    // Webelemnet -> SelenideElement
    public SelenideElement username = $(By.id("exampleInputEmail1"));

    public SelenideElement password = $(By.id("exampleInputPassword1"));

    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));

    public SelenideElement logoutLink = $(By.partialLinkText("Logout"));
}
