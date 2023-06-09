package org.example.pageobjects;


import com.sun.source.tree.AssertTree;
import dev.failsafe.internal.util.Assert;
import org.example.utilities.Initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;


public class HeroKuappCheckboxesPage extends Initialize {
    public WebDriver driver = Initialize.driver;


    private String checkbox = "//form[@id='checkboxes']/input[%d]";






    public void clickonCheckbox(Integer box){
        driver.findElement(By.xpath(String.format(checkbox,box))).click();


    }
    public void verifyCheckbox(){




    }


}
















