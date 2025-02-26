package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US07_MainPage {
    public US07_MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//*[@class='title title-level-1'])[2]")
    public WebElement Fleet;

    @FindBy(xpath = "(//*[@class='title title-level-2'])[3]")
    public WebElement Fleet_vehicles;

    @FindBy(xpath = "//table[contains(@class, 'grid')]/thead/tr/th//input[@type='checkbox']")
    public WebElement mainCheckBox;


    //table[@class='grid table-hover table table-bordered table-condensed']/thead/tr/th//input[1]

    @FindBy(xpath = "//table[contains(@class, 'grid')]//td[contains(@class, 'select-row-cell')]//input[@type='checkbox']")
    public List<WebElement> checkboxes;




}
