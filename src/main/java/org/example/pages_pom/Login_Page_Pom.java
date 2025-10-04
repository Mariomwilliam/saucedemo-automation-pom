package org.example.pages_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page_Pom {

    //Locators
    By username = By.id("user-name");
    By password = By.id("password");
    By login_button = By .id("login-button");

    WebDriver driver;

    // Constructor
    public Login_Page_Pom(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void Send_Username(String name)
    {
        driver.findElement(username).sendKeys(name);
    }
    public void  Send_Pass(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }
    public void button_click(){
        driver.findElement(login_button).click();
    }
    public void login_page(String username,String Pass){

        this.Send_Username(username);
        this.Send_Pass(Pass);
        this.button_click();
    }
    public boolean isErrorVisible() {
        return driver.getPageSource().contains("Epic sadface");
    }

    }
