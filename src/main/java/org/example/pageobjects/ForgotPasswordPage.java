package org.example.pageobjects;

import org.example.utilities.Initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ForgotPasswordPage extends Initialize {
    public WebDriver driver = Initialize.driver;

    By btn_RetrievePassword;

    {
        btn_RetrievePassword = new By.ByXPath("//i[@class = 'icon-2x icon-signin']");
    }


    public void clickRetrievePassword() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(btn_RetrievePassword).click();
    }
}
