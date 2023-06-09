package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {
    public DeleteAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2//b")
    public WebElement accountDeletedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;
}
