package org.example.pageobjects;

import org.example.utilities.Initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropdownPage extends Initialize {
    public WebDriver driver = Initialize.driver;
    private Integer int1;

    public DropdownPage(){}

    public void selectOptionFromDropdownListUser(Integer int1)throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        this.int1 = int1;
        WebElement dropdown = driver.findElement(By.xpath("//select[@id = 'dropdown']"));
        Select selectObject = new Select(dropdown);
        selectObject.selectByIndex(1);
        Thread.sleep(2000);
        //selectObject.selectByValue("2");
        selectObject.selectByVisibleText("Option 2");
        Thread.sleep(2000);

    }

}
