package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobjects.HeroKuappCheckboxesPage;
import org.example.utilities.Initialize;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuappCkeckboxesStep {
    public WebDriver driver = Initialize.driver;
    public HeroKuappCheckboxesPage heroKuappCheckboxesPage = new HeroKuappCheckboxesPage();





    @When("User click on {string}")
    public void user_click_on(String linktext) {
        driver.findElement(By.linkText(linktext)).click();

    }




    @Then("User should see {string} logo on the page")
    public void user_should_see_logo_on_the_page(String string) {



    }

    @Then("User verify checkbox1")
    public void user_verify_checkbox1() {
        heroKuappCheckboxesPage.verifyCheckbox();

    }
    @Then("User verify checkbox2")
    public void user_verify_checkbox2() {
        heroKuappCheckboxesPage.verifyCheckbox();


    }


//    @And("User click on checkbox {int}")
//    public void userClickOnCheckbox(Integer number) {
//        heroKuappCheckboxesPage.clickonCheckbox(number);
//    }
    @When("User click on checkbox {int}")
    public void user_click_on_checkbox(Integer int1) {
        heroKuappCheckboxesPage.clickonCheckbox(int1);

    }

}







