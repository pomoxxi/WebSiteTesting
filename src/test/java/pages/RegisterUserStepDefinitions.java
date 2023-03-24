package pages;

import utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserStepDefinitions {
    HomePage nazimHomePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();
    AccountCreatedPage nazimAccountCreatedPage = new AccountCreatedPage();
    DeleteAccountPage nazimDeleteAccountPage = new DeleteAccountPage();
    IframeCancelPage iframeCancelPage = new IframeCancelPage();


    Faker faker = new Faker();
    @Given("User is on the home page and verify it")
    public void user_is_on_the_home_page_and_verify_it() {
        Driver.getDriver().get("https://automationexercise.com/");

        String color = nazimHomePage.homePageButton.getCssValue("color");
        String actualColor = Color.fromString(color).asHex();

        String expectedColor = "#ffa500";

        Assert.assertEquals(expectedColor,actualColor);

    }
    @When("User should click Signup \\/ Login")
    public void user_should_click_signup_login() {
        nazimHomePage.signupButton.click();

    }
    @When("User should see New User Signup!")
    public void user_should_see() {
        String expectedText = "New User Signup!";
        String actualText = loginPage.newUserSignupText.getText();

        Assert.assertEquals(expectedText,actualText);

    }
    @When("User should enter Name and Email")
    public void user_should_enter_and() {

        String name = faker.name().name();
        loginPage.name.sendKeys(name);

        String email = faker.name().firstName() + "@email";
        loginPage.email.sendKeys(email);

    }
    @When("User should click Signup button")
    public void user_should_click_button() {
        loginPage.signupButton.click();

    }
    @When("User should see Enter Account Information")
    public void user_sees() {

        String expectedText = "Enter Account Information";
        String actualText = signUpPage.EnterAccountInfoText.getText();

    }
    @When("User should fill details: firstName, lastName, Company, address, address2, country, State, city, zipcode, mobileNumber")
    public void user_should_fill_details() {

        String name = faker.name().firstName();
        signUpPage.firstNameBox.sendKeys(name);

        String lastName = faker.name().lastName();
        signUpPage.lastNameBox.sendKeys(lastName);

        String company = faker.company().name();
        signUpPage.companyNameBox.sendKeys(company);

        String address = faker.address().fullAddress();
        signUpPage.addressBox.sendKeys(address);

        String address2 = faker.address().secondaryAddress();
        signUpPage.addressBox2.sendKeys(address2);

        Select drpCountry = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='country']")));
        drpCountry.selectByVisibleText("Australia");

        String state = faker.address().state();
        signUpPage.stateBox.sendKeys(state);

        String city = faker.address().city();
        signUpPage.cityBox.sendKeys(city);

        String zipcode = faker.address().zipCode();
        signUpPage.zipcodeBox.sendKeys(zipcode);

        String mobilNumber = faker.phoneNumber().phoneNumber();
        signUpPage.mobileNumberBox.sendKeys(mobilNumber);
    }
    @When("User should click Create account button")
    public void user_should_click() {
        signUpPage.createAccountButton.click();

    }
    @When("User should fill details: Title, Name, Email, Password, Date of birth")
    public void user_should_fill_details_title_name_email_password_date_of_birth() {

        signUpPage.mrRadio.click();

        String password = faker.name().firstName();
        signUpPage.passwordBox.sendKeys(password);

        Select drpDays = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='days']")));
        drpDays.selectByVisibleText("5");
        Select drpMonths = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='months']")));
        drpMonths.selectByVisibleText("February");
        Select drpYears = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='years']")));
        drpYears.selectByVisibleText("1990");

    }
    @When("User should select checkbox Sign up for our newsletter!")
    public void user_should_select_checkbox_sign_up_for_our_newsletter() {
        signUpPage.newstallerCheckBox.click();

    }
    @When("User should select checkbox Receive special offers from our partners!")
    public void user_should_select_checkbox_receive_special_offers_from_our_partners() {
        signUpPage.offersCheckBox.click();

    }

    @Then("User should see ACCOUNT CREATED! message")
    public void user_should_see_ACCOUNT_CREATED_message() {

    String expectedMessage = "ACCOUNT CREATED!";
    String actualMessage = nazimAccountCreatedPage.accountCreatedText.getText();

    Assert.assertEquals(expectedMessage,actualMessage);
    }
    @When("User clicks Continue button")
    public void user_clicks_continue_button() {
        nazimAccountCreatedPage.continueButton.click();

    }
    @Then("User should click cancel for the pop-up add")
    public void userShouldClickCancelForThePopUpAdd() {
        Driver.getDriver().switchTo().frame("aswift_1").switchTo().frame("ad_iframe");
       WebElement dismissButton =  Driver.getDriver().findElement(By.xpath("//div[@id='dismiss-button']"));
       dismissButton.click();

    }


    @When("User should see logged in as username")
    public void user_should_see_logged_in_as_username() {
       // nazimHomePage.loggedInAs.isDisplayed();

    }
    @When("user clicks Delete Account button")
    public void user_clicks_button() {
        nazimHomePage.deleteAccountButton.click();

    }
    @Then("User should see ACCOUNT DELETED! message")
    public void user_should_see_message() {

        String expectedText = "ACCOUNT DELETED!";
        String actualText = nazimDeleteAccountPage.accountDeletedText.getText();

        Assert.assertEquals(expectedText,actualText);

    }
    @Then("User should be able to click continue button")
    public void user_should_be_able_to_click_button() {
        nazimAccountCreatedPage.continueButton.click();

        Driver.getDriver().switchTo().frame(1);



    }


}
