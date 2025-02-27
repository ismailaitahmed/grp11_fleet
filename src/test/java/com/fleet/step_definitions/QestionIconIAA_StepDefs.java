package com.fleet.step_definitions;

import com.fleet.pages.QuestionIconIAA;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class QestionIconIAA_StepDefs {
    QuestionIconIAA tool = new QuestionIconIAA();

    @When("user clicks on question mark icon")
    public void userClicksOnQuestionMarkIcon() {
        tool.questionIcon.click();
    }
    @Then("user should access to the Oroinc Documentation page")
    public void userShouldAccessToTheOroincDocumentationPage() {

        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        for (String eachHandle : allWindows) {
                Driver.getDriver().switchTo().window(eachHandle);
        }
        String URL = Driver.getDriver().getCurrentUrl();
        System.out.println("URL = " + URL);

        Assert.assertEquals("https://doc.oroinc.com/", URL);
    }

}
