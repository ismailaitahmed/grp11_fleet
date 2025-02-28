package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US10_CalenderEventsPage {

    public US10_CalenderEventsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement activitiesModule;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEvents;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalendarEventBtn;

    @FindBy(xpath = "//iframe[@id='oro_calendar_event_form_description-uid-67c1e5bb03c04_ifr']")
    public WebElement tinyIframe;

    @FindBy(xpath = "//body[@id='tinymce']//p")
    public WebElement descriptionBox;






}
