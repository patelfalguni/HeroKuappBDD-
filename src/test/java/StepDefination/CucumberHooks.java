package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.utilities.Initialize;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CucumberHooks extends Initialize {

    @Before
    public void openBrowser() throws Exception {

        if(browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();


            options.addArguments("--remote-allow-origins=*");


            driver = new ChromeDriver(options);
        } else if(browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "../BDDCucumber/src/test/java/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    @After
    public void closeBrowser() throws Exception {
//        driver.close();
    }
}
