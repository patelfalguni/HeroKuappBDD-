package StepDefination;

import io.cucumber.java.en.Then;
import org.example.pageobjects.ForgotPasswordPage;
import org.example.utilities.Initialize;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordStep {
    public WebDriver driver = Initialize.driver;
    public ForgotPasswordPage ForgotPassword = new ForgotPasswordPage();

    @Then("User should arrive on Forgot Password page")
    public void user_should_arrive_on_forgot_password_page() {

    }
    @Then("User click on Retrieve password button")
    public void user_click_on_retrieve_password_button() {
        ForgotPassword.clickRetrievePassword();

    }

}
