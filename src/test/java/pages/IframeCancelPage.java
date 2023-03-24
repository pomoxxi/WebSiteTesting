package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframeCancelPage {
    public IframeCancelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='ns-gwtvw-e-7']")
    public WebElement cancelButton;

}
