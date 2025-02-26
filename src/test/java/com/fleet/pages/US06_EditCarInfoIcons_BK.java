package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_EditCarInfoIcons_BK {
    WebDriver driver;
    public US06_EditCarInfoIcons_BK() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Vehicles")
    public WebElement Vehicles;

    @FindBy(linkText = "Fleet")
    public WebElement Fleet;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody//tr[1]//td[20][1]")
    public WebElement threeOptions1;



}








