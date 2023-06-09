package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
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
    // Webelement -> SelenideElement
    public SelenideElement username = $(By.id("exampleInputEmail1"));

    public SelenideElement password = $(By.id("exampleInputPassword1"));

    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));

    public SelenideElement logoutLink = $(By.partialLinkText("Logout"));

    // Locating CHECKBOX
    public SelenideElement checkbox1 = $(By.id("box1"));

    public SelenideElement checkbox2 = $(By.id("box2"));

    // Locating RADIO BUTTON

    public SelenideElement red = $(By.id("red"));
    public SelenideElement yellow = $(By.id("yellow"));
    public SelenideElement football = $(By.id("football"));

    // Locating DROPDOWN elements

    public SelenideElement year = $(By.id("year"));
    public SelenideElement month = $(By.id("month"));
    public SelenideElement day = $(By.id("day"));
    public ElementsCollection allStates = $$(By.xpath("//select[@id='state']//option"));

    // Locating ALERT Elements

    public SelenideElement jsPromptButton = $(By.xpath("//button[@onclick='jsPrompt()']"));
    public SelenideElement result = $(By.id("result"));

    // Locating IFRAME

    public SelenideElement pageHeader = $(By.xpath("//h3"));
    public SelenideElement backToTechPro = $(By.xpath("//a[@type='button']"));

    public SelenideElement iframe = $(By.xpath("//iframe"));
    public SelenideElement backToTechpro = $(By.xpath("//a[@type='button']"));

    //    ACTIONS
    public SelenideElement source = $(By.id("draggable"));
    public SelenideElement target = $(By.id("droppable"));

    //    EXPLICIT WAIT
    public SelenideElement startButton = $(By.xpath("//div[@id='start']//button"));
    public SelenideElement helloWorld =$(By.xpath("//div[@id='finish']//h4"));

    //    SCREENSHOT
    public SelenideElement upcomingPrograms = $(By.id("MjI4NDoxMDk1-1"));

    // FILE UPLOAD
    public SelenideElement chooseFile = $(By.id("file-upload"));
    public SelenideElement uploadButton = $(By.id("file-submit"));



}
