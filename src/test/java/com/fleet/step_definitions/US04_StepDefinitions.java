package com.fleet.step_definitions;

import com.fleet.pages.US04_VehicleContractsPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US04_StepDefinitions {

   US04_VehicleContractsPage contractsPage = new US04_VehicleContractsPage();

    @When("user clicks vehicle contracts from the fleet menu GY")
    public void user_clicks_vehicle_contracts_from_the_fleet_menu_gy() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(contractsPage.fleetDropdown));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(contractsPage.fleetDropdown).click().perform();
        contractsPage.vehicleContracts.click();


    }
    @Then("user can see the vehicle contracts page GY")
    public void user_can_see_the_vehicle_contracts_page_gy() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(contractsPage.contractsPageHeader));
        Assert.assertTrue("Contracts page header is not visible",contractsPage.contractsPageHeader.isDisplayed());

    }



    @When("driver clicks vehicle contracts from fleet menu GY")
    public void driver_clicks_vehicle_contracts_from_fleet_menu_gy() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(contractsPage.fleetDropdown));
        contractsPage.fleetDropdown.click();



    }
    @Then("driver gets a warning message GY")
    public void driver_gets_a_warning_message_gy() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(contractsPage.warningMessage));
        Assert.assertTrue("Warning message is not displayed", contractsPage.warningMessage.isDisplayed());

    }









}


