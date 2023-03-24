package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NazimAccountCreatedPage {
    public NazimAccountCreatedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h2//b")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa]")
    public WebElement continueButton;


}
