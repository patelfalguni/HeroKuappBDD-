package org.example.pageobjects;

import org.example.utilities.Initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappBasicAuthPage extends Initialize {
    public HerokuappBasicAuthPage(WebDriver driver) {
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth)");
        driver.manage().window().maximize();

    }





public void clickonBasicauthlink(){
    driver.findElement(By.linkText("Basic Auth")).click();

}
}
