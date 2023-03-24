package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@style='color: orange;']")
    public WebElement homePageButton;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[contains(text(),' Logged in as ')]")
    public WebElement loggedInAs;

    @FindBy(xpath = "//a//i[@class='fa fa-trash-o']")
    public WebElement deleteAccountButton;






}
