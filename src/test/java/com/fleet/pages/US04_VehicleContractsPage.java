package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US04_VehicleContractsPage {

   public US04_VehicleContractsPage(){

       PageFactory.initElements(Driver.getDriver(), this);

   }
   @FindBy(xpath = "(//*[@class='title title-level-1'])[2]")
   public WebElement fleetDropdown;

   @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContracts;

   @FindBy(xpath = "//h1[normalize-space(text())='All Vehicle Contract']")
    public WebElement contractsPageHeader;

   @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement warningMessage;


}
