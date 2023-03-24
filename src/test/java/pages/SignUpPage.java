package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NazimSignUpPage {
    public NazimSignUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//b")
    public WebElement EnterAccountInfoText;

    @FindBy(xpath = "//input[@data-qa='first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@data-qa='last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@data-qa='company']")
    public WebElement companyNameBox;

    @FindBy(xpath = "//input[@data-qa='address']")
    public WebElement addressBox;

    @FindBy(xpath = "//input[@data-qa='address2']")
    public WebElement addressBox2;

    @FindBy(xpath = "//input[@data-qa='state']")
    public WebElement stateBox;

    @FindBy(xpath = "//input[@data-qa='city']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@data-qa='zipcode']")
    public WebElement zipcodeBox;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrRadio;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath ="//input[@name='newsletter']")
    public WebElement newstallerCheckBox;

    @FindBy(xpath = "//input[@name='optin']")
    public WebElement offersCheckBox;





}
