package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobjects.DropdownPage;
import org.example.utilities.Initialize;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DropdownStep {
    public WebDriver driver = Initialize.driver;
    public DropdownPage DropdownPage =  new DropdownPage();











    @Then("User should arrive on Dropdown page")
    public void user_should_arrive_on_dropdown_page() {

    }


    @Then("User select Option {int} from Dropdown List")
    public void user_select_option_from_dropdown_list(Integer int1)throws InterruptedException {
        DropdownPage.selectOptionFromDropdownListUser(int1);


    }
}
