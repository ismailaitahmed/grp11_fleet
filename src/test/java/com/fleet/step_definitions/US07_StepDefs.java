package com.fleet.step_definitions;

import com.fleet.pages.US07_MainPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class US07_StepDefs {

    US07_MainPage mainPage = new US07_MainPage();

    @When("user click vehicles from fleet menu GT")
    public void user_click_vehicles_from_fleet_menu_gt() throws InterruptedException {

        mainPage.Fleet.click();

        Thread.sleep(1000);

        mainPage.Fleet_vehicles.click();


    }
    @Then("user can see all the cars unselected GT")
    public void user_can_see_all_the_cars_unselected_gt() {
        System.out.println("Before Click mainPage.mainCheckBox.isSelected() = " + mainPage.mainCheckBox.isSelected());


    }

    @Then("user select fist check box GT")
    public void user_select_fist_check_box_gt() throws InterruptedException {

        Thread.sleep(3000);
        mainPage.mainCheckBox.click();

    }
    @Then("user can see all the cars selected GT")
    public void user_can_see_all_the_cars_selected_gt() {
        System.out.println("After click mainPage.mainCheckBox.isSelected() = " + mainPage.mainCheckBox.isSelected());


    }
    @Then("verify user can select any random car from the table GT")
    public void verify_user_can_select_any_random_car_from_the_table_gt() {
        if (!mainPage.checkboxes.isEmpty()) { // Check if checkboxes are found
            Random random = new Random();
            int randomIndex = random.nextInt(mainPage.checkboxes.size()); // Get a random index

            WebElement randomCheckbox = mainPage.checkboxes.get(randomIndex);
            if (!randomCheckbox.isSelected()) { // Ensure it is not already selected
                randomCheckbox.click();
            }
        } else {
            System.out.println("No checkboxes found!");
        }


    }


}
