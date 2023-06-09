package org.example.pageobjects;

import org.example.utilities.Initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage extends Initialize
{
    public WebDriver driver = Initialize.driver;



    By text_username;



    {
        text_username = By.xpath("//input[@id='username']");
    }

    By text_password;
    {
        text_password = By.xpath("//input[@id='password']");
    }

    By btn_login = By.xpath("//button[@type='submit']");
    By btn_logout;
    {
      btn_logout = By.xpath("//a[@class='button secondary radius']");
    }
    public FormAuthenticationPage(WebDriver driver){
        Initialize.driver = driver;

    }


    public void enterUsername(String username){
       driver.findElement(text_username).sendKeys(username);

    }
    public void enterPassword(String password){
        driver.findElement(text_password).sendKeys(password);

   }
   public void clickLogin(){
        driver.findElement(btn_login).click();

    }

    public void checkLogoutDisplayed(){
       driver.findElement(btn_logout).isDisplayed();
    }

    public void enterUserInvalid(String username,String password){


        driver.findElement(text_username).sendKeys(username);

        driver.findElement(text_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }




}



