package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.VehiclesCostsUS13_RH;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.Duration;
import java.util.List;

public class VehiclesCostsUS13_Rh_StepDefs {

    VehiclesCostsUS13_RH tool = new VehiclesCostsUS13_RH();

    @When("user clicks on Fleet module")
    public void user_clicks_on_fleet_module(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement fleetModule = wait.until(ExpectedConditions.elementToBeClickable(tool.fleetDropdown));
        fleetModule.click();
    }

    @And("user  clicks on Vehicle Costs in the Fleet dropdown")
    public void userClicksOnVehicleCostsInTheFleetDropdown(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement vehicleCosts = wait.until(ExpectedConditions.elementToBeClickable(tool.vehicleCostsOption));
        vehicleCosts.click();

    }

    @Then("the table should contain the following columns:")
    public void the_table_should_contain_the_following_columns(List<String> expectedColumnsHeader) throws InterruptedException {

        String locator= "//table//tr[@class='grid-header-row']//th";
        // Wait for the table headers to be visible
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        List<WebElement> actualHeaders = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));

        List<WebElement> filteredHeaders= actualHeaders.subList(1,actualHeaders.size()-1);

        for(int i=0; i< expectedColumnsHeader.size(); i++){
            String actualColumnHeader = filteredHeaders.get(i).getText().trim();
            System.out.println("Actual Column Header : " + actualColumnHeader);
            Assert.assertEquals(expectedColumnsHeader.get(i),actualColumnHeader);
            Thread.sleep(3000);
        }

    }


    @Then("user should check the first checkbox to select All Vehicle Costs")
    public void userShouldCheckTheFirstCheckboxToSelectAllVehicleCosts() {
/*
        Assert.assertTrue("The first checkbox is not enabled",tool.firstCheckBox.isEnabled());
        if(!tool.firstCheckBox.isSelected()){
            tool.firstCheckBox.click();
        }

         for(WebElement each : tool.allFirstColumnCheckboxes){
             Assert.assertTrue("One of the checkboxes was not selected", each.isSelected());
         }

 */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement firstCheckbox = wait.until(ExpectedConditions.elementToBeClickable(tool.firstCheckBox));

        Assert.assertTrue("The first checkbox is not enabled", firstCheckbox.isEnabled());

        if (!firstCheckbox.isSelected()) {
            firstCheckbox.click();
        }

        // Wait for all checkboxes to be selected
        for (WebElement each : tool.allFirstColumnCheckboxes) {
            wait.until(ExpectedConditions.elementToBeSelected(each));
            Assert.assertTrue("One of the checkboxes was not selected", each.isSelected());
        }
    }



}
