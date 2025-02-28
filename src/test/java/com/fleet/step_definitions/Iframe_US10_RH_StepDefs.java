package com.fleet.step_definitions;

import com.fleet.pages.US10_CalenderEventsPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Iframe_US10_RH_StepDefs {

    US10_CalenderEventsPage event = new US10_CalenderEventsPage();
    @When("user clicks on Calendar Events from Activities module")
    public void user_clicks_on_calendar_events_from_activities_module() {
        event.activitiesModule.click();
        event.calendarEvents.click();
    }
/*
    @When("user clicks on Create Calendar Event button")
    public void user_clicks_on_create_calendar_event_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(event.createCalendarEventBtn));
        event.createCalendarEventBtn.click();
    }

 */

    @When("user clicks on Create Calendar Event button")
    public void user_clicks_on_create_calendar_event_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        WebElement createEventBtn = wait.until(ExpectedConditions.elementToBeClickable(event.createCalendarEventBtn));

        try {
            createEventBtn.click();
        } catch (Exception e) {
            // because normal click fails
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", createEventBtn);
        }
    }

    @Then("user can type in to the Description field on the Calendar Events page")
    public void user_can_type_in_to_the_description_field_on_the_calendar_events_page() {
        // Wait for the iframe to be loaded and switch to it
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(70));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(event.tinyIframe));

        // Wait for the descriptionBox to be clickable before interacting with it
        wait.until(ExpectedConditions.elementToBeClickable(event.descriptionBox));

        /// Create an Actions instance
        Actions actions = new Actions(Driver.getDriver());

        // Click, clear, and type into the descriptionBox using Actions
        actions.moveToElement(event.descriptionBox)  // Move to the descriptionBox element
                .click()                            // Click on the descriptionBox
                .sendKeys("")                       // Clear the field
                .sendKeys("Scrum daily meeting!")    // Type the text
                .perform();

        // Wait for the text to be present inside the descriptionBox and assert
        wait.until(ExpectedConditions.textToBePresentInElement(event.descriptionBox, "Scrum daily meeting!"));
        Assert.assertEquals("Scrum daily meeting!", event.descriptionBox.getDomAttribute("p"));

        // Switch back to the default content
        Driver.getDriver().switchTo().defaultContent();
        System.out.println("Switched back to default content.");
    }

/*
    @Then("user can type in to the Description field on the Calendar Events page")
    public void user_can_type_in_to_the_description_field_on_the_calendar_events_page() {
        // Wait for the iframe to be loaded and switch to it
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(70));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(event.tinyIframe));

        // Wait for the descriptionBox to be clickable before interacting with it
        wait.until(ExpectedConditions.visibilityOf(event.descriptionBox));

        // Use JavaScript to click on the descriptionBox
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", event.descriptionBox);

        // Clear and type into the descriptionBox using JavaScript
        js.executeScript("arguments[0].value = '';", event.descriptionBox); // Clear the field
        js.executeScript("arguments[0].value = 'Scrum daily meeting!';", event.descriptionBox); // Type into the field

        // Wait for the value to be set and assert
        wait.until(ExpectedConditions.textToBePresentInElementValue(event.descriptionBox, "Scrum daily meeting!"));
        Assert.assertEquals("Scrum daily meeting!", event.descriptionBox.getDomAttribute("p"));

        // Switch back to the default content
        Driver.getDriver().switchTo().defaultContent();
        System.out.println("Switched back to default content.");
    }

*/






}
