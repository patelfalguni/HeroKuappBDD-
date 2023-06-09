import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = "StepDefination",
        dryRun = false,
        monochrome = true,
        tags = "@TestSix",
        plugin = {"pretty", "html:target/cucumber-report.html"})



public class RunCucumberDemoTest {
}
