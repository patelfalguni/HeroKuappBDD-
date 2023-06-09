package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobjects.FormAuthenticationPage;
import org.example.utilities.Initialize;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationStep{
    public WebDriver driver = Initialize.driver;

   public FormAuthenticationPage FormAuthentication = new FormAuthenticationPage(driver);

    @Given("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }
    @When("User click on the {string} link")
    public void user_click_on_the_link(String string) {


    }
    @Then("User should arrive on Login Page")
    public void user_should_arrive_on_login_page() {

    }
    @Then("User enter valid {string} and {string}")
    public void userEnterValidAnd(String username, String password) {
        FormAuthentication = new FormAuthenticationPage(driver);
        FormAuthentication.enterUsername(username);
        FormAuthentication.enterPassword(password);
    }

    @Then("User click on the Login button")
    public void user_click_on_the_login_button() {
        FormAuthentication.clickLogin();

    }
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
    FormAuthentication.checkLogoutDisplayed();
    }

    @Then("User enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        FormAuthentication = new FormAuthenticationPage(driver);
        FormAuthentication.enterUserInvalid(username, password);


    }




    }

