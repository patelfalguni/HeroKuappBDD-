package StepDefination;

import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pageobjects.SkySignUpPage;
import org.example.utilities.Initialize;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkySignUpStep {
    public WebDriver driver = Initialize.driver;
    public SkySignUpPage skySignUpPage;
    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        skySignUpPage = new SkySignUpPage(driver);

    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);


    }
    @When("User click on the Signup button")
    public void user_click_on_the_signup_button() {
        skySignUpPage.clickonSignupButton();

    }
    @Then("Signup page should be display properly")
    public void signup_page_should_be_display_properly() {



    }
    @Then("close browser")
            public void close_browser(){
        driver.close();
        driver.quit();
    }
}





