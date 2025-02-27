package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesCostsUS13_RH {

    public VehiclesCostsUS13_RH(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetDropdown;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCostsOption;

    @FindBy(xpath  ="//button//input[@type='checkbox']")
    public WebElement firstCheckBox;
    ////table//tbody//td[@class='select-row-cell renderable grid-cell grid-body-cell grid-body-cell-massAction']

    @FindBy (xpath = "//table//tbody//td//input[@data-role='select-row-cell']")
    public List<WebElement> allFirstColumnCheckboxes;

}
