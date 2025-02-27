package com.fleet.step_definitions;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class US06_EditCarInfoIcons_BK {
    WebDriver driver = Driver.getDriver();


    com.fleet.pages.US06_EditCarInfoIcons_BK editCar = new com.fleet.pages.US06_EditCarInfoIcons_BK();

    @When("user click vehicles from fleet menu")
    public void user_click_vehicles_from_fleet_menu() throws InterruptedException {
        editCar.Fleet.click();
        Thread.sleep(1000);
        editCar.Vehicles.click();



    }
    @Then("user click  edit car info icons")
    public void user_click_edit_car_info_icons(){

       WebElement threeOptions = driver.findElement(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']/tbody//tr[1]//td[20][1]"));

        Actions action = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        action.moveToElement(threeOptions).perform();

    }
    @Then("user should see view, delete and edit options")
    public void user_should_see_view_delete_and_edit_options() {

        Assert.assertTrue(editCar.threeOptions1.isDisplayed());

    }
}
