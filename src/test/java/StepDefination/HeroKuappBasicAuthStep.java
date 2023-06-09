package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.pageobjects.HerokuappBasicAuthPage;
import org.example.utilities.Initialize;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuappBasicAuthStep {
    public WebDriver driver = Initialize.driver;
    public HerokuappBasicAuthPage herokuappBasicAuthPage;


    @Given("User opens URL{string}")
    public void user_opens_url(String url) {
        driver.get("URL");


    }
    @When("User click on {string} link")
    public void user_click_on_link(String linktext) {
       driver.findElement(By.linkText(linktext)).click();
    }

        @When("User click on the BasicAuth")
    public void user_click_on_BasicAuth(){
        herokuappBasicAuthPage.clickonBasicauthlink();

        }
    @Then("User should see {string} text on the page")
    public void user_should_see_text_on_the_page(String exptext) {
     String pagetext = driver.getPageSource().trim();
        Assert.assertTrue(pagetext.contains(exptext));
    }









}
